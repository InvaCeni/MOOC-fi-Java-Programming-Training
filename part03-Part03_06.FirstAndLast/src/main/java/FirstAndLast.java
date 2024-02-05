
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        // Check if the list is not empty before attempting to print values
        if (!list.isEmpty()) {
            // Print the first value read from the list
            System.out.println(list.get(0));

            // Get the index of the last element in the list using size() - 1
            int lastIndex = list.size() - 1;

            System.out.println( list.get(lastIndex));
        }
    }
}



