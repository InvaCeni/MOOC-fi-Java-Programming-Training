
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        // Reading numbers until -1 is entered
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }

        // Finding the greatest number in the list
        int greatestNumber = findGreatestNumber(list);

        // Printing the greatest number
        System.out.println("The greatest number: " + greatestNumber);
    }

    // Method to find the greatest number in a list
    private static int findGreatestNumber(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            // Return a special value, assuming -1 cannot be in the list
            return -1;
        }

        int greatest = list.get(0);

        for (int number : list) {
            if (number > greatest) {
                greatest = number;
            }
        }

        return greatest;
    }
}
