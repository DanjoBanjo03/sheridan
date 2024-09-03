import java.util.Scanner;

public class reverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        reverse(number);
        scanner.close();
    }

    public static void reverse(int number) {
        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
    }
}
