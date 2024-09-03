package yourturn1complete;

import java.util.Random;

public class PartB {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        System.out.println("50 random ints");
        for (int i = 0; i < 50; i++)
        {
            System.out.print(rnd.nextInt(100) + ", ");
        }

        System.out.println("\nUsing While");
        while (true)
        {
            int num = rnd.nextInt(100);
            System.out.print(num + ", ");
            if (num == 5)
            {
                break;
            }
        }
        System.out.println("\nUsing DoWhile");
        int num2;
        do
        {
            num2 = rnd.nextInt(100);
            System.out.print(num2 + ", ");
        } while (num2 != 5);
    }
}