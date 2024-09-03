package yourturn1complete;

import javax.swing.JOptionPane;

public class Utility {

    public static String getStringInput(String prompt) //note that we added the static keyword in part B to make this a class method
    {
        return JOptionPane.showInputDialog(prompt);
    }

    public static int getIntInput(String prompt) //note that we added the static keyword in part B to make this a class method
    {
        return Integer.parseInt(JOptionPane.showInputDialog(prompt));
    }
}
