
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String name = scan.nextLine();

        System.out.println("Give an integer:");
        int values = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double cake = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean booLi = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + name);
        System.out.println("You gave the integer " + values);
        System.out.println("You gave the double " + cake);
        System.out.println("You gave the boolean " + booLi);



    }
}
