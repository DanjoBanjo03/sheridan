package fixingourinputcomplete;

import javax.swing.JOptionPane;

public class RichUtils {

    public static int getIntInput(String prompt)
    {
        while (true)
        {
            String input = JOptionPane.showInputDialog(prompt);
            try
            {
                return Integer.parseInt(input);
            }
            catch (Exception e)
            {
                System.out.println("Please enter an integer!");
            }
        }
    }

    public static double getDoubleInput(String prompt)
    {
        while (true)
        {
            String input = JOptionPane.showInputDialog(prompt);
            try
            {
                return Double.parseDouble(input);
            }
            catch (Exception e)
            {
                System.out.println("Please enter an integer!");
            }
        }

    }
}
