package finalenumeratedtypes;

public class Start {
    public static void main(String[] args)
    {
        int num1 = 100; //what if we make num1 final?
        num1 = 50;
        System.out.println(num1);

        //there is a naming convention that suggests that we make all final variable names ALL_CAPS.  Java doesn't force this but it is a good idea to follow this so that the other programmers don't hide your lunch on you.

        //we can use final to represent things:
        final int SMALL = 1;
        final int MEDIUM = 2;
        final int LARGE = 3;

        //however, it is a pain to print it:
        System.out.println(SMALL);

        //ever think about boolean?  A boolean can only have 2 values.  This is a neat way to force the programmer to choose true or false.  The programmer can't assign "avocada" to a boolean.

        //Wouldn't it be cool to be able to limit the values that other programmers can assign to our variables?
        //let's look at our PizzaOrder - What would stop a calling method from setting topping1 to "rocks"?  Or worse, to "mushrooms"?

        //Let's build an enumerated type for our pizza toppings. We'll call it Toppings

        //notice that we can print them
        //System.out.println(Toppings.CHEESE);
        //We can also create Topping variables!
        //Toppings topping = Toppings.EXTRA_PINEAPPLE;
        //System.out.println(topping);
        //System.out.println(topping.ordinal()); //we can see which position it is in 

        //OK, let's change our PizzaOrder class

        // ⁡⁢⁣⁢QUESTION:⁡ turns out, enums are actually really powerful.  What if we wanted to charge different prices for different toppings?

        /* ⁡⁢⁢⁢ANSWER: =>⁡
         * 
         * We can actually assign any values we want to Enumerated Types... An enumerated type is actually a special kind of class but it is still a class with instance variables and constructors.  Remember that we have to make our constructor private
         * 
         */

    }
}
