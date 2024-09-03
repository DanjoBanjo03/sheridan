import java.util.Scanner;

public class Duplicate {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        long n = input.nextLong();

        if (n > 0 && n < 1000000) { //if the number is between 0 and 1000000 continue
            long result = duplicateDigits(n); //calls the method and passes the n
            System.out.println("Duplicated number: " + result); //prints result
        } else {
            System.out.println("Invalid input."); // entered is not between 0 and 100000 or something else
        }

        input.close(); //prevent info leak
    }

    static long duplicateDigits(long n) { //starts a method for doing method to duplicate

        long multiplier = 1;
        long duplicateNumber = n;

        while (duplicateNumber > 0) {
            duplicateNumber /= 10;
            multiplier *= 10;
        }

        return n * multiplier + n; //returns the answer to the method
    }
}