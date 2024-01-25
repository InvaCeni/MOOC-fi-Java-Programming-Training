
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            double number = scanner.nextDouble();
            if (number < 0) {
                System.out.println("Unsuitable number");
            } else if (number == 0) {
                break;
            } else {
                double square = Math.pow(number, 2);
                System.out.println(square);
            }
        }
    }
}
