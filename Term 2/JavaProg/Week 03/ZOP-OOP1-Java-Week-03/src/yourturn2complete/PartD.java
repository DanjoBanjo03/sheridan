package yourturn2complete;

import java.util.Random;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

public class PartD {
    public static void main(String[] args)
    {
        City city = new City(20, 20);

        Robot r1 = new Robot(city, 5, 5, Direction.EAST);
        Robot r2 = new Robot(city, 6, 5, Direction.EAST);
        Robot r3 = new Robot(city, 8, 5, Direction.EAST);
        Robot r4 = new Robot(city, 11, 0, Direction.EAST);
        Random rnd = new Random();
        new Wall(city, 5, 9, Direction.WEST);
        new Wall(city, 6, rnd.nextInt(5) + 7, Direction.WEST);
        new Thing(city, 5, 11);
        r1.setLabel("r1");
        r2.setLabel("r2");
        r3.setLabel("r3");
        r4.setLabel("r4");
        for (int i = 0; i < 7; i++)
        {
            new Thing(city, 11, rnd.nextInt(8) + 1);
        }
        int wallLoc = rnd.nextInt(4) + 6;
        new Wall(city, 8, wallLoc, Direction.WEST);
        new Thing(city, 8, wallLoc);

        //make your r1 Robot walk forward, pick up the Thing at Street 5,Avenue11 and put it down at 5, 13 - uh oh...A wall!  Better avoid it
        for (int i = 0; i < 3; i++)
        {
            r1.move();
        }
        r1.turnLeft();
        r1.move();
        turnRight(r1);
        r1.move();
        turnRight(r1);
        r1.move();
        r1.turnLeft();
        r1.move();
        r1.move();
        r1.pickThing();
        r1.move();
        r1.move();
        r1.putThing();

        //uh oh!  The wall is now placed randomly in front of r2 so you can't count how far to move.  Looks like you'll have to use a sentinel loop.  If only there was a way to tell if there was a wall in front of you. (Hint - There is!)  Have r2 travel right up to the wall without crashing into it.

        while (r2.frontIsClear())
        {
            r2.move();
        }

        //  Make your r3 navigate around the randomly placed wall, pick up the randomly placed Thing and deposit it at avenue 13 - hint, we can check to see if r3 is on avenue 13!

        while (r3.getAvenue() != 13)
        {
            if (r3.canPickThing())
            {
                r3.pickThing();
            }
            if (r3.frontIsClear())
            {
                r3.move();
            }
            else
            {
                {
                    navigateAroundWall(r3);
                }
            }

        }

        //uh oh!  There are many Things in front of r4.  Can you make r4 pick up all of the Things, go to Avenue 10, and then deposit on Thing per intersection as you move forward, stopping when all Things have been dropped?  Hmmm...did some of the Things get left behind??? Hint - what if there is more than one Thing in an intersection?
        while (r4.getAvenue() < 10)
        {
            while (r4.canPickThing())
            {
                r4.pickThing();
            }
            r4.move();
        }

        while (r4.countThingsInBackpack() != 0)
        {
            r4.putThing();
            r4.move();
        }
    }

    public static void navigateAroundWall(Robot robot)
    {
        robot.turnLeft();
        robot.move();
        turnRight(robot);
        robot.move();
        turnRight(robot);
        robot.move();
        robot.turnLeft();
    }

    public static void turnRight(Robot robot)
    {
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
    }
}
