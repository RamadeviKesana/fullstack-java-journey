package week3.day4.methodpractice;

public class MaximumOfThree {

    public static void main(String[] args) {

        int result = findMaximum(10, 35, 20);

        System.out.println("Maximum: " + result);
    }

    public static int findMaximum(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}