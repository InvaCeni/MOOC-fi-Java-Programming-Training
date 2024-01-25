
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeCount = 0;

        while (true) {
            System.out.println("Give a number:");
            int userInput = scanner.nextInt();

            // Check if the entered number is 0 to exit the loop
            if (userInput == 0) {
                break;
            }

            // Check if the entered number is negative
            if (userInput < 0) {
                negativeCount++;
            }
        }

        System.out.println("Number of negative numbers: " + negativeCount);
        scanner.close();
    }
}
