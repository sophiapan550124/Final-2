import java.util.ArrayList;
import java.util.Random;

// GachaMachine class manages the gacha game and items
class GachaMachine {
    private GachaItem[] items;  // Array to store gacha items
    private ArrayList<GachaItem> inventory;  // ArrayList to store collected items

    public GachaMachine() {
        items = new GachaItem[4];  // Array with 4 elements
        items[0] = new WeaponItem("Sword", 10);
        items[1] = new ArmorItem("Shield", 5);
        items[2] = new WeaponItem("Axe", 15);
        items[3] = new ArmorItem("Armor", 8);

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