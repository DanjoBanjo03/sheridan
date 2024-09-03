package pizza;

/*
    Our PizzarOrder shoud track customerName, numberSlices (8, 12, or 16), topping1, topping2, topping3

    We should also be able to calculate the cost of the PizzaOrder (2.99 per slice) and print out an order receipt

    Remember, there are a ton of things that we could have included like customerAddress etc, but we've ABSTRACTED out those details since our pizza joint only serves pickup orders.

    hmmm....can you think of how someone could mess up our PizzaOrder?  let's go back to our slides

    OK  - We need to protect our code!!! Private, getters/setters, data shadowing, this

 */
public class Start {
    public static void main(String[] args)
    {
        // ⁡⁣⁢⁢Part A⁡ .

        PizzaOrder order1 = new PizzaOrder(); //write a PizzaOrder class so that we can instantiate this PizzaOrder object! 

        //uh oh...what if someone sets numSlices to -5?

        //back to slides

        // ⁡⁣⁢⁢Part B⁡ .
        //show getters/setters
        // back to slides

        // ⁡⁣⁢⁢Part C⁡  .
        //show constructors 
        //discuss default (empty) constructors
        //use static class variable to create unique orderNumbers
        //use degbugger!
    }
}
