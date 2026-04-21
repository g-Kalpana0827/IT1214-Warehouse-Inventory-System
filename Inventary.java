import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    // Add item
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }

    // Remove item
    public void removeItem(String itemId) {
        boolean found = false;

        for (Item item : items) {
            if (item.getItemId().equals(itemId)) {
                items.remove(item);
                System.out.println("Item removed successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found!");
        }
    }

    // Update quantity
    public void updateQuantity(String itemId, int quantity) {
        boolean found = false;

        for (Item item : items) {
            if (item.getItemId().equals(itemId)) {
                item.setQuantity(quantity);
                System.out.println("Quantity updated!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found!");
        }
    }

    // Search by ID
    public void searchById(String itemId) {
        for (Item item : items) {
            if (item.getItemId().equals(itemId)) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Search by Name
    public void searchByName(String name) {
        boolean found = false;

        for (Item item : items) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                System.out.println(item);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Item not found!");
        }
    }

    // Display all
    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }
}