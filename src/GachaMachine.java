import java.util.ArrayList;
import java.util.Random;
public class GachaMachine {
    private GachaItem[] items;  // Array to store gacha items
    private ArrayList<GachaItem> inventory;  // ArrayList to store collected items

    public GachaMachine() {
        items = new GachaItem[4];  // Array with 4 elements
        items[0] = new GachaItem("Item 1");
        items[1] = new GachaItem("Item 2");
        items[2] = new GachaItem("Item 3");
        items[3] = new GachaItem("Item 4");

        inventory = new ArrayList<>();  // Initialize the inventory
    }

    public GachaItem spin() {
        Random random = new Random();
        int index = random.nextInt(items.length);
        return items[index];
    }

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
