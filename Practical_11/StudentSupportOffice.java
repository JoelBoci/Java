package Practical_11;

public class StudentSupportOffice {

    public static void main(String[] args) {
        // Creating modules
        Module cis2206 = new Module("CIS2206");
        Module cis2360 = new Module("CIS2360");
        Module cis2205 = new Module("CIS2205");

        // Creating students
        Student u0000001 = new Student("U0000001");
        Student u0000002 = new Student("U0000002");
        Student u0000003 = new Student("U0000003");
        Student u0000004 = new Student("U0000004");
        Student u0000005 = new Student("U0000005");

        // Module CIS2206
        cis2206.enrol(u0000001);
        cis2206.enrol(u0000005);
        cis2206.unEnroll(u0000005);
        cis2206.enrol(u0000003);
        cis2206.enrol(u0000004);
        System.out.println(cis2206);



        // Module CIS2360
        cis2360.enrol(u0000001);
        cis2360.enrol(u0000003);
        cis2360.enrol(u0000004);
        cis2360.enrol(u0000002);
        cis2360.enrol(u0000005);
        System.out.println(cis2360);

        

        // Module CIS2205
        cis2205.enrol(u0000002);
        cis2205.enrol(u0000004);
        cis2205.enrol(u0000005);
        cis2205.unEnroll(u0000002);
        cis2205.unEnroll(u0000005);
        cis2205.enrol(u0000001);
        cis2205.enrol(u0000003);
        System.out.println(cis2205);
    }
}
