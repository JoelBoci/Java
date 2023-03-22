public class Campaign {
    public static void main(String[] args) {
        FundraisingTeam frt = new FundraisingTeam();

        frt.addMember(new Fundraiser("Steve", 23.99, 670824));
        frt.addMember(new Fundraiser("Ilias", 33.99, 5456));
        frt.addMember(new Fundraiser("Joel", 29.50, 82636));

        System.out.println(frt.getTotalRaised());
        frt.sortTeam();

        System.out.println(frt.getTeamDetails());
    }
}
