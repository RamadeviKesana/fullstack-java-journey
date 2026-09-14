package week2.day2.factorial;

import java.util.Scanner;

public class FactorialProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorialFor = 1;

        for (int i = 1; i <= number; i++) {
            factorialFor = factorialFor * i;
        }

        System.out.println("Factorial using for loop: " + factorialFor);


        long factorialWhile = 1;
        int i = 1;

        while (i <= number) {
            factorialWhile = factorialWhile * i;
            i++;
        }

        System.out.println("Factorial using while loop: " + factorialWhile);

        scanner.close();
    }
}