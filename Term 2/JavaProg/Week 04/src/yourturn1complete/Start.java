package yourturn1complete;

public class Start {
    public static void main(String[] args)
    {

        /*  ⁡⁢⁣⁢Instructions⁡ - ⁡⁣⁢⁢Part A⁡ .
        
        In the Utility class, write a method called getStringInput which will accept a String and return a String.  Use the passed in String as the prompt and create a JOPtionPane.showMethodDialog, passing it the prompt String.  Return the string that the user typed in.
        
        Next write a method called getIntInput that works exactly the same way but will return an int instead of a String.  Remember the Integer.parseInt will convert a String to an int.
        
        In this main method,  instantiate a Utility object and ask the user to type in their name and their favouring number.
        
        Finally, print out "Hello, <name>, your favourie number is <fav number>"
        */

        Utility util = new Utility();
        String name = util.getStringInput("What is your name?");
        int favNumber = util.getIntInput("What is your favourite number?");
        System.out.println("Hello,  " + name + ", your favourite number is " + favNumber);

        /*  ⁡⁢⁣⁢Instructions⁡ - ⁡⁣⁢⁢Part B⁡ .
        
               Let's change our Utility Class so that we don't have to instantiate a Utility object in order to call our two methods. Change the code in the main method to be able to use the methods directly without the need to instantiate an object
        */

        String name2 = Utility.getStringInput("What is your name?");
        int favNumber2 = Utility.getIntInput("What is your favourite number?");
        System.out.println("Hello,  " + name + ", your favourite number is " + favNumber);

    }
}
