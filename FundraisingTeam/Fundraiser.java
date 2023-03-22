public class Fundraiser implements Comparable<Fundraiser>{
    private String name;
    private double amount;
    private int id;

    public Fundraiser(String name, double amount, int id) {
        this.name = name;
        this.amount = amount;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", " + amount +
                ", " + id;
    }

    @Override 
    public int compareTo(Fundraiser fr) {
        if(fr.getAmount() > this.getAmount()) {
            return 1;
        } else if (fr.getAmount() < this.getAmount()) {
            return -1;
        } else {
            return 0;
        }
    }
}