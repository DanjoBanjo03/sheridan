import java.util.Scanner;

public class MaxMin {
    
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
