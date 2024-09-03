package deeperenums;

public class Start {
    public static void main(String[] args)
    {
        System.out.println(Coin.NICKEL);

        //what if we wanted to know how much money a NICKEL, DIME, QUARTER are worth?
        //Go ahead and change our Coin enum to allow us to do this and then we'll do it together

        //Let's look at a slightly more complicated one
        Element element1 = Element.POTASSIUM;
        System.out.println(element1);
        System.out.println(element1.getSymbol());
    }
}
