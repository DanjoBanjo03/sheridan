package yourturn2complete;

public class MarsLander {
    private int thrust;
    private int direction;

    public void setThrust(int thrust) throws Exception
    {
        if (thrust < 0)
        {
            throw new Exception("Illegal thrust set");
        }
        this.thrust = thrust;
    }

    public int getThrust()
    {
        return thrust;
    }

    public int getDirection()
    {
        return direction;
    }

    public void setDirection(int direction)
    {
        this.direction = direction;
    }

    public void land()
    {
        if (thrust < 0 || direction < 0 || direction > 360)
        {
            System.out.println("Kabooom!!!  You've just blown up the Mars Lander!");
        }
        else
        {
            {
                System.out.println("The Eagle has landed!");
            }
        }
    }

}
