package yourturn3complete;

public class Start {
    public static void main(String[] args)
    {
        GuessingGame game = new GuessingGame(5);
        System.out.println(game.makeGuess(3));
    }
}
