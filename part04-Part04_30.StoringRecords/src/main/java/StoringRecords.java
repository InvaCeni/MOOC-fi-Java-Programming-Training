
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StoringRecords {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        // System.out.println("Filename:");
        // String file = scan.nextLine();

        String file = "data.csv"; // Assuming data.csv is the filename
        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);
        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    persons.add(new Person(name, age));
                }
            }
        } catch (IOException e) {
            System.err.println("Reading the file " + file + " failed.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid age format in the file.");
        }

        return persons;
    }
}
