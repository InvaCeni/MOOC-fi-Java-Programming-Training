import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Item> items = new HashSet<>();

        while (true) {
            System.out.print("Identifier? (empty will stop) ");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.print("Name? (empty will stop) ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item item = new Item(identifier, name);
            items.add(item);
        }

        System.out.println("\n==Items==");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}