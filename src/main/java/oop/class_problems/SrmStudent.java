package oop.class_problems;

public class SrmStudent {

    static String collegeName;
    static String academicYear;

    static {
        collegeName = "SRM Institute of Science and Technology";
        academicYear = "2026-2027";
        System.out.println("College info loaded");
    }

    String studentName;

    public SrmStudent(String studentName) {
        this.studentName = studentName;
    }

    public void printConfirmation() {
        System.out.println("Student record created: " + studentName);
    }

    public static void main(String[] args) {

        String[] names = {
                "Ravi",
                "Meera",
                "Karthik",
                "Divya",
                "Anitha"
        };

        for (String name : names) {
            SrmStudent student = new SrmStudent(name);
            student.printConfirmation();
        }
    }
}