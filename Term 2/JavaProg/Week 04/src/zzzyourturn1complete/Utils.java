package zzzyourturn1complete;

import javax.swing.JOptionPane;

public class Utils {
    public static String getStringInput(String prompt)
    {
        return JOptionPane.showInputDialog(null, prompt);
    }

    public static int getIntInput(String prompt)
    {
        return Integer.parseInt(JOptionPane.showInputDialog(null, prompt));
    }

    public static double getDoubleInput(String prompt)
    {
        return Double.parseDouble(JOptionPane.showInputDialog(null, prompt));
    }
}
