
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());

                    String ageString = (age == 1) ? "1 year" : age + " years";
                    System.out.println(name + ", age: " + ageString);
                }
            }
        } catch (IOException e) {
            System.err.println("Reading the file " + fileName + " failed.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid age format in the file.");
        }

        scanner.close();
    }
}


