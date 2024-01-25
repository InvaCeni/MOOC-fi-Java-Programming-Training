
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");

        int userInput = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");

        int nextInput = Integer.valueOf(scanner.nextLine());

        for (int i = nextInput; i <= userInput; i++) {
            System.out.println(i);
        }
    }
}
