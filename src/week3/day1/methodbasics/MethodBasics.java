package week3.day1.methodbasics;

public class MethodBasics {

    public static void main(String[] args) {

        // Calling a method with no return value
        printWelcomeMessage();

        // Calling a method that returns a value
        int result = addNumbers();

        System.out.println("Addition Result: " + result);
    }

    // Method without return value
    public static void printWelcomeMessage() {

        System.out.println("Welcome to Java Methods!");
    }

    // Method with return value
    public static int addNumbers() {

        int num1 = 10;
        int num2 = 20;

        return num1 + num2;
    }
}