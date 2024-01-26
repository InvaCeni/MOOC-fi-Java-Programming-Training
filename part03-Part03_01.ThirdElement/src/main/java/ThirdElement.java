
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an ArrayList to store strings
        ArrayList<String> list = new ArrayList<>();

        // Continuously reading user input until an empty string is entered,
        // and adding each non-empty input to the list
        while (true) {

            // Reading user input
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            // Adding each non-empty input to the list
            list.add(input);
        }

        System.out.println(list.get(2)); // Printing the third string from the list (counting from 0)
    }
}
