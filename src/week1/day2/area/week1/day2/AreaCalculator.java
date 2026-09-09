package week1.day2.area;

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        double circleArea = Math.PI * radius * radius;

        System.out.println("Area of Circle: " + circleArea);


        // Rectangle
        System.out.print("\nEnter length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        double rectangleArea = length * width;

        System.out.println("Area of Rectangle: " + rectangleArea);


        // Triangle
        System.out.print("\nEnter base of triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();

        double triangleArea = 0.5 * base * height;

        System.out.println("Area of Triangle: " + triangleArea);

        scanner.close();
    }
}