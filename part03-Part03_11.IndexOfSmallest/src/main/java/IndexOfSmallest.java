
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        // Find the smallest number and its indices
        int smallest = list.get(0);
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int currentNumber = list.get(i);
            if (currentNumber < smallest) {
                smallest = currentNumber;
                indices.clear(); // Clear previous indices as we found a smaller number
                indices.add(i);
            } else if (currentNumber == smallest) {
                indices.add(i);
            }
        }

        // Print the result for each occurrence
        for (int index : indices) {
            System.out.println("Smallest number: " + smallest);
            System.out.println("Found at index: " + index);
        }
    }
}
