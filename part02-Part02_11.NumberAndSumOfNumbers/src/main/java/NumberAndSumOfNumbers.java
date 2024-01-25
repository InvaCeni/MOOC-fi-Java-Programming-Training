
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        System.out.println("Give a number:");

        int number = scanner.nextInt();

        while (number != 0) {
            count++;
            sum += number;

            System.out.print("Give a number: ");
            number = scanner.nextInt();
        }

        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }
}


