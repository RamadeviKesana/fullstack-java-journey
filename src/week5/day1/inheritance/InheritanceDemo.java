package week5.day1.inheritance;

class Person {

    String name = "Rama";

    public void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    int marks = 90;

    public void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Student student = new Student();

        student.displayName();
        student.displayMarks();
    }
}