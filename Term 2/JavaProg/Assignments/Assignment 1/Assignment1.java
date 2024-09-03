import java.util.Scanner;

// THIS CODE IS ALL OF MY WORK COMBINED INTO ONE USING CLASSES

class Investment {

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
// --------------------------------------------------------------------------------------------------------------------

class Reimbursement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter total amount due for the medical visit: $");
        double totalAmountDue = input.nextDouble(); // asks user for amount due for visits

        System.out.print("Has the deductible been met? (true/false): "); //asks user if deductible is met and stores answer in boolean
        boolean deductibleMet = input.nextBoolean();

        double reimbursementPercentage = 0; //initializes set percentages on visits

        if (deductibleMet) { // if true it will continue
            System.out.print("Enter type of visit (Doctor/Hospital/Lab): "); 
            String typeOfVisit = input.next().toLowerCase(); //toLowerCase is so that Doctor or doctor work
            if ("doctor".equals(typeOfVisit)) { // if doctor is the type of visit
                reimbursementPercentage = 50; //percentage back is %50
            } else if ("hospital".equals(typeOfVisit)) { // if hospital is type of visit
                reimbursementPercentage = 80; //%80 is given back
            } else if ("lab".equals(typeOfVisit)) { // if lab is type of visit
                reimbursementPercentage = 70; //%70 is given back
            } else {
                System.out.println("Invalid type of visit entered."); //if doctor,hospital or lab is not answered
            }
        }

        double reimbursementAmount = (reimbursementPercentage / 100) * totalAmountDue; // use math to find reimbursement

        System.out.println("Reimbursement Amount: $" + reimbursementAmount); //print the result

        input.close(); // close scanner to avoid data leak
    }
}
//--------------------------------------------------------------------------------------------

class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integer values (n): ");
        int numberOfIntegers = input.nextInt(); //get the amount of integers from user

        int largest = Integer.MIN_VALUE; //initialize min value constant
        int smallest = Integer.MAX_VALUE; //initialize max value constant
        int sum = 0; //initialize sum variable
        int count = 0; //initialize the count for even

        for (int i = 1; i <= numberOfIntegers; i++) { //start for loop for the amount of integers
            System.out.print("Enter integer value #" + i + ": ");
            int number = input.nextInt(); //enter the integer value

            largest = Math.max(largest, number); 
            smallest = Math.min(smallest, number);

            if (number % 2 == 0) { // check if even
                System.out.println(number + " is Even."); 
                sum += number; //adds number to the sum
                count++; //add to even count
            } else {
                System.out.println(number + " is Odd."); //let user know number is odd
            }

            //gives info about the number entered
            if (number > 0) {
                System.out.println(number + " is Positive.");
            } else if (number < 0) {
                System.out.println(number + " is Negative.");
            } else {
                System.out.println(number + " is Zero.");
            }
        }

        // prints largest and smallest number
        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);

        //if there is an even number continue
        if (count > 0) {
            double average = (double) sum / count; //average of evens
            System.out.println("Sum of Even Numbers: " + sum);
            System.out.println("Average of Even Numbers: " + average);
        } else {
            System.out.println("No even numbers");
        }

        input.close(); //prevent info leak
        
    }
}

class Duplicate {
    
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