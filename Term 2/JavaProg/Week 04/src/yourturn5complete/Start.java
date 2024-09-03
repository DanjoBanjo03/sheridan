package yourturn5complete;

public class Start {
    public static void main(String[] args)
    {

        /*  ⁡⁢⁣⁢PART A: ⁡Click here to read: =>
        In this problem, you need to be a Java Detective!  You have been given the entire Start class.  However, all of the rest of the code is missing.  Your job is to look for clues in the code to help you to write all of the other code to make this code work and give you an output similar to below:
        
                 
        
        
        */

        Student s1 = new Student();
        s1.setStudentID(123);
        s1.setName("Bart");
        s1.setGpa(3.89);

        s1.printStudentRecord();

        String record = s1.getStudentRecord();
        System.out.println(record);

        /*  ⁡⁣⁢⁢Part B⁡ .
        Write a class called GradeManager that has two methods:
            GetNameOfBetterStudent which accepts two Student objects and returns the name of the Student with the best mark
            GetBestStudent which accepts two Student objects and returns the address of the Student with the best mark
            */

    }
}
