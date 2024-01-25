
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");

        int sum = 0;
        int number;

        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (number == 0) {
                    break;
                }

                sum += number;
            } else {
                scanner.next();
            }

            System.out.print("Give a number: ");
        }

        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }
}