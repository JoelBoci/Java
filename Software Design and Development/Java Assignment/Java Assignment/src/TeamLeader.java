import java.text.NumberFormat;
import java.util.Locale;

public class TeamLeader extends Volunteer {

    public TeamLeader(String name, int testKitsDelivered) {
        super(name, testKitsDelivered);
    }

    @Override
    public double wages() {
        return super.wages() * 1.2;
    }

    @Override
    public String display() {
        NumberFormat money = NumberFormat.getCurrencyInstance(Locale.UK);
        return String.format("%-15s %11d %23s\n", "|" + getName() + "(TL)", getTestKitsDelivered(), money.format(wages()) + "|");
    }
}
