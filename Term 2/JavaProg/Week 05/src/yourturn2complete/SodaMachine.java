package yourturn2complete;

public class SodaMachine {

    private int numSodasLeft;
    private double totalMoneyCollected;
    private double moneyInsertedToPurchaseSoda;
    private double costOfSodaCan;

    public int getNumSodasLeft()
    {
        return numSodasLeft;
    }

    public double getTotalMoneyCollected()
    {
        return totalMoneyCollected;
    }

    public SodaMachine(int numSodasLeft, double costOfSodaCan) {
        this.numSodasLeft = numSodasLeft;
        this.costOfSodaCan = costOfSodaCan;
    }

    public void acceptCoin(Coin coin)
    {
        moneyInsertedToPurchaseSoda += coin.getValue();
    }

    public void dispenseSodaCan()
    {
        if (moneyInsertedToPurchaseSoda < costOfSodaCan)
        {
            double delta = costOfSodaCan - moneyInsertedToPurchaseSoda;
            System.out.println("Sorry, you need to insert $" + delta + " more");
            return;
        }
        if (numSodasLeft < 1)
        {
            System.out.println("Sorry, Soda Machine is out of Soda");
            return;
        }
        numSodasLeft--;
        totalMoneyCollected += moneyInsertedToPurchaseSoda;
        moneyInsertedToPurchaseSoda = 0;
        System.out.println("Dispensing a can of soda!");
    }

    public void returnChange()
    {
        System.out.println("Sorry, return change is out of order!");
    }

}
