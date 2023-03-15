package Practical_17;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, PhoneBookEntry> phoneBookEntryMap;

    // Every instance of the class 'PhoneBook' will create a new HashMap of  Map<String, PhoneBookEntry>
    public PhoneBook() {
        phoneBookEntryMap = new HashMap<>();
    }

    // Add an entry to the phone book
    public void addEntry(String name, String phoneNo, String email, String address) {
        if (!phoneBookEntryMap.containsKey(name)) { // Check if the name is NOT in the list
            PhoneBookEntry pb = new PhoneBookEntry(name, phoneNo, email, address); // Create a new 'PhoneBookEntry' with the values entered
            phoneBookEntryMap.put(name, pb); // Put the entry into the map
        } else { // If it's in the list
            // Print that the name already exists
            System.out.println("----------------------------------------------");
            System.out.println(name + " is already in the phone book.");
            System.out.println("----------------------------------------------\n");
        }
    }

    // Update an existing entry
    public void updateEntry(String name, String phoneNo, String email, String address) {
        if (phoneBookEntryMap.containsKey(name)) { // If the name exists
            deleteEntry(name); // Delete
            addEntry(name, phoneNo, email, address); // Create a new entry with the values
        } else { // If the name does not exist
            // Print that the entry does not exist
            System.out.println("----------------------------------------------");
            System.out.println(name + " is not in the phone book.");
            System.out.println("----------------------------------------------\n");
        }
    }

    // Delete an entry
    public void deleteEntry(String name) {
        if (phoneBookEntryMap.containsKey(name)) { // If the name exists in the phone book
            phoneBookEntryMap.remove(name); // Remove the entry from the list
        } else { // If it does not exist
            // Print that the entry does not exist
            System.out.println("----------------------------------------------");
            System.out.println(name + " is not in the phone book.");
            System.out.println("----------------------------------------------\n");
        }
    }

    // Find an existing entry in the map
    public void findEntry(String name) {
        boolean inList = false; // Currently not in the list
        for (String key : phoneBookEntryMap.keySet()) { // Loop through the map
            if (name.equals(phoneBookEntryMap.get(key).getName())) { // If the name entered exists in the map
                inList = true; // Set the variable to true (means the name exists in the list)
                System.out.println("Name: " + phoneBookEntryMap.get(key).getName() +
                                   "\nPhone Number: " + phoneBookEntryMap.get(key).getPhoneNo());
            }
        }

        // If the variable 'inList' is still false, print this
        if (!inList) {
            System.out.println("----------------------------------------------");
            System.out.println(name + " is not in the phone book.");
            System.out.println("----------------------------------------------\n");
        }
    }

    // Loops through the map and prints all entries
    public void printAllEntries() {
        for (String key : phoneBookEntryMap.keySet()) {
            System.out.println(phoneBookEntryMap.get(key));
        }
    }
}
