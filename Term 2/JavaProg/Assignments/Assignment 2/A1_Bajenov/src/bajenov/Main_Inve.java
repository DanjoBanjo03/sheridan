package bajenov;

import java.util.Scanner;

public class Main_Inve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter inventory item details:");

        String id = "";
        while (!isValidId(id)) {
            System.out.print("Enter item ID (format: ABC-1234): ");
            id = scanner.nextLine().trim();
            if (!isValidId(id))
                System.out.println("Error: Inventory ID must be in the form ABC-1234");
        }

        String name = "";
        while (name.isEmpty()) {
            System.out.print("Enter item name: ");
            name = scanner.nextLine().trim();
            if (name.isEmpty())
                System.out.println("Error: You must enter an item name.");
        }

        int qoh = -1;
        while (qoh < 0) {
            System.out.print("Enter quantity on hand: ");
            try {
                qoh = Integer.parseInt(scanner.nextLine());
                if (qoh < 0)
                    System.out.println("Error: QOH must be 0 or more.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
            }
        }

        int rop = -1;
        while (rop <= 0) {
            System.out.print("Enter re-order point: ");
            try {
                rop = Integer.parseInt(scanner.nextLine());
                if (rop <= 0)
                    System.out.println("Error: ROP must be greater than 0.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
            }
        }

        double sellPrice = -1;
        while (sellPrice <= 0) {
            System.out.print("Enter selling price: ");
            try {
                sellPrice = Double.parseDouble(scanner.nextLine());
                if (sellPrice <= 0)
                    System.out.println("Error: Selling price must be greater than 0.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
            }
        }

        Inventory item = new Inventory();
        item.setId(id);
        item.setName(name);
        item.setQoh(qoh);
        item.setRop(rop);
        item.setSellPrice(sellPrice);

        System.out.println("\nInventory Item Details:");
        System.out.println(item);

        if (item.getQoh() <= item.getRop()) {
            System.out.println("You need to order more " + item.getName() + ".");
        }

        int quantityToBuy = -1;
        while (quantityToBuy < 0) {
            System.out.print("\nEnter quantity to buy: ");
            try {
                quantityToBuy = Integer.parseInt(scanner.nextLine());
                if (quantityToBuy < 0)
                    System.out.println("Error: Quantity to buy must be 0 or more.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
            }
        }

        double totalCost = quantityToBuy * item.getSellPrice() * 1.13;
        System.out.printf("Total cost: $%.2f\n", totalCost);

        scanner.close();
    }

    private static boolean isValidId(String id) {
        return id.matches("[A-Za-z]{3}-[0-9]{4}");
    }
}


class Inventory {
    private String id;
    private String name;
    private int qoh;
    private int rop;
    private double sellPrice;

    public Inventory() {
        this.id = "ABC-1234";
        this.name = "New Item";
        this.qoh = 0;
        this.rop = 25;
        this.sellPrice = 0;
    }

    public Inventory(String id, String name, double sellPrice) {
        setId(id);
        setName(name);
        this.sellPrice = sellPrice;
    }

    public Inventory(String id, String name, int qoh, int rop, double sellPrice) {
        setId(id);
        setName(name);
        setQoh(qoh);
        setRop(rop);
        this.sellPrice = sellPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQoh() {
        return qoh;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    public int getRop() {
        return rop;
    }

    public void setRop(int rop) {
        this.rop = rop;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public String toString() {
        return getId() + " (" + getName() + "), QOH: " + getQoh() + " Price: $" + String.format("%.2f", getSellPrice());
    }
}
