package week3.day4.methodpractice;

public class SquareCalculator {

    public static void main(String[] args) {

        int result = findSquare(6);

        System.out.println("Square: " + result);
    }

    public static int findSquare(int number) {

        return number * number;
    }
}