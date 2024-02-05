
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        // Reading numbers until -1 is entered
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }

        // Asking for start and end indices
        System.out.print("From where? ");
        int startIndex = Integer.parseInt(scanner.nextLine());

        System.out.print("To where? ");
        int endIndex = Integer.parseInt(scanner.nextLine());

        // Printing numbers within the specified range
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
