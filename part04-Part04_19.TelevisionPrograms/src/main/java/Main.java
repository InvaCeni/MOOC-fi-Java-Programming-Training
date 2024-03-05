import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();

        // Read television programs from the user
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));
        }

        // Prompt for maximum duration
        System.out.print("\nProgram's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        // Print programs whose duration is smaller or equal to the specified maximum duration
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program.getName() + ", " + program.getDuration() + " minutes");
            }
        }
    }
}
