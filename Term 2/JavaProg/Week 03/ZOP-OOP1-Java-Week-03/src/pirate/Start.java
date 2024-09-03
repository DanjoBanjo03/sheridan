package pirate;

public class Start {
    public static void main(String[] args)
    {
        //Let's Build a Pirate!  We should know our Pirate's name and our Pirate should be able drawSword and to speak like a pirate (note that the complete code is in thepriatecomplete package)

        Pirate p1 = new Pirate(); //uh oh!  Better write the instructions to build a Pirate!
        p1.name = "Captain Crunch";

        String sentenceForPirateToSpeak = "please pass the salt";
        //we would like to turn this sentence into "arrrrrrrr, please pass the salt, you scurvy dog!"
        //hmmm...the speak method in the Pirate class can't see this variable
        //if only there was some way that we could pass this sentence into the method!

        //let's add a method called shootPistol that accepts an int, representing how many times to shoot the pistol and a String that represents the soundEffect that the pistol will make when it shoots.  (Can you make the pistol sound like a pistol (BANG!)  ?  Can you make it sound like a blaster from an Imperial Trooper (pewww pewww)?

        //Finally, what if we wanted our Pirate to translate a sentence into Pirate talk but, instead of saying it, return a String with the translation back to this method so that we can use it here?

        //Let's run the whole thing through the debugger!

        //Hey, wanna blow up the stack? Let's write a method in Pirate that keeps calling itself until the JVM builds so many stack frames that it runs out of memory
    }
}
