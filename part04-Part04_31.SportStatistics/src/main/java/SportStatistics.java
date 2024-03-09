
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scanner.nextLine();

        System.out.println("Team:");
        String teamName = scanner.nextLine();

        int[] stats = getTeamStats(fileName, teamName);
        int gamesPlayed = stats[0];
        int wins = stats[1];
        int losses = stats[2];

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static int[] getTeamStats(String fileName, String teamName) {
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String homeTeam = parts[0].trim();
                    String awayTeam = parts[1].trim();
                    int homePoints = Integer.parseInt(parts[2].trim());
                    int awayPoints = Integer.parseInt(parts[3].trim());

                    if (homeTeam.equals(teamName) || awayTeam.equals(teamName)) {
                        gamesPlayed++;
                        if ((homeTeam.equals(teamName) && homePoints > awayPoints) ||
                                (awayTeam.equals(teamName) && awayPoints > homePoints)) {
                            wins++;
                        } else {
                            losses++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return new int[]{gamesPlayed, wins, losses};
    }
}
