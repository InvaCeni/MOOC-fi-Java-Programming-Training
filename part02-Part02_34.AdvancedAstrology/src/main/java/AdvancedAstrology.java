public class AdvancedAstrology {

    public static void main(String[] args) {
        // You can call your methods here to test them
        printTriangle(3);
        christmasTree(4);
        christmasTree(10);
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        int j = height - 1;

        while (i <= height) {
            printSpaces(j);
            printStars(i * 2 - 1);
            i++;
            j--;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }
}
