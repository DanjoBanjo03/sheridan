package yourturn6;

public class Car {
    public String model;
    public int year;
    public boolean engineRunning = false;

    public void honk()
    {
        int abc = 7;
        System.out.println("The " + this.model + " honks its horn...HONK!");
    }

    public void startEngine()
    {
        this.engineRunning = true;
    }

    public void stopEngine()
    {
        this.engineRunning = false;
    }
}
