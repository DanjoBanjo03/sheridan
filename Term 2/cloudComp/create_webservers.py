import boto3

ec2 = boto3.client('ec2')
subnet_ids = [subnet['SubnetId'] for subnet in ec2.describe_subnets()['Subnets']]

key_pair_name = 'assignment1'

for subnet_id in subnet_ids:
    ec2_resource = boto3.resource('ec2')
    instance = ec2_resource.create_instances(
        ImageId='ami-0e731c8a588258d0d',
        InstanceType='t2.micro',
        MaxCount=1,
        MinCount=1,
        SubnetId=subnet_id,
        UserData="""#!/bin/bash
                sudo yum install httpd -y

                sudo systemctl restart httpd

                echo "Content-Type: text/html"
                echo ""
                echo "<html><body>"
                echo "<h1>Hi from $(hostname)!</h1>"
                echo "<p>Student Name: Daniel Bajenov</p>"
                echo "</body></html>"
 """,
        SecurityGroupIds=['sg-06784bb4da06e1158'],
        KeyName=key_pair_name
    )[0]
    print(f"Instance ID: {instance.id}, Subnet ID: {subnet_id}, Private IPv4 Address: {instance.private_ip_address}")

print("EC2 instances started")