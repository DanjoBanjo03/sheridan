import boto3

ec2 = boto3.client('ec2')

user_data_vm1 = """#!/bin/bash
yum update -y"""

user_data_vm2_vm3 = """#!/bin/bash
yum update -y
yum install docker -y
systemctl start docker
docker run -p 8081:80 -d nginx
docker run -p 8082:80 -d nginx
docker run --name mongodb1 -d -p 27017:27017 mongo"""

security_group_rules = [
    {
        'IpProtocol': 'tcp',
        'FromPort': 22,
        'ToPort': 22,
        'IpRanges': [{'CidrIp': '24.150.65.120/0'}]  # 192.168.86.28/0
    },
    {
        'IpProtocol': 'icmp',
        'FromPort': -1,
        'ToPort': -1,
        'IpRanges': [{'CidrIp': '24.150.65.120/16'}]  # 192.168.86.28/16
    },
    {
        'IpProtocol': 'tcp',
        'FromPort': 80,
        'ToPort': 80,
        'IpRanges': [{'CidrIp': '24.150.65.120/32'}]  # 192.168.86.28/32
    },
    {
        'IpProtocol': 'tcp',
        'FromPort': 8081,
        'ToPort': 8081,
        'IpRanges': [{'CidrIp': '0.0.0.0/0'}]
    },
    {
        'IpProtocol': 'tcp',
        'FromPort': 8082,
        'ToPort': 8082,
        'IpRanges': [{'CidrIp': '0.0.0.0/0'}]
    },
    {
        'IpProtocol': 'tcp',
        'FromPort': 27017,
        'ToPort': 27017,
        'IpRanges': [{'CidrIp': '0.0.0.0/0'}]
    }
]

def delete_security_group(group_name):
    try:
        response = ec2.describe_security_groups(GroupNames=[group_name])
        group_id = response['SecurityGroups'][0]['GroupId']
        ec2.delete_security_group(GroupId=group_id)
        print(f"Deleted security group '{group_name}'")
    except ec2.exceptions.ClientError as e:
        if e.response['Error']['Code'] == 'InvalidGroup.NotFound':
            print(f"Security group '{group_name}' not found")
        else:
            print(f"Error '{group_name}': {e}")


def create_security_group(group_name, description, vpc_id):
    response = ec2.create_security_group(
        GroupName=group_name,
        Description=description,
        VpcId=vpc_id
    )
    return response['GroupId']


def authorize_security_group_ingress(group_id, ip_permissions):
    ec2.authorize_security_group_ingress(
        GroupId=group_id,
        IpPermissions=ip_permissions
    )


def create_ec2_instance(image_id, instance_type, key_name, user_data, subnet_id, security_group_ids):
    response = ec2.run_instances(
        ImageId=image_id,
        InstanceType=instance_type,
        KeyName=key_name,
        UserData=user_data,
        SubnetId=subnet_id,
        SecurityGroupIds=security_group_ids,
        MaxCount=1,
        MinCount=1
    )
    instance_id = response['Instances'][0]['InstanceId']
    private_ip = response['Instances'][0]['PrivateIpAddress']
    
    subnet_info = ec2.describe_subnets(SubnetIds=[subnet_id])['Subnets'][0]
    subnet_cidr = subnet_info['CidrBlock']
    subnet_name = subnet_info['SubnetId']
    
    print(f"Instance ID is {instance_id} with Private IP {private_ip} In the Subnet {subnet_name} with CIDR {subnet_cidr}")
    
    return instance_id



def deploy_instances():
    sg_vm1_id = create_security_group('SG_VM1', 'Security Group for VM1', 'vpc-0063d9339e860e9ca')
    sg_vm2_id = create_security_group('SG_VM2', 'Security Group for VM2', 'vpc-0063d9339e860e9ca')
    sg_vm3_id = create_security_group('SG_VM3', 'Security Group for VM3', 'vpc-0063d9339e860e9ca')

    authorize_security_group_ingress(sg_vm1_id, security_group_rules)
    authorize_security_group_ingress(sg_vm2_id, security_group_rules)
    authorize_security_group_ingress(sg_vm3_id, security_group_rules)

    instance_vm1_id = create_ec2_instance('ami-0440d3b780d96b29d', 't2.micro', 'assignment2', user_data_vm1, 'subnet-0599dcee06fb7bff0', [sg_vm1_id])
    instance_vm2_id = create_ec2_instance('ami-0440d3b780d96b29d', 't2.micro', 'assignment2', user_data_vm2_vm3, 'subnet-0b2a25e74ff40d187', [sg_vm2_id])
    instance_vm3_id = create_ec2_instance('ami-0440d3b780d96b29d', 't2.micro', 'assignment2', user_data_vm2_vm3, 'subnet-0197fb22903ec32b6', [sg_vm3_id])

    print("Instances deployed successfully")
    

delete_security_group('SG_VM1')
delete_security_group('SG_VM2')
delete_security_group('SG_VM3')

deploy_instances()
