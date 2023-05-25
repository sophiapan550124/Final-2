import java.util.ArrayList;
import java.util.Random;

// GachaMachine class manages the gacha game and items
class GachaMachine {
    private GachaItem[] items;  // Array to store gacha items
    private ArrayList<GachaItem> inventory;  // ArrayList to store collected items

    public GachaMachine() {
        items = new GachaItem[31];  // food list (also a list of arrays)
        items[0] = new FoodItem("Hamburger", 10);
        items[1] = new FoodItem("Hash Browns", 7);
        items[2] = new FoodItem("Fries", 5);
        items[3] = new FoodItem("Rice", 8);
        items[4] = new FoodItem("Sandwich", 8);
        items[5] = new FoodItem("Sushi", 7);
        items[6] = new FoodItem("Chocolate", 3);
        items[7] = new FoodItem("Chips", 8);
        items[8] = new FoodItem("Spaghetti", 8);
        items[9] = new FoodItem("Pizza", 10);
        items[10] = new FoodItem("Cake", 15);
        items[11] = new FoodItem("Veggies", 1);
        items[12] = new FoodItem("Eggs", 3);
        items[13] = new FoodItem("Bread", 3);
        items[14] = new FoodItem("Steak", 20);
        items[15] = new FoodItem("Butter?", 100);
        items[16] = new BevItem("Water", 10);
        items[17] = new BevItem("Soda", 5);
        items[18] = new BevItem("Fruit Juice", 7);
        items[19] = new BevItem("Milk", 5);
        items[20] = new BevItem("Beer", 2);
        items[21] = new BevItem("Cider", 3);
        items[22] = new BevItem("Coffee", 1);
        items[23] = new BevItem("Milkshake", 5);
        items[24] = new BevItem("Tea", 8);
        items[25] = new BevItem("Hot Chocolate", 7);
        items[26] = new BevItem("Protein Shake", 5);
        items[27] = new BevItem("Coconut Water", 7);
        items[28] = new BevItem("Gatorade", 5);
        items[29] = new BevItem("Smoothie", 8);
        items[30] = new BevItem("Melted Butter?", 100);

        inventory = new ArrayList<>();  // Initialize the inventory
    }

    public GachaItem spin() {
        Random random = new Random();
        int index = random.nextInt(items.length);
        return items[index];
    }

    /**
     * method that collects item if requested, then adds to inventory
     * @param item
     */
    public void collectItem(GachaItem item) {
        inventory.add(item);
    }

    public void showInventory() {
        System.out.println("Inventory:");
        for (GachaItem item : inventory) {
            System.out.println(item.getName());
        }
    }
}