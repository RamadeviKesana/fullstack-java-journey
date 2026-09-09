package week1.day2.swap;

public class SwapNumbers {

    public static void main(String[] args) {

        // Using temporary variable
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping using temporary variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Without temporary variable
        int x = 30;
        int y = 40;

        System.out.println("\nBefore swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("\nAfter swapping without temporary variable:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}