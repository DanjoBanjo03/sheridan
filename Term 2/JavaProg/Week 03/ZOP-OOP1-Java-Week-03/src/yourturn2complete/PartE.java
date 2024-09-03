package yourturn2complete;

import java.util.Random;

public class PartE {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        System.out.println(rnd);

        String string1 = "Hello"; //this is how we can declare a String (just like it's a primitive)
        String string2 = new String("Hello"); //but this is what the compiler really does!  (Strings are objects!)

        //These are the same.  Notice that we didn't have to import String like we did for Random - That is because String is in the java.lang package which the compiler automatically looks for - Can you think of another class that you use A LOT that must be in that package?    

        //System must be in java.lang as we never have to import it!  This makes sense because System and String are used so much that we don't want to have to write imports for them every time!

        //Here is my challenge to you...Prove that String is actually a class and not a primitive

        System.out.println(string1.toUpperCase()); //Aha!  Classes have methods that we can call!

        // Hint -printing out the variable won't work like it does with the rnd reference variable because Java will just print out the text stored in the String

        //Hint #2 - If only there was some way to CAPITALIZE on your answer

        //Hint #3 - what can we do with reference variables that we can't do with primitives?  You know...  DOT DOT DOT!
    }
}
