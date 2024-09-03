package piratecomplete;

public class Start {
    public static void main(String[] args)
    {
        //Let's Build a Pirate!  We should know our Pirate's name and our Pirate should be able drawSword and to speak like a pirate

        Pirate p1 = new Pirate(); //uh oh!  Better write the instructions to build a Pirate!
        p1.name = "Captain Crunch";
        p1.drawSword();

        String sentenceForPirateToSpeak = "please pass the salt";
        //we would like to turn this sentence into "arrrrrrrr, please pass the salt, you scurvy dog!"
        //hmmm...the speak method in the Pirate class can't see this variable
        //if only there was some way that we could pass this sentence into the method!
        p1.speak(sentenceForPirateToSpeak);

        //let's add a method called shootPistol that accepts an int, representing how many times to shoot the pistol and a String that represents the soundEffect that the pistol will make when it shoots.

        p1.shootPistol(5, "Bang!");

        //Finally, what if we wanted our Pirate to translate a sentence into Pirate talk but, instead of saying it, return the translation back to this method so that we can use it here?

        String translatedSentence = p1.translateToPirate(sentenceForPirateToSpeak);
        System.out.println(translatedSentence);
    }
}
