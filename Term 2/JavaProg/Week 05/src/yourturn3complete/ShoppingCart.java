package yourturn3complete;

public class ShoppingCart {
    private Item item1;
    private Item item2;
    private Item item3;

    public void addItemToCart(Item item)
    {
        if (item1 == null)
        {
            item1 = item;
            return;
        }
        if (item2 == null)
        {
            item2 = item;
            return;
        }
        if (item3 == null)
        {
            item3 = item;
            return;
        }
        System.out.println("Sorry, cart is full!");
    }

    public void printOutItemsInCart()
    {
        System.out.println("Item 1: " + item1.getDescription() + " - " + item1.getCost());
        System.out.println("Item 2: " + item2.getDescription() + " - " + item2.getCost());
        System.out.println("Item 3: " + item3.getDescription() + " - " + item3.getCost());
    }

    public double getValueOfItemsInCart()
    {
        return item1.getCost() + item2.getCost() + item3.getCost();
    }
}
