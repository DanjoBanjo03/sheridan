package yourturn3complete;

import java.util.Random;

public class GuessingGame {
    private int secretNumber;

    public GuessingGame(int upperBound) {
        Random rnd = new Random();
        this.secretNumber = rnd.nextInt(upperBound);
    }

    public String makeGuess(int guess)
    {
        String response = "You guessed " + guess;
        int delta = guess - secretNumber;
        if (delta == 0)
        {
            response += "  Great guess!!!  You got it!";
        }
        else if (delta > 0)
        {
            response += " Your guess was too high by " + delta;
        }
        else
        {

            delta = Math.abs(delta);
            response += " Your guess was too low by " + delta;
        }
        return response;
    }
}
