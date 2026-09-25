package week3.day5.miniconsole;

import java.util.Scanner;

public class MiniConsoleTool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Mini Console Tool");
        System.out.println("1. Display Array");
        System.out.println("2. Find Sum");
        System.out.println("3. Find Maximum");
        System.out.println("4. Search Number");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                displayArray(numbers);
                break;

            case 2:
                System.out.println("Sum: " + findSum(numbers));
                break;

            case 3:
                System.out.println("Maximum: " + findMax(numbers));
                break;

            case 4:
                System.out.print("Enter number to search: ");
                int searchNumber = scanner.nextInt();

                if (search(numbers, searchNumber)) {
                    System.out.println(searchNumber + " found in the array");
                } else {
                    System.out.println(searchNumber + " not found");
                }
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

    public static int findSum(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        return sum;
    }

    public static int findMax(int[] numbers) {

        int max = numbers[0];

        for (int number : numbers) {

            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public static boolean search(int[] numbers, int searchNumber) {

        for (int number : numbers) {

            if (number == searchNumber) {
                return true;
            }
        }

        return false;
    }
}