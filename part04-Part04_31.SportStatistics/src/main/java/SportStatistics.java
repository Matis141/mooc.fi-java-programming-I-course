
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int countGames = 0;
        int countWins = 0;
        int countLosses = 0;
        
        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int awayTeamPoints = Integer.valueOf(parts[3]);

                if (team.equals(homeTeam)) {
                    countGames++;
                    if (homeTeamPoints > awayTeamPoints) {
                        countWins++;
                    } else {
                        countLosses++;
                    }
                }
                if (team.equals(awayTeam)) {
                    countGames++;
                    if (awayTeamPoints > homeTeamPoints) {
                        countWins++;
                    } else {
                        countLosses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + countGames);
        System.out.println("Wins: " + countWins);
        System.out.println("Losses: " + countLosses);
    }

}
