package yourturn3;

public class Start {
    public static void main(String[] args)
    {

        /*  ⁡⁣⁢⁢Read Me!⁡ 
         
          Write a GuessingGame class with a constructor that takes an int.  Use that int as the upperBound of a random number that you will generate from 0-upperBound and store that random number in an instance variable called secretNumber
        
          Write a method called makeGuess that accepts an int and returns a String.  The code below should result in outputs similar to the following possiblities:
        
          You guessed 3  Great guess!!!  You got it!
          
          You guessed 3 Your guess was too high by 3
        
          You guessed 3 Your guess was too low by 1
        
         */

        GuessingGame game = new GuessingGame(5);
        System.out.println(game.makeGuess(3));
    }
}
