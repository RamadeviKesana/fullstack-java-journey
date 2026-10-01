package week4.day5.ooppractice;

public class Rectangle {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);

        rectangle.displayDetails();
    }
}