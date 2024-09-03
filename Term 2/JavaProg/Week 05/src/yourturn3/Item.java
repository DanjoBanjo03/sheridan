package yourturn3;

public class Item {
    private int SKUNumber;
    private String description;
    private double cost;

    public Item(int sKUNumber, String description, double cost) {
        SKUNumber = sKUNumber;
        this.description = description;
        this.cost = cost;
    }

    public int getSKUNumber()
    {
        return SKUNumber;
    }

    public String getDescription()
    {
        return description;
    }

    public double getCost()
    {
        return cost;
    }

}
