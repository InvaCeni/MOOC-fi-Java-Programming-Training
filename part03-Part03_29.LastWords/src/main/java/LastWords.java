
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }


            // Split the input string by spaces
            String[] parts = input.split("\\s+");

            // Print the last word of the string
            System.out.println(parts[parts.length - 1]);
        }
    }
}

