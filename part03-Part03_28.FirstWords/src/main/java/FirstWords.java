
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            // Check if the input is empty
            if (input.isEmpty()) {
                break; // Stop reading input if empty
            }

            // Split the input string by spaces
            String[] parts = input.split("\\s+");

            // Print the first part of the string
            System.out.println(parts[0]);
        }
    }
}
