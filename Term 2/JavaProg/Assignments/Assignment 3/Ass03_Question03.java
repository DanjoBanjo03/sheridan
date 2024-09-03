import java.util.Date;

class Student {
    private String department;
    private String school;
    private Date dateCreated;

    public Student(String department, String school) {
        this.department = department;
        this.school = school;
        this.dateCreated = new Date();
    }

    public String getDepartment() {
        return department;
    }

    public String getSchool() {
        return school;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}

class Courses extends Student {
    private double grade1;
    private double grade2;
    private double grade3;

    public Courses() {
        super("Computer Engineer", "Sheridan College");
    }

    public Courses(double grade1, double grade2, double grade3) {
        super("Computer Engineer", "Sheridan College");
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double getOverallGrade() {
        return grade1 + grade2 + grade3;
    }

    public double getAverageGrade() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public String toString() {
        return "Date Created: " + getDateCreated() + "\n" +
               "Department: " + getDepartment() + "\n" +
               "School: " + getSchool() + "\n" +
               "Courses Grade:\n" +
               "PROG217 = " + grade1 + "\n" +
               "PROG257 = " + grade2 + "\n" +
               "PROG104 = " + grade3 + "\n" +
               "Overall Grades = " + getOverallGrade() + "\n" +
               "Average Grade = " + String.format("%.2f", getAverageGrade()) + "\n";
    }
}

public class Ass03_Question03 {
    public static void main(String[] args) {
        Courses courses = new Courses(70.0, 85.0, 92.0);
        System.out.println(courses);
    }
}
