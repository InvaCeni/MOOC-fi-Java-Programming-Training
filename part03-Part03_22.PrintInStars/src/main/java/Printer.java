
public class Printer {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Iterate through the array
        for (int k : array) {
            // Print stars based on the current number
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars for each number
            System.out.println();
        }
    }
}
