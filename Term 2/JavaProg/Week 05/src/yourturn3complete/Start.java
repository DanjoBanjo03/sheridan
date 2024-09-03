package yourturn3complete;

/* ⁡⁢⁣⁢Read Me!⁡
    
    Take a look at the Item class.  This class allows us to instantiate Item objects that we want to place in our ShoppingCart.

    Take a look at ShoppingCart.  Notice that ShoppingCart has an instance variable called item1 of type Item.  We can say that ShoppingCart is holding a reference to an Item object.  (remember, item1 will hold the address of an Item object)

    Write a method in ShoppingCart called addItemToCart.  This method will return void but will accept an Item (remember, what is actually being passed is the address of an Item object)
    take the Item address being passed into the method and put the value in item1

    Next, write a method called printOutItemsInCart that will print out the description of the item1 and the cost of item1

    For the SuperSmartyPants only:  Can you change your code to allow up to three Item objects to be placed into your ShoppingCart and modify
 */

public class Start {
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item(4543, "Cookies", 4.99);
        cart.addItemToCart(item1);
        cart.addItemToCart(new Item(4532, "Ice Cream", 9.99));
        cart.addItemToCart(new Item(2346, "Pizza", 19.99));

        cart.printOutItemsInCart();

        //If you completed the SuperSmartyPants section then uncomment this code?  Did it break your code? If so, why did this happen???

        ShoppingCart cart2 = new ShoppingCart();
        cart2.addItemToCart(new Item(2346, "Salad", .99));
        cart2.printOutItemsInCart();

    }
}
