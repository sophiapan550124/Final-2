import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GachaGame {
    public static void main(String[] args)
    {
        GachaMachine gachaMachine = new GachaMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Gacha Game!");
        System.out.println("Press enter to spin the gacha machine...");
        scanner.nextLine();

        GachaItem result = gachaMachine.spin();
        System.out.println("You got: " + result.getName());
    }
}

