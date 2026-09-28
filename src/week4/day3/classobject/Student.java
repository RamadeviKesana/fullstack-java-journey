package week4.day3.classobject;

public class Student {

    int id;
    String name;
    double marks;

    public static void main(String[] args) {

        Student student = new Student();

        student.id = 101;
        student.name = "John";
        student.marks = 88.5;

        System.out.println("Student ID: " + student.id);
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Marks: " + student.marks);
    }
}