package piratecomplete;

public class Pirate {

    public String name;

    public void drawSword()
    {
        System.out.println(name + "draws sword!");
    }

    public void speak(String sentence)
    {
        System.out.println(name + "says, Arrrrrrr, " + sentence + ", you scurvy dog!");
    }

    public void shootPistol(int howManyTimes, String soundEffect)
    {
        for (int i = 0; i < howManyTimes; i++)
        {
            System.out.println(soundEffect);
        }
    }

    public String translateToPirate(String sentence)
    {
        String returnValue = "Translation:  Arrrrrrr, " + sentence + ", you scurvy dog!";
        return returnValue;
    }
}
