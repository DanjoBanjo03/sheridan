package badinput;

import javax.swing.JOptionPane;

public class Start {
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog(null, "Please type an int");
        int num1 = Integer.parseInt(input);
        System.out.println(input);

        //Ok, but what if I type 'durp' into the textbox?

        //This is an Exception.  The people that wrote Integer.parseInt protected their code from bad data...This is what we must do with our code!

    }
}
