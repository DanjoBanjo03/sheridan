package yourturn1;

public class HaHaHa {

    public static void main(String[] args) {
        // Instantiate JokeMachine
        JokeMachine jokeMachine = new JokeMachine();

        // Get and print multiple random jokes
        System.out.println("Multiple Random Jokes:\n" + jokeMachine.getMultipleRandomJokes(3));

        // Print the number of jokes in JokeMachine
        System.out.println("Number of jokes in JokeMachine: " + jokeMachine.howManyRandomJokesAreThere());

        // Print the world's funniest joke
        System.out.println("The world's funniest joke: " + jokeMachine.getWorldsFunniestJoke());
    }
}
