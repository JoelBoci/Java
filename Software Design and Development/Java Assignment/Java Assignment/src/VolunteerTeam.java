import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class VolunteerTeam {
    public ArrayList<Volunteer> volunteerTeam = new ArrayList<>();

    public VolunteerTeam() {}

    public void addVolunteers(Volunteer v) {
        volunteerTeam.add(v);
    }

    public void deleteVolunteers(Volunteer v) {
        volunteerTeam.remove(v);
    }
    public String findVolunteers(Volunteer v) {
        for(int i = 0; i < volunteerTeam.size(); i++) {
            if(v == volunteerTeam.get(i)) {
                return v.getName() + " is at position " + i + ".";
            }
        }
        return v.getName() + " is not a volunteer in this list.";
    }

    public String printTeam() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n|-------------------------------------------------|\n")
                .append(String.format("%-15s %-15s %15s", "|Name", "Test Kits Delivered", "Wage|"))
                .append("\n|=================================================|\n");

        for(Volunteer v : volunteerTeam) {
            sb.append(v.display());
            sb.append("|-------------------------------------------------|\n");
        }

        sb.append("|").append(getTotalKitsDelivered()).append("\t\t\t\t\t  |").append("\n|").append(getTotalWages()).append("\t\t\t  |")
                .append("\n|-------------------------------------------------|\n");

        return sb.toString();
    }

    public String getTotalKitsDelivered() {
        int totalKitsDelivered = 0;

        for(Volunteer v : volunteerTeam) {
            totalKitsDelivered += v.getTestKitsDelivered();
        }
        return "Total Kits Delivered >>> " +  totalKitsDelivered;
    }

    public String getTotalWages() {
        NumberFormat totalWages= NumberFormat.getCurrencyInstance(Locale.UK);
        double total = 0;

        for(Volunteer v : volunteerTeam) {
            total += v.wages();
        }
        return "Total Wages To Be Paid Out >>> " + totalWages.format(total);
    }

    // Will sort the team in order of kits
    public void sortTeamByKits() {
        Collections.sort(volunteerTeam);
    }

    // Sort the team just by name
    public void sortTeamByName() {
        volunteerTeam.sort(Comparator.comparing(Volunteer::getName));
    }

    public static void main(String[] args) {
        VolunteerTeam vt = new VolunteerTeam();

        Volunteer sofya = new Volunteer("Sofya", 127);
        Volunteer steve = new Volunteer("Steve", 46);
        Volunteer muhammed = new Volunteer("Muhammed", 273);
        Volunteer amaara = new Volunteer("Amaara", 129);
        Volunteer ayub = new Volunteer("Ayub", 129);
        Volunteer tony = new Volunteer("Tony", 17);
        Volunteer rabia = new TeamLeader("Rabia", 385); // Task 6 - (90%)

        vt.addVolunteers(sofya);
        vt.addVolunteers(steve);
        vt.addVolunteers(muhammed);
        vt.addVolunteers(amaara);
        vt.addVolunteers(ayub);
        vt.addVolunteers(tony);
        vt.addVolunteers(rabia);

        System.out.println(vt.printTeam());

        /* For task 4 (70%) - adding test kits and throwing exceptions if unsuitable value such as a negative number is added
        try {
            sofya.addTestKits(13);
            steve.addTestKits(9);
            muhammed.addTestKits(27);
            amaara.addTestKits(33);
            ayub.addTestKits(39);
            tony.addTestKits(106);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(vt.printTeam());
        */



        /* For task 5 (80%) - sort by descending order of kits and alphabetically
        vt.sortTeamByKits(); - For sorting in descending order of kits (alphabetically if kits are the same)

        vt.sortTeamByName(); - For sorting alphabetically

        System.out.println(vt.printTeam());
        */
    }
}
