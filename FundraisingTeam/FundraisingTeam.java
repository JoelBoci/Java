import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class FundraisingTeam {
    private ArrayList<Fundraiser> team = new ArrayList<>();

    public FundraisingTeam() {
    }

    public void addMember(Fundraiser fr) {
        team.add(fr);
    }

    public double getTotalRaised() {
        double totalRaised = 0;
        for(Fundraiser fr : team) {
            totalRaised += fr.getAmount();
        }
        return totalRaised;
    }

    public String getTeamDetails() {
        StringBuilder sb = new StringBuilder();
        for(Fundraiser fr : team) {
            sb.append(String.format("%-10s | %7s | %10s", fr.getName(), fr.getId(), getMoney(fr.getAmount())));

            sb.append("\n");
        }
        return sb.toString();
    }

    public String getMoney(double amount) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
        return nf.format(amount);
    }

    public void sortTeam() {
        Collections.sort(team);
    }
}