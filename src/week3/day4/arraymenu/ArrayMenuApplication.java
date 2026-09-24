package week3.day4.arraymenu;

import java.util.Scanner;

public class ArrayMenuApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {40, 10, 30, 20, 50};

        System.out.println("Array Menu");
        System.out.println("1. Display Array");
        System.out.println("2. Search Element");
        System.out.println("3. Reverse Array");
        System.out.println("4. Sort Array");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                displayArray(numbers);
                break;

            case 2:
                System.out.print("Enter number to search: ");
                int searchNumber = scanner.nextInt();
                search(numbers, searchNumber);
                break;

            case 3:
                reverse(numbers);
                break;

            case 4:
                sort(numbers);
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static void displayArray(int[] numbers) {

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    public static void search(int[] numbers, int searchNumber) {

        boolean found = false;

        for (int number : numbers) {

            if (number == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchNumber + " found in the array");
        } else {
            System.out.println(searchNumber + " not found");
        }
    }

    public static void reverse(int[] numbers) {

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }

    public static void sort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {

                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        displayArray(numbers);
    }
}