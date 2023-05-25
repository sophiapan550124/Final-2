import java.util.Scanner;

// Interface representing a usable item
interface Usable {
    void use();
}

// Main class to run the gacha game
public class GachaGame {
    public static void main(String[] args) {
        GachaMachine gachaMachine = new GachaMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Gacha Game!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nPress enter to spin the gacha machine...");
            scanner.nextLine();

            GachaItem result = gachaMachine.spin();
            System.out.println("You got: " + result.getName());

            System.out.println("Do you want to use this item? (y/n)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                if (result instanceof Usable) {
                    Usable usableItem = (Usable) result;
                    usableItem.use();
                } else {
                    System.out.println("This item cannot be used.");
                }
            }

            System.out.println("Do you want to collect this item? (y/n)");
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                gachaMachine.collectItem(result);
                System.out.println("Item collected!");
            }

            System.out.println("Do you want to view your inventory? (y/n)");
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                gachaMachine.showInventory();
            }

            System.out.println("Do you want to continue playing? (y/n)");
            choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                exit = true;
            }
        }
    }
}