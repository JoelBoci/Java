package Practical_17;

public class User {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        // Add entries
        pb.addEntry("Joel Boci", "07182992938", "u2155356@unimail.hud.ac.uk", "62 Aurora Boulevard");
        pb.addEntry("Dave Smith", "0748013433", "u2026372@unimail.hud.ac.uk", "1332 Town Avenue");

        // Update entries
//        pb.updateEntry("Joel Boci", "07123456789", "joel@gmail.com", "12 Town Avenue");


        // Remove entries
//        pb.deleteEntry("Dave Smith");


        // Print all the entries
        pb.printAllEntries();


        // Find an entry
//        pb.findEntry("Dave Smith");
    }
}
