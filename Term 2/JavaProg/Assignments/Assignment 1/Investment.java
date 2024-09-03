import java.util.Scanner;

public class Investment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: $");
        double investmentAmount = input.nextDouble(); // get the investment amount from the user

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble(); //get the annual interest rate from user

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt(); // get the amount of years from user

        double monthlyInterestRate = annualInterestRate / 100 / 12; // find monthly interest rate in decimal

        double futureInvestmentValue = investmentAmount * Math.pow(1+monthlyInterestRate, numberOfYears * 12); //use formula to calculate investment value

        System.out.println("Future investment value: $" + futureInvestmentValue); //let user know future investment amount

        input.close(); //closes the scanner to prevent info leak
    }
}
