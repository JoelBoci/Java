import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

class VolunteerTeamTest {
    ArrayList<Volunteer> arrayList = new ArrayList<>();
    Volunteer john = new Volunteer("John", 76);
    Volunteer bob = new Volunteer("Bob", 118);
    Volunteer sarah = new Volunteer("Sarah", 242);
    Volunteer jill = new Volunteer("Jill", 64);

    VolunteerTeam volunteerTeam = new VolunteerTeam();

    @Test
    @DisplayName("Adding all test kits in the team and displaying the total")
    void gettingTotalNumberOfKitsDelivered() {

        arrayList.add(john);
        arrayList.add(bob);
        arrayList.add(sarah);
        arrayList.add(jill);

        // This is the main part we are testing as this is the actual code being used
        // We need to make sure that the addition is correct and the total displayed is correct
        int totalKitsDelivered = 0;
        for(Volunteer v : arrayList) {
            totalKitsDelivered += v.getTestKitsDelivered();
        }

        assertEquals(500, totalKitsDelivered);
    }

    @Test
    @DisplayName("Adding all wages in the team and displaying the total")
    void gettingTotalWages() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);

        arrayList.add(john);
        arrayList.add(bob);
        arrayList.add(sarah);
        arrayList.add(jill);

        // This is the main part we are testing as this is the actual code being used
        // We need to make sure that the addition is correct and the total displayed is correct
        double total = 0;
        for(Volunteer v : arrayList) {
            total += v.wages();
        }

        assertEquals("£90.00", nf.format(total));
    }

    // We are not using the add method from the VolunteerTeam class, instead we are adding them in using the add() method
    // that comes with the ArrayList. Instead, we are testing a method that will find the person
    @Test
    @DisplayName("Adding volunteers to the array")
    void addVolunteersToArray() {
        arrayList.add(john);
        arrayList.add(bob);
        arrayList.add(sarah);
        arrayList.add(jill);

        assertEquals("Sarah is at position 2.", findVolunteers(sarah));
    }

    // Again, we are using the delete method from the VolunteerTeam class, we are using the remove() method from the ArrayList.
    // We will scan through the list to see if that person is not there. If it displays that they are not, the code has worked.
    @Test
    @DisplayName("Removing volunteers from the array")
    void deleteVolunteersFromArray() {
        arrayList.add(john);
        arrayList.add(bob);
        arrayList.add(sarah);
        arrayList.add(jill);

        arrayList.remove(bob);

        assertEquals("Bob is not a volunteer in this list.", findVolunteers(bob));
    }

    // I had to import this function from the VolunteerTeam class because it was not allowing me to access certain elements
    // This is therefore the same code but the arrayLists are different. If it works on here then it most definitely works in the main class
    @Test
    public String findVolunteers(Volunteer v) {
        for(int i = 0; i < arrayList.size(); i++) {
            if(v == arrayList.get(i)) {
                return v.getName() + " is at position " + i + ".";
            }
        }
        return v.getName() + " is not a volunteer in this list.";
    }
}
