package week4.day3.studentresult;

public class StudentResult {

    String name;
    int mark1;
    int mark2;
    int mark3;

    public StudentResult(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    public char calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void displayResult() {

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {

        StudentResult student =
                new StudentResult("Rama", 90, 85, 88);

        student.displayResult();
    }
}