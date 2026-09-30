package week4.day4.encapsulation;

public class StudentEncapsulation {

    private int id;
    private String name;
    private double marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {

        StudentEncapsulation student = new StudentEncapsulation();

        student.setId(101);
        student.setName("John");
        student.setMarks(88.5);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Marks: " + student.getMarks());
    }
}