package Practical_11;

import java.util.Collections;

public class Module {
    private String moduleID;
    private Student[] class_list;
    private Integer enrolled;

    // Constructor - set attributes to these values
    public Module(String moduleID) {
        this.moduleID = moduleID;
        this.class_list = new Student[5];
        this.enrolled = 0;
    }

    // To search for a particular student - used for the enrolment process
    public int searchStudent(Student s) {
        Integer outcome = 0;
        for(int i = 0; i < this.enrolled; i++) {
            if(getArray()[i].compareTo(s) == 0) {
                outcome = 1;
            }
        }
        return outcome;
    }

    // Enrol a student
    public void enrol(Student s) {
        if(searchStudent(s) == 0) { // Previous method above, if 0 (not in the array)
            this.class_list[this.enrolled] = s; // Sets the current index of the class_list to the student
            this.enrolled++; // Increase index
            selectionSortStudents(getArray()); // Sorts the array using the selection sort algorithm
        } else {
            // Display that the student has already enrolled
            System.out.println("\n\t|--------------------------------------------------------------|");
            System.out.println("\t|" + s + " has already enrolled in the module " + getModuleID() + ".|");
            System.out.println("\t|--------------------------------------------------------------|");
        }
    }

    public void unEnroll(Student s) {
        for(int i = 0; i < this.enrolled; i++) {
            if(class_list[i].compareTo(s) == 0) { // If the student is in the array
                class_list[i] = class_list[i + 1]; // Set the value of the current index to the value of the next element

                for(int j = i; j < this.enrolled; j++) { // Loop through from current position of i to the end of this.enrolled
                    class_list[j] = class_list[j + 1]; // Set value of j to the next elements value
                    class_list[j + 1] = null; // Set the value of the next element to null
                }
                this.enrolled--; // Reduce number of enrolled students
            }
        }
    }

    // Used for the selection sort algorithm
    public void swap(Student[] s, int from, int to) {
        Student tmp = getArray()[from];
        getArray()[from] = getArray()[to];
        getArray()[to] = tmp;
    }

    // Sorts the students based on their ID using selection sort
    private void selectionSortStudents(Student[] array) {
        for(int lastUnsorted = this.enrolled - 1; lastUnsorted > 0; lastUnsorted--) {
            int index = lastUnsorted;

            for(int nextToCompare = 0; nextToCompare < lastUnsorted; nextToCompare++) {
                if(array[nextToCompare].compareTo(array[index]) > 0) {
                    index = nextToCompare;
                }
            }
            swap(array, index, lastUnsorted);
        }
    }

    // Returns array of students
    public Student[] getArray() {
        return class_list;
    }

    // Returns the size of the array
    public int getSize() {
        return class_list.length;
    }

    public String getModuleID() {
        return moduleID;
    }

    // Human friendly representation
    @Override
    public String toString() {
        String output = "";
        output += "\nModule {\n";
        output += "\tModule ID = " + getModuleID() + "\n";

        output += "\tClass List: ";
        // Loop through students array and prints out students
        for(int i = 0; i < this.enrolled; i++) {
            output += this.class_list[i] + "\n\t\t\t\t";
        }
        output += "\n}";
        return output;
    }
}
