
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Items {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String itemName = scanner.nextLine().trim();
            if (itemName.isEmpty()) {
                break;
            }
            Item item = new Item(itemName);
            items.add(item);
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
