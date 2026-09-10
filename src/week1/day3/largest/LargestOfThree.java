package week1.day3.largest;

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter value 1: ");
        int firstValue = inputReader.nextInt();

        System.out.print("Enter value 2: ");
        int secondValue = inputReader.nextInt();

        System.out.print("Enter value 3: ");
        int thirdValue = inputReader.nextInt();

        int biggerOfFirstTwo = Math.max(firstValue, secondValue);
        int largestValue = Math.max(biggerOfFirstTwo, thirdValue);

        System.out.println("Largest number is: " + largestValue);

        inputReader.close();
    }
}