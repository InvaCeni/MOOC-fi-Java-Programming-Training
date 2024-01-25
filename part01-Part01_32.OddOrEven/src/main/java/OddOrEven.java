
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int numberInput = Integer.valueOf(scan.nextLine());

        if (numberInput % 2 == 0) {
            System.out.println("Number " + numberInput + " is even.");
        } else {
            System.out.println("Number " + numberInput + " is odd.");
        }
    }
}
