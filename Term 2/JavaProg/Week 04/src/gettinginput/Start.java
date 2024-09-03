package gettinginput;

import javax.swing.JOptionPane;

public class Start {
    public static void main(String[] args)
    {
        //We can use the Scanner class to get input from the file system or the keyboard

        //However, we're going to do something a little bit different!

        String name = JOptionPane.showInputDialog("What is your name"); //notice that we need to import JOptionPane
        System.out.println("Hi " + name);

        //ok, that's neat.  Let's ask the age

        // int ageInput = JOptionPane.showInputDialog(null, "How old are you?");   //⁡⁢⁣⁣uh oh⁡ !

        // Turns out that the showInputDialog captures everything that a users types in and returns it as a String.  Even if the user typed 42, the showInputDialog would capture it and return it as the String "42";

        // Should have known it was too easy!  ;->

        //   However, we can translate a String that contains digits into an int.

        //   Step 1:  Let's make ageInput a String type

        // int age = Integer.parseInt(ageInput);
        // int ageInWeeks = age * 52;
        // System.out.println("Hi " + name + ", you are " + ageInWeeks + " weeks old!");

        //doubles work too!
        // double heightInMeters = Double.parseDouble(JOptionPane.showInputDialog(null, "How tall are you in meters?"));
        // double heightInCentimeters = heightInMeters * 100;
        // System.out.println("that is " + heightInCentimeters+" cm");

        //hmmmm...something is bothering me though???  Let's go back to the slides

    }
}
