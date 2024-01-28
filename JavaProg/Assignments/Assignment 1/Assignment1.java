import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter investment amount: ");
        // double investmentAmount = input.nextDouble();

        // System.out.print("Enter annual interest rate in percentage: ");
        // double annualInterestRate = input.nextDouble();

        // System.out.print("Enter number of years: ");
        // int numberOfYears = input.nextInt();

        // double monthlyInterestRate = annualInterestRate / 100 / 12;

        // double futureInvestmentValue = investmentAmount * Math.pow(1+monthlyInterestRate, numberOfYears * 12);

        // System.out.println("Future investment value: " + futureInvestmentValue);

// --------------------------------------------------------------------------------------------------------------------

        // System.out.print("Enter total amount due for the medical visit: $");
        // double totalAmountDue = input.nextDouble();

        // System.out.print("Has the deductible been met? (true/false): ");
        // boolean deductibleMet = input.nextBoolean();

        // double reimbursementPercentage = 0;

        // if (deductibleMet) {
        //     System.out.print("Enter type of visit (Doctor/Hospital/Lab): ");
        //     String typeOfVisit = input.next().toLowerCase();
        //     if ("doctor".equals(typeOfVisit)) {
        //         reimbursementPercentage = 50;
        //     } else if ("hospital".equals(typeOfVisit)) {
        //         reimbursementPercentage = 80;
        //     } else if ("lab".equals(typeOfVisit)) {
        //         reimbursementPercentage = 70;
        //     } else {
        //         System.out.println("Invalid type of visit entered.");
        //     }
        // }

        // double reimbursementAmount = (reimbursementPercentage / 100) * totalAmountDue;

        // System.out.println("Reimbursement Amount: $" + reimbursementAmount);

//--------------------------------------------------------------------------------------------

        System.out.print("Enter the number of integer values (n): ");
        int numberOfIntegers = input.nextInt();

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= numberOfIntegers; i++) {
            System.out.print("Enter integer value #" + i + ": ");
            int number = input.nextInt();

            largest = Math.max(largest, number);
            smallest = Math.min(smallest, number);

            if (number % 2 == 0) {
                System.out.println(number + " is Even.");
                sum += number;
                count++;
            } else {
                System.out.println(number + " is Odd.");
            }

            if (number > 0) {
                System.out.println(number + " is Positive.");
            } else if (number < 0) {
                System.out.println(number + " is Negative.");
            } else {
                System.out.println(number + " is Zero.");
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Sum of Even Numbers: " + sum);
            System.out.println("Average of Even Numbers: " + average);
        } else {
            System.out.println("No even numbers");
        }

        input.close();
        
    }
}

class Duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter an integer: ");
        long n = input.nextInt();

        if (n < 10) {
            long result = n * 10 + n;
            System.out.println(result);
        } else {
            int count = 0;
            long num = n;
            while (num > 0) {
                num /= 10;
                count++;
            }

            long duplicatedNumber = n;

            for (int i = 0; i < count; i++) {
                duplicatedNumber *= 10;
                duplicatedNumber += n;
            }

            System.out.println(duplicatedNumber);
        }

        input.close();
    }
}
