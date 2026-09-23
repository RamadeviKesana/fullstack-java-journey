package week3.day3.duplicateelements;

import java.util.Scanner;

public class DuplicateElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Duplicate elements:");

        boolean foundDuplicate = false;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    foundDuplicate = true;
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }

        scanner.close();
    }
}