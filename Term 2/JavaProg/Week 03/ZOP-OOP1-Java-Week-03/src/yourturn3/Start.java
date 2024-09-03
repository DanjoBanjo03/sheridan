package yourturn3;

//Use the debugger to follow the flow of the program, to figure out where each variable is 

//stored in memory, and to prove that String c ="Hello" compiles to the same as String c = new String ("Hello")

//Did you notice that the thread of execution jumped to the Person class very briefly when we instantiated a new Person?  We'll be discussing why this happens soon!

public class Start {
   public static void main(String[] args)
   {
      int a = 7;
      boolean b = true;
      String c = "Hello";
      String d = new String("Hello");

      Person c1 = new Person();
      c1.age = 80;
      c1.name = "Rich";

      c1.eat();
      c1.sleep();
      c1.eatAndSleep();
   }
}
