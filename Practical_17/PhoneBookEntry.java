package Practical_17;

public class PhoneBookEntry {
    private String name;
    private String phoneNo;
    private String email;
    private String address;

    // Create a new entry with these pieces of information
    public PhoneBookEntry(String name, String phoneNo, String email, String address) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
    }

    // Getter to return the name
    public String getName() {
        return name;
    }

    // Getter to return the phone number
    public String getPhoneNo() {
        return phoneNo;
    }

    // Getter to return the email
    public String getEmail() {
        return email;
    }

    // Getter to return the address
    public String getAddress() {
        return address;
    }

    // Human friendly representation
    @Override
    public String toString() {
        return "Phone Book Entry {" +
                "\n\tFull Name: '" + this.name + "'" +
                "\n\tPhone Number: '" + this.phoneNo + "'" +
                "\n\tEmail: '" + this.email + "'" +
                "\n\tAddress: '" + this.address + "'" +
                "\n}\n";
    }
}
