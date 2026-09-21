package week2.day5.logicrevision;

import java.util.Scanner;

public class LargestDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int largest = 0;

        while (number != 0) {

            int digit = number % 10;

            if (digit > largest) {
                largest = digit;
            }

            number = number / 10;
        }

        System.out.println("Largest digit: " + largest);

        scanner.close();
    }
}