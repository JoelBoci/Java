import java.text.NumberFormat;
import java.util.Locale;

public class Volunteer implements Comparable<Volunteer> {
    private String name;
    private int testKitsDelivered;

    public Volunteer(String name, int testKitsDelivered) {
        this.name = name;
        this.testKitsDelivered = testKitsDelivered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestKitsDelivered() {
        return testKitsDelivered;
    }

    public void setTestKitsDelivered(int testKitsDelivered) {
        this.testKitsDelivered = testKitsDelivered;
    }

    public double wages() {
        double wage = 0;

        // If volunteers have delivered more than 50 kits
        if (testKitsDelivered > 50) {
            // Calculate first 50 kits
            wage += 50 * 0.15;
            int minusFifty = testKitsDelivered - 50; // Take value of kits - 50

            // For every test kit delivered above 50
            if ((testKitsDelivered - 50) > 0) {
                wage += minusFifty * 0.20; // Add value to wage if kitsDelivered - 50 is greater than 0
            }
            // If volunteers have delivered 50 or less kits
        } else {
            wage += testKitsDelivered * 0.15;
        }
        return wage;
    }

    public int addTestKits(int testKits) throws Exception {
        if (testKits <= 0) {
            throw new Exception("The number of test kits added must be greater than 0");
        } else {
            testKitsDelivered += testKits;
        }

        return testKitsDelivered;
    }

    public String display() {
        NumberFormat money = NumberFormat.getCurrencyInstance(Locale.UK);
        return String.format("%-15s %11d %23s\n", "|" + getName(), getTestKitsDelivered(), money.format(wages()) + "|");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " + "Kits Delivered: " + testKitsDelivered + ", " + "Wage: " + wages();
    }

    // Compares test kits to sort them in descending order
    @Override
    public int compareTo(Volunteer v) {
        if(v.getTestKitsDelivered() > this.getTestKitsDelivered()) {
            return 1;

        } else if(v.getTestKitsDelivered() < this.getTestKitsDelivered()) {
            return -1;

            // If the number of kits is equal, the volunteers will be sorted alphabetically
        } else {
            int compareInt = this.name.compareTo(v.getName());
            return Integer.compare(compareInt, 0);
        }
    }
}

