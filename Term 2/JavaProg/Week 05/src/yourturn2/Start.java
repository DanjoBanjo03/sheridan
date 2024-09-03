package yourturn2;

public class Start {
    public static void main(String[] args)
    {

        //⁡⁣⁢⁢ PART A⁡ - Create an enumerated type called Coin that can have values representing a nickel, a  dime or a quarter.  Use a constructor and getter to allow the value of the Coin to be returned.

        Coin coin = Coin.QUARTER;

        System.out.println(coin);//should print QUARTER
        System.out.println(coin.getValue()); //should print .25

        /* ⁡⁣⁢⁢ PART B ⁡- build a SodaMachine class that:
        
        - tracks how much money has been collected by the machine in total
        - has an associated getter to be able to get how much has been collected
        - tracks how many cans of soda are in the machine 
        - has an instance variable that contains the cost of each can of soda
        - tracks how much money has been inserted into the machine since the last time it dispensed a soda
         - a method called acceptCoin that accepts a Coin (either QUARTER, DIME, or NICKEL) and adds the value of that Coin to the instance variable tracking how much money has been inserted since the last time the machine dispensed a soda
         - a method called dispenseSodaCan that will dispense a can of soda (remember to decrement your soda inventory) only if there has been enough money inserted into the machine and that there is a can of soda left in inventory.
         -  What things must you check?  If there hasn't been enough money inserted, tell the customer.  If there are no cans of soda left, tell the customer.
         -has a returnChange method that accepts nothing, returns nothing and does nothing, just like a real soda machine ;->
         - has a constructor that allows you to set the number of cans of soda that are in the machine and the cost of a single can of soda.
         
         Once you've correctly built your SodaMachine class, the following code will yield and output of:
        
        Testing Soda Machine
        Sorry, you need to insert $0.5 more
        Sorry, you need to insert $0.25 more
        Dispensing a can of soda!
        Sorry, return change is out of order!
        */

        // System.out.println("Testing Soda Machine");
        // SodaMachine s1 = new SodaMachine(15, .50); //Ya I know, where can you buy soda for 50 cents?!!!
        // s1.dispenseSodaCan();
        // s1.acceptCoin(Coin.QUARTER);
        // s1.dispenseSodaCan();
        // s1.acceptCoin(Coin.DIME);
        // s1.acceptCoin(Coin.DIME);
        // s1.acceptCoin(Coin.DIME);
        // s1.dispenseSodaCan();
        // s1.returnChange();
    }
}
