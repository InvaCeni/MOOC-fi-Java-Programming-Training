import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Read book information from the user
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine().trim();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            books.add(new Book(title, pages, publicationYear));
        }

        // Ask the user what information to print
        System.out.print("\nWhat information will be printed? ");
        String printOption = scanner.nextLine().trim();

        // Print the requested information
        System.out.println();
        if (printOption.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            }
        } else if (printOption.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}