package circuscomplete;

public class Start {
    public static void main(String[] args)
    {
        // Animal a1 = new Animal("Lion");
        // System.out.println(a1.getAnimalType());

        //! hmmmm...what went wrong???  Why didn't it print Lion?!
        //*Let's fix it!  We fixed it in Animal 
        //Ok, that is working, but what if the programmer typed this?

        // Animal a2 = new Animal("Stapler"); //!hmmmm...how could we prevent this?

        //*We should make an enumerated type for AnimalType to prevent bad data like stapler from being passed.

        //OK. let's make an instance of Animal that is a Lion
        //  Animal a3 = ???
        Animal a3 = new Animal(AnimalType.LION);

        System.out.println(a3); //what prints? - the address of the Animal (the lion) object!

        //OK, let's write the instructions to build an empty Cage  object and ask the JVM to instantiate a Cage object for us!
        Cage c1 = new Cage();
        //ok, but what do we use cages for in a zoo?

        //Let's add some code to our Cage so that we can keep an Animal in it
        c1.setAnimal(a3);
        System.out.println(c1.getAnimal());
        System.out.println(c1.getAnimal().getAnimalType());

        //Ok, let's  mess around with stuff and watch it through the debugger

        // Instantiate an Animal that is a BEAR
        Animal a4 = new Animal(AnimalType.BEAR);
        //Put the BEAR in a CAGE
        Cage c2 = new Cage(a4);
        System.out.println(c2.getAnimal().getAnimalType());
        //Now do it all in one line
        Cage c3 = new Cage(new Animal(AnimalType.DOG));

        //Back to slides

        ///Part B - What prints???  Let's try some stuff
        Cage c4 = c3;
        System.out.println(c4.getAnimal().getAnimalType());
        c4 = null;
        //System.out.println(c4.getAnimal().getAnimalType());//! <--this will be a null ptr exception.  Do you know why???

        //Cage cage1 = new Cage(new Animal(AnimalType.BEAR));
        // Cage thinkOfWhatIHold = cage1;

        ///PART C - Let's add an array into the mix!

        Cage[] cages = new Cage[5];
        System.out.println(cages[0]);

        cages[0] = new Cage(new Animal(AnimalType.ELEPHANT));
        System.out.println(cages[0]);
        System.out.println(cages[0].getAnimal());
        System.out.println(cages[0].getAnimal().getAnimalType());
        System.out.println(cages[1]);
        cages[1] = cages[0]; //!REMEMBER, each floor just holds an address of where to find the Animal object.  If we make floor 1 hold the same address as Floor 2, then both floors point to the same object!
        System.out.println(cages[1].getAnimal().getAnimalType());
    }
}
