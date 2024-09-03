package learningexceptions;

import javax.swing.JOptionPane;

public class Start {
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog(null, "Please type an int");
        int num1 = Integer.parseInt(input);
        System.out.println(input);
        System.out.println("Hello!!!");

        //remember what happened when we type characters into the input box???

        //If something goes wrong during the execution of our program and the JVM is no longer capable of running, it will throw an Exception and stop the program.

        //Turn out, if something goes wrong in our code, we can throw an Exception as well!!!

        //  Exception error = new Exception("Hello! This is my first Exception!");
        //  throw error;  //uh oh...what is this error???

    }
}
