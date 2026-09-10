package week1.day3.agecategory;

import java.util.Scanner;

public class AgeCategoryChecker {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int years = inputReader.nextInt();

        String ageGroup = (years >= 60) ? "Senior"
                : (years >= 20) ? "Adult"
                : (years >= 13) ? "Teenager"
                : "Child";

        System.out.println("Age category: " + ageGroup);

        inputReader.close();
    }
}