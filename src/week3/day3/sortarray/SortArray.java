package week3.day3.sortarray;

import java.util.Scanner;

public class SortArray {

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

        // Manual sorting
        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {

                if (numbers[i] > numbers[j]) {

                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}