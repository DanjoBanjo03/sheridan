class Employee {
    private String name;
    private int id;
    private String department;
    private String position;


    public Employee() {
    }

    public Employee(String name, int id, String department, String position) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

public class Ass03_Question01 {
    public static void main(String[] args) {
        Employee myData = new Employee("Daniel", 1, "IT", "Software Engineer");
        Employee friendData = new Employee("John", 2, "IT", "Hardware Engineer");

        System.out.println("Your Information:");
        displayEmployeeData(myData);

        System.out.println("\nFriend's Information:");
        displayEmployeeData(friendData);
    }

    public static void displayEmployeeData(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Position: " + employee.getPosition());
    }
}