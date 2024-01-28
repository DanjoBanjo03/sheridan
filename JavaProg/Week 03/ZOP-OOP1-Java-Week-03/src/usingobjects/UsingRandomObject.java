package usingobjects;

public class UsingRandomObject {
    public static void main(String[] args)
    {

        //let's debug these two lines and look at the differences
        int num1 = 10; //what is this line doing?  is num1 a primitive variable?
        Random rnd = new Random(); //what do you suppose this line is doing?  Just look at the first two words.  Seems familiar, right?
        //Random is a class in the Java API that some smartypants wrote.  However, you can see that we currently have an error saying it can't be resolved to a type.  That's because we have to tell the compiler where to find the Random class  (which package is it in?) in the JVM.  Let's fix this!
        /*huh- num1 has a 10 in it.  But rnd looks crazy!!!  Is rnd a primitive variable???  How do we know? */

        //let's print out these variables
        System.out.println(num1);
        System.out.println(rnd); //huh?   rnd contains the address (in memory) of an object!  Objects are what this course is all about!

        //We know that objects have methods inside them that can do work for us!
        //To access an object, the JVM needs to know where it is stored in the heap.  We need to know the address of the object.  Isn't it lucky that referrence variables store address of objects?!
        // In order for us to access the object programatically, we use what is know as dot notation. (just type the name of the refernce variables, followed by a . )

        //Let's print out a random number:

        //OK, back to the slides for a sec to talk about what an object is.

    }
}
