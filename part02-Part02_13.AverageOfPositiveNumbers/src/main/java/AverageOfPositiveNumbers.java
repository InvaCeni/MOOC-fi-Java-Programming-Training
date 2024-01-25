
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");

        int sum = 0;
        int count = 0;

        int number = scanner.nextInt();

        while (number != 0) {
            if (number > 0) {
                sum += number;
                count++;
            }
            System.out.print("Give a number: ");
            number = scanner.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of the positive numbers: " + average);
        } else {
            System.out.println("Cannot calculate the average");
        }

        scanner.close();
    }
}

