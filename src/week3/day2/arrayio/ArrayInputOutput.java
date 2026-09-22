package week3.day2.arrayio;

import java.util.Scanner;

public class ArrayInputOutput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to store? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nNumbers stored in the array:");

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}