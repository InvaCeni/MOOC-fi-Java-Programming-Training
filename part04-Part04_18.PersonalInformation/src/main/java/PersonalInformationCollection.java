
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine().trim();

            System.out.print("Identification number: ");
            String identificationNumber = scanner.nextLine().trim();

            PersonalInformation person = new PersonalInformation(firstName, lastName, identificationNumber);
            infoCollection.add(person);
        }

        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}


