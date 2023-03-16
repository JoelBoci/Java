import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.NumberFormat;
import java.util.Locale;

class VolunteerTest {

    @Test
    @DisplayName("Calculating the wages for REGULAR volunteers")
    void calculateWage() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
        Volunteer john = new Volunteer("John", 78);
        Volunteer bob = new Volunteer("Bob", 481);
        Volunteer sarah = new Volunteer("Sarah", 749);

        assertEquals("£13.10", nf.format(john.wages()));
        assertEquals("£93.70", nf.format(bob.wages()));
        assertEquals("£147.30", nf.format(sarah.wages()));
    }

    @Test
    @DisplayName("Adding additional test kits to the current test kits")
    void addingTestKits() throws Exception {
        Volunteer john = new Volunteer("John", 63);
        Volunteer sarah = new Volunteer("Sarah", 112);

        assertEquals(100, john.addTestKits(37));
        assertEquals(187, sarah.addTestKits(75));

        assertThrows(Exception.class, () -> {
            john.addTestKits(-12);
        });

        assertThrows(Exception.class, () -> {
            sarah.addTestKits(0);
        });
    }

    @Test
    @DisplayName("Testing the toString() method")
    void toStringMethod() {
        Volunteer bob = new Volunteer("Bob", 20);
        Volunteer sam = new Volunteer("Sam", 21);

        assertEquals("Name: Bob, Kits Delivered: 20, Wage: 3.0", bob.toString());
        assertEquals("Name: Sam, Kits Delivered: 21, Wage: 3.15", sam.toString());
    }

    @Test
    @DisplayName("Testing the name getter method")
    void testingNameGetterMethod() {
        Volunteer sam = new Volunteer("Sam", 21);
        Volunteer lando = new Volunteer("Lando", 35);

        String samName = sam.getName();
        String landoName = lando.getName();

        assertEquals("Sam", samName);
        assertEquals("Lando", landoName);
    }

    @Test
    @DisplayName("Testing the kits delivered getter method")
    void testingTestKitsDeliveredGetterMethod() {
        Volunteer sam = new Volunteer("Sam", 21);
        Volunteer lando = new Volunteer("Lando", 35);

        int samKits = sam.getTestKitsDelivered();
        int landoKits = lando.getTestKitsDelivered();

        assertEquals(21, samKits);
        assertEquals(35, landoKits);
    }
}