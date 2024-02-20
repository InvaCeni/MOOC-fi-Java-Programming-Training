
import java.util.Scanner;

public class AVClub {

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

            // Print the pieces that contain "av" on separate lines
            for (String part : parts) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
        }
    }
}
