import java.util.Scanner;

public class Reimbursement {
    
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
