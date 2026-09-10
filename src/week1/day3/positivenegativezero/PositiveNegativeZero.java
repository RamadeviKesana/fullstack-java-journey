package week1.day3.positivenegativezero;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int value = inputReader.nextInt();

        int result = Integer.compare(value, 0);

        switch (result) {

            case 1:
                System.out.println(value + " is a positive number.");
                break;

            case -1:
                System.out.println(value + " is a negative number.");
                break;

            default:
                System.out.println("The entered number is zero.");
        }

        inputReader.close();
    }
}