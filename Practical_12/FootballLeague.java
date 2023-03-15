package Practical_12;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FootballLeague {
    private List<Team> footballLeague;

    // Constructor initialises football league list when a new object is sade
    public FootballLeague() {
        footballLeague = new LinkedList<>();
    }

    // Add a team to the list
    public void addTeam(Team t) {
        // Check if the team is already in the list
        if(footballLeague.contains(t)) {
            System.out.println("-> " + t.getTeamName() + " is already in the league!\n");
        } else { // Not in list
            footballLeague.add(t);
            System.out.println(this); // Print table
        }
    }

    // Remove a team from the list
    public void removeTeam(Team t) {
        if(footballLeague.contains(t)) { // If the team exists
            footballLeague.remove(t); // Remove the team
            System.out.println(this); // Print table
        } else { // If the team is not in the list
            System.out.println("That team does not exist!");
        }
    }

    // Relegate the last 3 teams in the list
    public void relegateTeams() {
        for(int i = footballLeague.size() - 3; i <= footballLeague.size() - 1; i++) {
            System.out.println("-> " + footballLeague.get(i).getTeamName() + " have been relegated with " + footballLeague.get(i).getPoints() + " points.\n");
            footballLeague.remove(i);
            i--; // Have to take 1 off 'i' because without it, it will skip a team as one got remove
                 // Must return to the previous position of the list
        }
        System.out.println(this); // Print table
    }

    // Sort the team in descending order using the compareTo() from the 'Team' class
    public void sortTeam() {
        Collections.sort(footballLeague);
    }

    // Human friendly representation - table format
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Headers
        sb.append(String.format("%-12s%-27s%-12s%-10s%-10s%-10s%-25s", "Position", "Name", "Played", "Wins", "Draws", "Losses", "Points"));
        sb.append("\n---------------------------------------------------------------------------------------\n");

        // Set position to 1 (a team cannot be 0th place)
        Integer position = 1;

        for (Team t : footballLeague) {
            if(position < 10) { // If position is less than 10
                sb.append(position);
                sb.append(t.toString()); // Use the regular toString() format
                sb.append("\n");
                position++;
            } else { // If the position is greater than or equal to 10, use this formatting
                sb.append(position);
                sb.append(t.greaterThanTenPosition()); // Use this formatting when the number of positions is greater than or equal to 10
                sb.append("\n");
                position++;
            }
        }

        return sb.toString();
    }
}
