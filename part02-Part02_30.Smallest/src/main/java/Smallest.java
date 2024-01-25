
public class Smallest {

    public static void main(String[] args) {
        int result = smallest(5, 6);
        System.out.println("Smallest: " + result);

    }
    public static int smallest(int number1, int number2) {
        while (number1 < number2) {
            return number1;
        }
        return number2;
    }

}

