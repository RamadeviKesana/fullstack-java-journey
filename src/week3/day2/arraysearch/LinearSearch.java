package week3.day2.arraysearch;

import java.util.Scanner;

public class LinearSearch {

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

        System.out.print("Enter number to search: ");
        int searchNumber = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (numbers[i] == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchNumber + " is present in the array.");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }

        scanner.close();
    }
}