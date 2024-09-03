package finalenumeratedtypes;

public class PizzaOrder {
    private String customerName;
    private int size;
    private String topping1;
    private String topping2;
    private String topping3;

    public PizzaOrder(String customerName, int size) {
        this.customerName = customerName;
        this.size = size;
    }

    public String getTopping1()
    {
        return topping1;
    }

    public void setTopping1(String topping1)
    {
        this.topping1 = topping1;
    }

    public String getTopping2()
    {
        return topping2;
    }

    public void setTopping2(String topping2)
    {
        this.topping2 = topping2;
    }

    public String getTopping3()
    {
        return topping3;
    }

    public void setTopping3(String topping3)
    {
        this.topping3 = topping3;
    }

}
