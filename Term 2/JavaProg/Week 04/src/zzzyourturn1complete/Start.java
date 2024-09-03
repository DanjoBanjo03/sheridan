package zzzyourturn1complete;

import zzzyourturn1complete.Person;
import zzzyourturn1complete.Utils;

public class Start {
    public static void main(String[] args)
    {
        /*  ⁡⁢⁣⁢PART A: ⁡
            PART A:  In this problem, you need to be a Java Dective!  You have been given the entire Start class.  However, all of the rest of the code is missing.  Your job is to look for clues in the code to help you to write all of the other code to make this code work and give you an output similar to below:
        
                    Hello Rich!  You are 1.82 meters tall and your lucky number is  473820
        
                    *note the JOptionPane.showInputDialog is to be used to get input -- remember it only returns a String
         */

        //a small hint...did we instantiate a Utils object?
        String name = Utils.getStringInput("Please type in your name");
        int luckyNumber = Utils.getIntInput("Please type your luckyNumber number");
        double heightInMeters = Utils.getDoubleInput("How tall are you in meters?");

        System.out.println("Hello " + name + "!  You are " + heightInMeters + " meters tall and your lucky number is " + luckyNumber);

        /* ⁡⁢⁣⁢Part B: ⁡
            Part B:  OK, now we need to make the code below work.  Note that a lucky number should always be positive and a height should never be negative
        
        */

        Person p1 = new Person();
        p1.setName(Utils.getStringInput("Enter name of first person"));
        p1.setLuckyNumber(Utils.getIntInput("Enter luckyNumber of first person"));
        p1.setHeightInMeters(Utils.getDoubleInput("Enter height of first person"));

        Person p2 = new Person("Bart", 6, 1.3);
        System.out.println(p1.getDescription());
        System.out.println(p2.getDescription());

        System.out.println(p1.getDescription());
        System.out.println(p2.getDescription());

    }
}
