public class ArrayPrinter {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Print the current number
            System.out.print(array[i]);

            // Print comma and whitespace if it's not the last element
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
