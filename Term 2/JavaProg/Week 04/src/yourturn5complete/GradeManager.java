package yourturn5complete;

public class GradeManager {
    public static String getNameOfBetterStudent(Student student1, Student student2)
    {
        return (student1.getGpa() > student2.getGpa()) ? student1.getName() : student2.getName();
    }

    public static Student getBestStudent(Student student1, Student student2)
    {
        return (student1.getGpa() > student2.getGpa()) ? student1 : student2;
    }

}
