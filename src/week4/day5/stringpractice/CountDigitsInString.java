package week4.day5.stringpractice;

import java.util.Scanner;

public class CountDigitsInString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int digitCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }
}