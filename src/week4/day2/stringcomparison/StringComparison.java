package week4.day2.stringcomparison;

import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter second string: ");
        String second = scanner.nextLine();

        System.out.println("Using equals(): "
                + first.equals(second));

        System.out.println("Using equalsIgnoreCase(): "
                + first.equalsIgnoreCase(second));

        System.out.println("Using compareTo(): "
                + first.compareTo(second));

        scanner.close();
    }
}