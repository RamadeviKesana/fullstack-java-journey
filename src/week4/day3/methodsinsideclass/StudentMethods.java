package week4.day3.methodsinsideclass;

public class StudentMethods {

    int id;
    String name;

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public void updateName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {

        StudentMethods student = new StudentMethods();

        student.id = 101;
        student.name = "John";

        System.out.println("Before Update:");
        student.displayDetails();

        student.updateName("Rama");

        System.out.println("\nAfter Update:");
        student.displayDetails();
    }
}