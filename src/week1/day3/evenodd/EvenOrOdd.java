package week1.day3.evenodd;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int value = inputReader.nextInt();

        String result = ((value & 1) == 0) ? "Even" : "Odd";

        System.out.println(value + " is an " + result + " number.");

        inputReader.close();
    }
}