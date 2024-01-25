
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int numberOfDays = Integer.valueOf(scanner.nextLine());
        long secondsInADay = numberOfDays * 24L * 60 * 60;
        System.out.println(secondsInADay);

    }
}
