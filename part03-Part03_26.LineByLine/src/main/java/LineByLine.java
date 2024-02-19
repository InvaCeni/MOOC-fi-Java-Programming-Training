import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            // Check if the input is empty
            if (input.isEmpty()) {
                break; // Stop reading input if empty
            }

            // Split the input string by whitespace
            String[] parts = input.split("\\s+");

            // Print each part of the string on a new line
            for (String part : parts) {
                System.out.println(part);
            }
        }
    }
}

