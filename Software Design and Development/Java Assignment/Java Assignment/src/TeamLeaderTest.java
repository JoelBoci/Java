import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.NumberFormat;
import java.util.Locale;


class TeamLeaderTest {

    @Test
    @DisplayName("Calculating the wages for TEAM LEADERS")
    void calculateWages() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
        TeamLeader teamLeader1 = new TeamLeader("Test1", 100);
        TeamLeader teamLeader2 = new TeamLeader("Test2", 736);
        TeamLeader teamLeader3 = new TeamLeader("Test3", 1461);

        assertEquals("£21.00", nf.format(teamLeader1.wages()));
        assertEquals("£173.64", nf.format(teamLeader2.wages()));
        assertEquals("£347.64", nf.format(teamLeader3.wages()));
    }
}