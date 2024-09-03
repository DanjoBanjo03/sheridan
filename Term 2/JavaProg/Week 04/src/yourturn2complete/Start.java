package yourturn2complete;

public class Start {
    public static void main(String[] args) throws Exception
    {
        MarsLander lander = new MarsLander();
        lander.setThrust(-6);
        lander.land();
    }
}
