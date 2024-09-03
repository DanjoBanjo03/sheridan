package beckerrobots;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

public class Becker {
    public static void main(String[] args)
    {
        //Let's run this code!
        City city = new City(25, 25);
        Robot r2d2 = new Robot(city, 5, 5, Direction.EAST);
        r2d2.move();
        r2d2.move();

        //So, can you make the Robot do anything else?  Remember dot notation.  What other methods are available to us?
    }
}
