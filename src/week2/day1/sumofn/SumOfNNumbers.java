package week2.day1.sumofn;

import java.util.Scanner;

public class SumOfNNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum from 1 to " + n + " is: " + sum);

        scanner.close();
    }
}