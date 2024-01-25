
public class Greatest {

    public static void main(String[] args) {
        int result = greatest(2, 3, 4);
        System.out.println("Greatest: " + result);
    }
    public static int greatest(int number1, int number2, int number3) {
        int max = Math.max(number1, Math.max(number2, number3));
        return max;

    }

}


