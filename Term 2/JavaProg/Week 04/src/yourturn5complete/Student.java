package yourturn5complete;

public class Student {
    private int studentID;
    private String name;
    private double gpa;

    public int getStudentID()
    {
        return studentID;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public void printStudentRecord()
    {
        System.out.println(this.toString());
    }

    public String getStudentRecord()
    {
        return this.toString();
    }

    public String toString()
    {
        return "\nName :" + name + "\nStudent ID: " + studentID + "\nGPA: " + gpa;
    }

}
