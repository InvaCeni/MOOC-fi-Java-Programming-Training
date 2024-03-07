
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.nio.file.Files;
import java.io.IOException;


public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(searchedFor)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        scanner.close();
    }
}





