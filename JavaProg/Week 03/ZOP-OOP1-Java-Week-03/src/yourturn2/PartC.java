package yourturn2;

import java.util.Random;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

public class PartC {
    public static void main(String[] args)
    {
        City city = new City(20, 20);

        Robot r1 = new Robot(city, 5, 5, Direction.EAST);
        Robot r2 = new Robot(city, 6, 5, Direction.EAST);
        Robot r3 = new Robot(city, 7, 5, Direction.EAST);
        Robot r4 = new Robot(city, 8, 5, Direction.EAST);
        Robot r5 = new Robot(city, 9, 5, Direction.EAST);
        Robot r6 = new Robot(city, 10, 5, Direction.EAST);

        r1.setLabel("r1");
        r2.setLabel("r2");
        r3.setLabel("r3");
        r4.setLabel("r4");
        r5.setLabel("r5");
        r6.setLabel("r6");
        new Thing(city, 8, 10);
        Random rnd = new Random();
        new Thing(city, 9, rnd.nextInt(8) + 6);

        //make your r1 Robot walk forward 10 spaces - use a loop!

        //make your r2 Robot walk 5 spaces east and then turn around and walk 5 spaces west so it ends up on the same space, facing West

        //make your r3 Robot walk in a square with each side 5 spaces long, so that r3 ends up back where it started, facing South

        //make your r4 Robot pick up the Thing that is 5 spaces in front of it, and move it 5 more spaces before dropping it. Hint - you might want to explore the methods in Robot that have Thing in their name

        //r5 is to do the same thing as r4 but, this time, you don't know where the Thing might be.  Can you pick up and move the Thing to column 10?

        //SmartyPants only! make your r6 Robot walk 10 spaces diagonally right and up at a 45 degree angle

    }
}
