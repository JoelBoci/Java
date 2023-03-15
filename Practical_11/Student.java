package Practical_11;

public class Student implements Comparable<Student> {

    private String stuID;

    // Constructor
    public Student(String stuID) {
        this.stuID = stuID;
    }

    // Human-readable representation
    @Override
    public String toString() {
        return "Student {" + stuID + "}";
    }

    // Ordering of students
    @Override
    public int compareTo(Student s) {
        return this.stuID.compareTo(s.stuID); // Sorts an array of students based on their id number (ascending order)
    }
}
