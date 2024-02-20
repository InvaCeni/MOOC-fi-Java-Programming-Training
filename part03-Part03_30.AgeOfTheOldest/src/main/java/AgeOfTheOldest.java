import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = Integer.MIN_VALUE; // Initialize to smallest possible integer

        while (true) {
            String input = scanner.nextLine();

            // Check if the input is empty
            if (input.isEmpty()) {
                break; // Stop reading input if empty
            }

            // Split the input string by comma
            String[] parts = input.split(",");

            // Extract age from the second part
            int age = Integer.parseInt(parts[1].trim());


            if (age > oldestAge) {
                oldestAge = age;
            }
        }

        // Print out the age of the oldest person
        System.out.println("Age of the oldest: " + oldestAge);
    }
}

