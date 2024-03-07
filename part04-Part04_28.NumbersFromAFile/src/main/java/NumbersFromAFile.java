
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String fileName = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                int number = Integer.valueOf(fileScanner.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        System.out.println("Numbers: " + count);
    }
}





