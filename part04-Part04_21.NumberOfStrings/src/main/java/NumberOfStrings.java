
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            String word = scanner.nextLine();
            if(word.equals("end")){
                break;
            }
            count++; // Increment count for each string entered
        }

        System.out.println(count); // Print the count of strings read
    }
}

