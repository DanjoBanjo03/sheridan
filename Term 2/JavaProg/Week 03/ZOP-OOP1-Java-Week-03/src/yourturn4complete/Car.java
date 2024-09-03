package yourturn4complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Car {
   public String model;
   public int year;
   public boolean engineRunning = false;

   public void honk()
   {
      if (engineRunning)
      {
         System.out.println("The " + this.model + " honks its horn...HONK!");
      }
   }

   public void startEngine()
   {
      this.engineRunning = true;
      System.out.println("Engine is running");
   }

   public void stopEngine()
   {
      this.engineRunning = false;
      System.out.println("Engine is no longer running");
   }
}