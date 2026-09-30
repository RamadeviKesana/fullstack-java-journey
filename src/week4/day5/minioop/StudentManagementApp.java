package week4.day5.minioop;

public class StudentManagementApp {

    int id;
    String name;
    double marks;

    public StudentManagementApp(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }

    public char calculateGrade() {

        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        StudentManagementApp student1 =
                new StudentManagementApp(101, "John", 88.5);

        StudentManagementApp student2 =
                new StudentManagementApp(102, "Rama", 94.0);

        StudentManagementApp student3 =
                new StudentManagementApp(103, "David", 72.5);

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}