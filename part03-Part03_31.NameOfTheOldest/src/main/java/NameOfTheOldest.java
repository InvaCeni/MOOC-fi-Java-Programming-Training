
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldestName = "";
        int oldestAge = Integer.MIN_VALUE; // Initialize to smallest possible integer

        while (true) {
            String input = scanner.nextLine();

            // Check if the input is empty
            if (input.isEmpty()) {
                break; // Stop reading input if empty
            }

            // Split the input string by comma
            String[] parts = input.split(",");

            // Extract name from the first part
            String name = parts[0].trim();

            // Extract age from the second part
            int age = Integer.parseInt(parts[1].trim());

            // Update oldest age if necessary
            if (age > oldestAge) {
                oldestName = name;
                oldestAge = age;
            }
        }

        // Print out the name of the oldest person
        System.out.println("Name of the oldest: " + oldestName);
    }
}
