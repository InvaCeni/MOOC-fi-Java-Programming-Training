import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        printUntilNumber(userInput);

        scanner.close();
    }

    public static void printUntilNumber(int number) {
        // Print numbers from 1 to the specified number
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}