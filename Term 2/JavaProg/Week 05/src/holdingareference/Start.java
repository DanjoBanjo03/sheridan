package holdingareference;

public class Start {
    public static void main(String[] args)
    {

        // ⁡⁢⁣⁡⁣⁢⁢Part A:⁡⁡

        //Let's look at Horn and Engine

        //Let's Instantiate a Horn object and make it honk

        /*‍‍‍‍Hint
            Horn horn = new Horn();
            horn.honk(); 
        */

        //Let's instantiate an Engine object and start it.

        /* ‍‍Hint:
         Engine engine = new Engine(4);
        engine.start();
         */

        //Ok, Car's have Horns and Car's have Engines.  We could even say that a Car is 'composed' of many parts, including a Horn and an Engine.

        //We would like to design our Car class to be composed of a Horn and an Engine.  Let's go to the Car clas and add the code to do this

        //Now we can instantiate a Car:

        /*​‌‍ ‍‍‍Hint
         Car car = new Car();
         */

        // ⁡⁢⁣⁢How can we make the Horn honk?⁡
        /* ⁡⁢⁢⁢Answer:⁡
            car.getHorn.honk();
         */

        // ⁡⁢⁣⁢How can we make the Engine start?⁡
        /* ⁡⁢⁢⁢Answer:⁡
        car.getEngine().start();
         */

        // ⁡⁢⁣⁢Can we build a Car with Horn and Engine in one line?⁡
        /* ⁡⁢⁢⁢Answer:⁡
            Car car2 = new Car (new Horn(), new Engine (4));
         */

        // ⁡⁢⁣⁡⁣⁢⁢Part B:⁡⁡

        //OK, this is cool......BUT, we have broken one of our rules of encapsulation, haven't we?
        //We don't want the programmer that is using our Car to have to know the internals of our object, do we?  The programmer should just be able to call methods without needing to know what's inside.  If the programmers wants the car's horn to honk, they should just be able to ask the Car to do that.  They shouldn't have to know that there is an instance variable called horn and that they need to get that address and then they need to know what method in Horn makes the horn honk.

        //We can prevent other classes from accessing our horn and engine directly by getting rid of the getters for Horn and Engine in our Car class

        //However, we still want our car to start and honk...

        //Let's just write a couple more methods in Car (honkTheHorn and StartTheEngine)

        //Now, other programmers can call those methods and not need to travel to the Horn class or Engine class themselves.  They can just call these methods and let the methods contact the Horn and Engine objects

        // ⁡⁢⁣⁢Last Question⁡ - What if we want to specify how many cylinders the Engine has when we instantiate the car?
    }
}