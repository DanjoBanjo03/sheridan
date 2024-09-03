package learningstatic;

public class Start {
    public static void main(String[] args)
    {
        // ⁡⁢⁣⁢1.⁡ ⁡⁢⁢⁣let's run the code below⁡
        Student s1 = new Student();
        s1.name = "Bart";
        s1.studentNumber = 1928;
        s1.school = "Sheridan";

        Student s2 = new Student();
        s2.name = "Lisa";
        s2.studentNumber = 11128;
        s2.school = "Fanshaw";

        Student s3 = new Student();
        s3.name = "Millhouse";
        s3.studentNumber = 4567;
        s3.school = "Humber";

        System.out.println(s1.school);
        System.out.println(s2.school);
        System.out.println(s3.school);

        // What if all of our students went to Sheridan?  Every object we instantiate will have space to store "Sheridan", won't they?  We could save some space if we made all Student objects share a variable that we put someplace else - let's goto step 2

        // System.out.println(Student.school);

        //hmmm...what happens when we run these methods?
        s1.study("java");
        s2.study("math");
        s3.study("CompSci");

        /*  ⁡⁢⁣⁢READ ME!⁡
         Notice what happened when we turned the name instance variable into a class variable by adding the word static to it?
        
         That variable is no longer an instance variable and no longer stored in the Person Objects.  
        
         Remember, that every Student object we make would have its own instance variables called name, studentID and school
        
         However, once we turned school into a class variable, there is only one school variable for all objects and school information is no longer stored in each object
        
         Think of a class variable as a global variable that all objects share and instance variables as variables that are unique to each object!
         */

        //BTW, we don't need to access a class variable from a reference variable, we can just use the class name to access it.  As a matter of fact, this is the preferred way to access a class variable

        // Person.school = "same school for every object";

        // ⁡⁣⁢⁢Part 2: ⁡ Static methods
    }
}
