package yourturn6complete;

/* ⁡⁢⁣⁢ANSWERS!⁡
 * Answer the following questions about this program in the comments below:
 * 1. Describe each variable in the program as to local vs instance, reference vs primitive,
 * what type it is, what value it contains, and where in the memory of the computer it is stored:
 *
 * c1, c2, c3:
 ******************* local variables (declared inside of a method),
 ******************* reference variables (type Car starts with a capital),
 ******************* type is Car,
 ******************* contains the addresses of three objects of Type car which are stored on the heap,
 ******************* are stored in the current stack frame since they are local variables.
 *
 * model:
 ******************* instance variable (declared at the class level)
 ******************* reference variable (type String starts with Capital) --we'll talk more about this later
 ******************* type is String
 ******************* contains the address of a String object which is stored on the heap
 ******************* is stored in the object of type Car since it is an instance variable
 * year:
 ******************** instance variable (declared at the class level)
 ******************** primitive variable (type int starts with lower case) --we'll talk more about this later
 ******************** type is int
 ******************** contains a number
 ******************** is stored in the object of type Car since it is an instance variable
 * engineRunning
 ******************** instance variable (declared at the class level)
 ******************** primitive variable (type starts with a lower case - stores a value that is true or false)
 ******************** type is boolean (true or false)
 ******************** contains either true or false
 ******************** is stored in the object of type Car since it is an instance variable
 * abc, xyz:
 ******************** local variables
 ******************** primitive variables (type int starts with lower case)
 ******************** type is int
 ******************** contains a number
 ******************** is stored in the current stack frame on the stack
 * <p>
 * What happens when we get to line the c1.honk() line?
 **** the JVM finds the c1 reference variable in the current stack frame (since it is a local variable)
 **** and uses the address stored inside it in order to jump to the Car object that is in heap. It then
 **** starts running the code in the honk() method. Since the program has just entered a new method, a
 **** new current stack frame is created. The first line in the honk() method declares a local variable
 **** (we know it's local because it is declared inside of a method) called abc which it stores in the current
 **** stack frame and which holds a value of 7. The method then prints out its message and ends.
 **** When the honk() method ends, the current stack frame is destroyed along with the local variable abc
 **** and the JVM jumps back to the next line in the main method of our program.
 *
 */

public class Start {
   public static void main(String[] args)
   {
      int xyz = 10;

      Car c1 = new Car();
      c1.model = "Audi S5";
      c1.year = 2015;
      c1.honk();
      System.out.println("Is the engine of the " + c1.model + " running? " + c1.engineRunning);

      Car c2 = new Car();
      c2.model = "Lexus NSX";
      c2.year = 2011;
      c2.honk();
      System.out.println("Is the engine of the " + c2.model + " running? " + c2.engineRunning);

      Car c3 = new Car();
      c3.model = "Ford Mustang";
      c3.year = 2015;
      c3.honk();
      System.out.println("Is the engine of the " + c3.model + " running? " + c3.engineRunning);

      c1.startEngine();
      System.out.println("Is the engine of the " + c1.model + " running? " + c1.engineRunning);
      c2.startEngine();
      System.out.println("Is the engine of the " + c2.model + " running? " + c2.engineRunning);
      c1.stopEngine();
      System.out.println("Is the engine of the " + c1.model + " running? " + c1.engineRunning);
   }
}
