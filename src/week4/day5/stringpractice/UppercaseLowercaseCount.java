package week4.day5.stringpractice;

import java.util.Scanner;

public class UppercaseLowercaseCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }

        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);

        scanner.close();
    }
}