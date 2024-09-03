package trycatch;

import java.util.Random;

public class LearnExceptions {

    public String riskyMethodCallingADatabase()
    {
        //If we uncomment these lines, our method has a 50/50 chance of throwing an Exception
        // Random rnd = new Random();
        // if (rnd.nextBoolean()) {  //  50/50 chance of the database throwing an exception instead of the returning a String
        //     throw new Exception("Database connection Error");
        // }

        return "This it the record from the database!";
    }
}
