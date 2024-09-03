package yourturn2;

import java.util.Random;

public class PartE {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        System.out.println(rnd);

        String string1 = "Hello"; //this is how we can declare a String (just like it's a primitive)
        String string2 = new String("Hello"); //but this is what the compiler really does!  (Strings are objects!)

        //These are the same.  Notice that we didn't have to import String like we did for Random - That is because String is in the java.lang package which the compiler automatically looks for - Can you think of another class that you use A LOT that must be in that package?

        //⁡⁢⁣⁢Here is my challenge to you⁡...Prove that String is actually a class and not a primitive

        /* ⁡⁢⁢⁢Hint 1 -⁡ click here =>
            -printing out the variable won't work like it does with the rnd reference variable because Java will just print out the text stored in the String
        */

        /* ⁡⁢⁢⁢Hint #2 ⁡- click here =>
            If only there was some way to CAPITALIZE on your answer with toUpperCase!
            */

        /* ⁡⁢⁢⁢Hint #3⁡ - Click here =>
                what can we do with reference variables that we can't do with primitives?  You know...  DOT DOT DOT!
        */
    }
}
