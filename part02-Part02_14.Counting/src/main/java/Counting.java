
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= userInput; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}