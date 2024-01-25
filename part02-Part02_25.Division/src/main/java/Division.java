

public class Division {

    public static void main(String[] args) {

        division(10, 3);

    }

    public static void division(int numerator, int denominator) {
        // Ensure that the denominator is not zero to avoid division by zero
        if (denominator != 0) {
            // Perform division and print the result as a floating-point number
            double result = (double) numerator / denominator;
            System.out.println("Result of division: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

}

