
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int totalBirthYears = 0;
        int count = 0;

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

            // Extract birth year from the second part
            int birthYear = Integer.parseInt(parts[1].trim());

            // Update longest name if necessary
            if (name.length() > longestName.length()) {
                longestName = name;
            }

            // Add birth year to total
            totalBirthYears += birthYear;
            count++;
        }

        // Calculate average birth year
        double averageBirthYear = (double) totalBirthYears / count;

        // Print out the longest name and average birth year
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);
    }
}
