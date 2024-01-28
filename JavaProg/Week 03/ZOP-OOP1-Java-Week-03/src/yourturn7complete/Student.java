package yourturn7complete;

/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Student {
   public String name;
   public int studentNumber;
   public int gradePercent;

   public void study(String subject)
   {
      System.out.println(this.name + " is studying " + subject);
   }
}
