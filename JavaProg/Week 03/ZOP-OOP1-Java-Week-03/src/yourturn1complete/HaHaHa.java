package yourturn1complete;

public class HaHaHa {
    public static void main(String[] args)
    {
        JokeMachine jokeMachine = new JokeMachine();
        System.out.println("One joke:");
        System.out.println(jokeMachine.getRandomJoke());
        System.out.println("5 jokes:");
        System.out.println(jokeMachine.getMultipleRandomJokes(5));
        System.out.println("World's funniest joke:");
        System.out.println(jokeMachine.getWorldsFunniestJoke());
        System.out.println("There are " + jokeMachine.howManyRandomJokesAreThere() + " jokes");

    }
}
