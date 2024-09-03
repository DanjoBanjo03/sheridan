package mainmethod;

public class Start {

    public int instVar1;

    public static int classVar1;

    public static void main(String[] args)
    {
        instVar1 = 55; //Huh...let's think about this...have we made any objects?  Where to instance variables get stored during runtime?
        //We haven't instantiated any objects yet so we can't possibly have any instance variables!
        classVar1 = 66; //this works though

        Start.method1(); // well that makes sense because static methods don't need objects to run

        //Start.method2(); //hmmm...can't work because method2 is not static

        //We can instantiate the Start class into an object.  Now we can access method2 because we are calling it from this object.

        // Start a1 = new Start();

        // a1.method1();

        // a1.method2();

    }

    public static void method1()
    {
        System.out.println("Hi from the static method1!");
        //this.instVar1 = 99; //huh!  That makes sense, right?
    }

    public void method2()
    {
        System.out.println("Hi from the non-static method2");
        this.instVar1 = 10; // we can access our instVar from here because it is a method in the object!
    }
}
