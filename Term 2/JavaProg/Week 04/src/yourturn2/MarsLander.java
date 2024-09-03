package yourturn2;

/*⁡⁢⁣⁢  Click here to read directions!⁡
  The instance variables inside of our MarsLander object are not protected.  If we try to land the MarsLander, it will crash!!!

  Protect our data with getters and setters so that bad data will result in an Exception being immediately thrown!
 */

public class MarsLander {
    public int thrust;
    public int direction;

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
