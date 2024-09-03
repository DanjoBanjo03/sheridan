package fixingourinputcomplete;

import javax.swing.JOptionPane;

public class Start {
    public static void main(String[] args)
    {
        // String input = JOptionPane.showInputDialog(null, "Please type an int");
        // int num1 = Integer.parseInt(input);
        // System.out.println(input);

        int num1 = RichUtils.getIntInput("Please type your age!");
        System.out.println(num1);

        double pi = RichUtils.getDoubleInput("Please type the value of pi");
        System.out.println(pi);
        //Ok, but what if I type 'durp' into the textbox?

        //This is an Exception.  The people that wrote Integer.parseInt protected their code from bad data...This is what we must do with our code!

        //Can we fix this with a try/catch?

        //can we use a loop to keep asking?

    }
}
