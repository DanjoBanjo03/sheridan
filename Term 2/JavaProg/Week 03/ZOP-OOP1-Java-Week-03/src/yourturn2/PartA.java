package yourturn2;

import becker.robots.Robot;
import becker.robots.City;
import becker.robots.Thing;

public class PartA {
    public static void main(String[] args)
    {
        City city = new City(20, 20);
        new Thing(city, 6, 10);

        //Instantiate a Robot object called r2d2.  Note that, you must pass the city variable and coordinates of the robot, and the direction it will face.  These values will be (city, 6,4, Direction.EAST)  <-- we will learn more about this soon!

        //Don't forget that you have to import Robot at the top of the file! Take a look at the imports for City, Direction and Thing

        //Write the code to make r2d2 stand on the yellow dot - you will need more than just the move method to get there.  How can you explore the methods available to you in the Robot class?

    }
}
