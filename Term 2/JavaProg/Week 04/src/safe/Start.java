package safe;

public class Start {
    public static void main(String[] args)
    {
        /*  ⁡⁢⁣⁢Read me!  ->⁡
         We would like to build a Safe object that will allow us to place secret messages inside...
         Let's list all of the things that a real safe can do:
            - set combination
            - enter combination
            - unlock safe
            - open safe
            - close safe
            - put something into safe
            - take something out of safe
            - sound alarm if incorrect code is entered
        
            In our safe, we're going to use **abstraction to simplify our safe:
            - we will set the combination in the Constructor method (an int)
            - we will have a putMessageInSafe that will accept an int (the combination) and a String (the message)
            - we will have a retrieveMessageFromSafe that will accept an int (the combination)and will return a String (the message)  **Abstraction will become more important when we start looking at polymorphism
        
            - Notice that, withought encapsulation, our safe is useless as anyone can read the secret message
        
            We could also get fancy and sound alarm after three incorrect combinations in a row if we like
         */

        Safe safe = new Safe(1234);
    }
}
