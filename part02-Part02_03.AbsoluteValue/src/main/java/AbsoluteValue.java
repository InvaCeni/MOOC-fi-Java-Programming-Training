
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.valueOf(scanner.nextLine());

        if (userInput < 0) {
            System.out.println(userInput * (-1));
        } else {
            System.out.println(userInput);
        }
    }
}
