
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

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

        // Check if the list is not empty before attempting to print the last value
        if (!list.isEmpty()) {
            // Get the index of the last element in the list using size() - 1
            int lastIndex = list.size() - 1;

            // Print the last value read from the list
            System.out.println( list.get(lastIndex));
        }
    }
}



