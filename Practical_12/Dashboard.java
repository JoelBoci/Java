package Practical_12;

public class Dashboard {
    public static void main(String[] args) {
        FootballLeague premierLeague = new FootballLeague();

        // All premier league teams
        Team manU = new Team("Manchester United");
        Team manCity = new Team("Manchester City");
        Team liverpool = new Team("Liverpool");
        Team westHam = new Team("West Ham United");
        Team wolves = new Team("Wolves");
        Team chelsea = new Team("Chelsea");
        Team arsenal = new Team("Arsenal");
        Team everton = new Team("Everton");
        Team fulham = new Team("Fulham");
        Team newcastle = new Team("Newcastle United");
        Team brentford = new Team("Brentford");
        Team tottenham = new Team("Tottenham Hotspur");
        Team astonVilla = new Team("Aston Villa");
        Team leeds = new Team("Leeds United");
        Team brighton = new Team("Brighton and Hove Albion");
        Team crystalPalace = new Team("Crystal Palace");
        Team leicester = new Team("Leicester City");
        Team bournemouth = new Team("Bournemouth");
        Team southampton = new Team("Southampton");
        Team nottingham = new Team("Nottingham Forest");

        // Adding the teams to the list
        premierLeague.addTeam(manU);
        premierLeague.addTeam(manCity);
        premierLeague.addTeam(liverpool);
        premierLeague.addTeam(westHam);
        premierLeague.addTeam(wolves);
        premierLeague.addTeam(chelsea);
        premierLeague.addTeam(arsenal);
        premierLeague.addTeam(everton);
        premierLeague.addTeam(fulham);
        premierLeague.addTeam(newcastle);
        premierLeague.addTeam(brentford);
        premierLeague.addTeam(tottenham);
        premierLeague.addTeam(astonVilla);
        premierLeague.addTeam(leeds);
        premierLeague.addTeam(brighton);
        premierLeague.addTeam(crystalPalace);
        premierLeague.addTeam(leicester);
        premierLeague.addTeam(bournemouth);
        premierLeague.addTeam(southampton);
        premierLeague.addTeam(nottingham);


        // Wins, losses, and draws for each team, all adding up to 38
        manU.updateLosses(12);
        manU.updateDraws(10);
        manU.updateWins(16);

        manCity.updateLosses(3);
        manCity.updateDraws(6);
        manCity.updateWins(29);

        liverpool.updateLosses(2);
        liverpool.updateDraws(8);
        liverpool.updateWins(28);

        westHam.updateLosses(14);
        westHam.updateDraws(8);
        westHam.updateWins(16);

        wolves.updateLosses(17);
        wolves.updateDraws(6);
        wolves.updateWins(15);

        chelsea.updateLosses(6);
        chelsea.updateDraws(11);
        chelsea.updateWins(21);

        arsenal.updateLosses(13);
        arsenal.updateDraws(3);
        arsenal.updateWins(22);

        everton.updateLosses(21);
        everton.updateDraws(6);
        everton.updateWins(11);

        fulham.updateLosses(17);
        fulham.updateDraws(14);
        fulham.updateWins(7);

        newcastle.updateLosses(15);
        newcastle.updateDraws(10);
        newcastle.updateWins(13);

        brentford.updateLosses(18);
        brentford.updateDraws(7);
        brentford.updateWins(13);

        tottenham.updateLosses(11);
        tottenham.updateDraws(5);
        tottenham.updateWins(22);

        astonVilla.updateLosses(19);
        astonVilla.updateDraws(6);
        astonVilla.updateWins(13);

        leeds.updateLosses(18);
        leeds.updateDraws(11);
        leeds.updateWins(9);

        brighton.updateLosses(11);
        brighton.updateDraws(15);
        brighton.updateWins(12);

        crystalPalace.updateLosses(12);
        crystalPalace.updateDraws(15);
        crystalPalace.updateWins(11);

        leicester.updateLosses(14);
        leicester.updateDraws(10);
        leicester.updateWins(14);

        bournemouth.updateLosses(27);
        bournemouth.updateDraws(5);
        bournemouth.updateWins(6);

        southampton.updateLosses(16);
        southampton.updateDraws(13);
        southampton.updateWins(9);

        nottingham.updateLosses(26);
        nottingham.updateDraws(7);
        nottingham.updateWins(5);

        // Remove a team
//        premierLeague.removeTeam(nottingham);

        // Sort the team
        premierLeague.sortTeam();
        // Print the table
        System.out.println(premierLeague);

        // Relegate teams
//        premierLeague.relegateTeams();
    }
}
