package yourturn1complete;

import java.util.Random;

public class JokeMachine {
    public String[] jokes = {
            "I waited all night for the sun to come up...then it dawned on me!",

            "I couldn't figure out why the frisbee kept getting bigger...then it hit me!",
            "If your feet smell and your nose runs, you are built backwards!",
            "I couldn't remember how to throw a boomerang...then it started to come back to me",
            "I used to be a banker but I lost interest",
            "He drove his expensive car into a tree and found out how the Mercedes bends",
            "Have you ever tried to eat a clock? It's very time consuming.",
            "I did a theatrical performance about puns. Really it was just a play on words.",
            "My friend's bakery burned down last night. Now his business is toast.",
            "A new type of broom came out, it is sweeping the nation",
            "Show me a piano falling down a mineshaft and I'll show you A-flat minor",
            "Show me a piano falling onto a battlefied and I'll show you A-flat major!",
            "A bicycle can't stand on its own because it is two-tired.",
            "Don't trust people that do acupuncture, they're back stabbers.",
            "A grandmother called the hospital to check on a little boy who had swallowed some coins.  She was told,  'No change yet'.",
            "The roundest knight at king Arthur's round table was Sir Cumference."

    };

    public String getMultipleRandomJokes(int numJokes)
    {
        String returnValue = "";
        for (int floor = 0; floor < numJokes; floor++)
        {
            returnValue += floor + 1 + ": " + getRandomJoke() + "\n";
        }
        return returnValue;
    }

    public int howManyRandomJokesAreThere()
    {
        return jokes.length;
    }

    public String getWorldsFunniestJoke()
    {
        return "A photon walks into a hotel.  The desk clerk says 'would you like some help with your bags?'.  The photon says 'No thankyou, I'm travelling light!'";
    }

    public String getRandomJoke()
    {
        Random rnd = new Random();
        return jokes[rnd.nextInt(jokes.length)];
    }
}