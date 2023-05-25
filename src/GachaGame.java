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

        System.out.println("Welcome to Sophia's restaurant, where everything is for free!" +
                "\nHere you can enjoy some fufilling snacks, meals, and even refreshing drinks!" +
                "\nYou might find a nice surprise if you keep pulling...there's a 0.06% chance!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nPress enter to pull a meal/refreshment...");
            scanner.nextLine();

            GachaItem result = gachaMachine.spin();
            System.out.println("You got: " + result.getName() + "!");

            System.out.println("Do you want to check this item? (y/n)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                    Usable usableItem = (Usable) result;
                    usableItem.use();
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

            System.out.println("Do you want to continue eating? (y/n)");
            choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                exit = true;
            }
        }
    }
}