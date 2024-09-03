package passbyvalue;

public class Start {
    public static void main(String[] args)
    {

        //When we pass values to methods, we are just passing the value!  NOT THE VARIABLE!!!
        int num1 = 10;
        System.out.println(num1);
        PassingValues o1 = new PassingValues();
        o1.method1(num1);
        System.out.println(num1);

        num1 = o1.method2(num1);
        System.out.println(num1);

        //how about this though?
        OurObject objA = new OurObject(100);
        System.out.println(objA.getInstVar());
        o1.method3(objA);
        System.out.println(objA.getInstVar());

        //⁡⁢⁣⁢QUESTION:⁡  Is Java a pass by value or a pass by reference language

        /*⁡⁢⁢⁢Answer: =>⁡
         * 
         * This is a common interview question.  If fact, java passes all information to methods by VALUE.  However, sometimes those values being passes are the values of reference variables which are, in fact, addresses of objects.
         */
    }
}
