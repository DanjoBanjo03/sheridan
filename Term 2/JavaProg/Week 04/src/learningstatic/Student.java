package learningstatic;

public class Student {
    public String name;
    public int studentNumber;
    public String school; // ⁡⁢⁢⁡⁢⁡⁢⁣⁢2⁡.⁡ ⁡ ⁡⁢⁢⁣hmmm, what if we make this static?

    public void study(String subject)
    {
        System.out.println(name + " is studying " + subject + " at " + this.school);
    }

    // ⁡⁣⁢⁢Part B⁡ -let's make a static method called largest that will return the largest of two ints --what happens if we try to access our name instance variable?  BTW, check out Math.max

}
