package Practical_12;

public class Team implements Comparable<Team> {
    private String teamName;
    private Integer wins;
    private Integer draws;
    private Integer losses;
    private Integer points;
    private Integer matchesPlayed;

    // Constructor - set the name of the team to the name passed in and then everything else to 0.
    // (All teams inserted must start at 0 to ensure accuracy in points and fairness between each team)
    public Team(String teamName) {
        this.teamName = teamName;
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;
        this.points = 0;
        this.matchesPlayed = 0;
    }

    // Returns the team name
    public String getTeamName() {
        return teamName;
    }

    // Returns amount of wins
    public Integer getWins() {
        return wins;
    }

    // Update the number of wins
    public void updateWins(int value) {
        this.wins += value; // Add the value entered to increase the wins
        this.points += (3 * value); // Wins = 3 points so times the number passed through by 3
    }

    // Returns amount of draws
    public Integer getDraws() {
        return draws;
    }

    // Update the number of draws
    public void updateDraws(int value) {
        this.draws += value; // Add the value entered to increase the draws
        this.points += value; // Draws = 1 points so times the number passed through by 3
    }

    // Returns amount of losses
    public Integer getLosses() {
        return losses;
    }

    // Update the number of losses
    public void updateLosses(int value) {
        this.losses += value; // Add the value entered to increase the losses
        // Loss = 0 points
    }

    // Display the number of points a team has
    public Integer getPoints() {
        return points;
    }

    // Total matches played
    public Integer getMatchesPlayed() {
        return this.wins + this.draws + this.losses;
    }

    // Human Friendly Representation - as a table format
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-11s%-28s%-12d%-11d%-10d%-10d%-25d", "", getTeamName(), getMatchesPlayed(), getWins(), getDraws(), getLosses(), getPoints()));

        return sb.toString();
    }

    // If there are more than 9 teams, use this printing style
    public String greaterThanTenPosition() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s%-28s%-12d%-11d%-10d%-10d%-25d", "", getTeamName(), getMatchesPlayed(), getWins(), getDraws(), getLosses(), getPoints()));

        return sb.toString();
    }

    // Total ordering of teams in descending order
    @Override
    public int compareTo(Team t) {
        return -this.points.compareTo(t.points);
    }
}
