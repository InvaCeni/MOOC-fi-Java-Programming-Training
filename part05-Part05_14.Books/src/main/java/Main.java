import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Book> books = new HashSet<>();

        while (true) {
            System.out.print("Name (empty will stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book book = new Book(name, publicationYear);
            if (!books.contains(book)) {
                books.add(book);
            } else {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            }
        }

        System.out.println("\nThank you! Books added: " + books.size());
    }
}
