package week3.day2.arraysumaverage;

import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        int sum = 0;

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {

            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            sum = sum + numbers[i];
        }

        double average = (double) sum / size;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}