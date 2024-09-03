package circus;

public class Start {
    public static void main(String[] args)
    {
        //⁡⁣⁢⁢Part A⁡

        Animal a1 = new Animal("Lion");
        System.out.println(a1.getAnimalType());

        //hmmmm...what went wrong???  Why didn't it print Lion?!
        //Let's fix it!
        //Ok, that is working, but what if the programmer typed this?

        //Animal a2 = new Animal("Stapler");  //hmmmm...how could we prevent this?

        /*⁡⁢⁢⁢Answer:⁡
         * Create an enumerated type called AnimalType and put only the animal types we want into it
         */

        //OK. let's make an instance of Animal that is a LION

        //  Animal a3 = ???

        // System.out.println(a3);  //what prints?  Why?  What if we wanted to print LION?

        //OK, let's write the instructions to build an empty Cage  object and ask the JVM to instantiate a Cage object for us!

        //ok, but what do we use cages for in a zoo?

        //Let's add some code to our Cage to allow us to 'hold a reference' to an Animal

        //Ok, let's  mess around with stuff and watch it through the debugger

        // Instantiate an Animal that is a BEAR

        //Put the BEAR in a CAGE

        //Now do it all in one line

        //Back to slides

        //⁡⁢⁣⁢Part B⁡ - What prints???  Let's try some stuff

        //Cage cage1 = new Cage(new Animal(AnimalType.BEAR));
        // Cage thinkOfWhatIHold = cage1;

        //⁡⁢⁣⁢Part C⁡ - Let's add an array into the mix!

        //Let's build an Animal that is a LION and assign it to the reference variable animal1
        //Let's build a Cage, assign  animal1 to it, and assign it to the reference variable cage1

        //Now let's build an empty array of Cages
    }
}
