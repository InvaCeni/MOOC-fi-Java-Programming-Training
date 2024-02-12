import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        // Print the initial values of the array
        for (int value : array) {
            System.out.println(value);
        }

        System.out.println("Give two indices to swap:");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        // Swap values at the given indices
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        // Print the values of the array after swapping
        for (int value : array) {
            System.out.println(value);
        }
    }
}