package week4.day3.constructors;

public class StudentConstructor {

    int id;
    String name;

    public StudentConstructor() {
        id = 101;
        name = "John";
    }

    public StudentConstructor(int studentId, String studentName) {
        id = studentId;
        name = studentName;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {

        StudentConstructor student1 = new StudentConstructor();

        StudentConstructor student2 =
                new StudentConstructor(102, "Rama");

        System.out.println("Default Constructor:");
        student1.display();

        System.out.println("\nParameterized Constructor:");
        student2.display();
    }
}