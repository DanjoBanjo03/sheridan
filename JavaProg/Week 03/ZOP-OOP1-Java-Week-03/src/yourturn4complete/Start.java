package yourturn4complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Start {
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.model = "Audi S5";
        c1.year = 2015;
        c1.honk();
        System.out.println("Is the engine of the " + c1.model + " running? " + c1.engineRunning);

        Car c2 = new Car();
        c2.model = "Lexus NSX";
        c2.year = 2011;
        c2.honk();
        System.out.println("Is the engine of the " + c2.model + " running? " + c2.engineRunning);

        Car c3 = new Car();
        c3.model = "Ford Mustang";
        c3.year = 2015;
        c3.honk();
        System.out.println("Is the engine of the " + c3.model + " running? " + c3.engineRunning);

        c1.startEngine();
        System.out.println("Is the engine of the " + c1.model + " running? " + c1.engineRunning);
        c2.startEngine();
        System.out.println("Is the engine of the " + c2.model + " running? " + c2.engineRunning);
        c1.stopEngine();
        System.out.println("Is the engine of the " + c1.model + " running? " + c1.engineRunning);
    }
}
