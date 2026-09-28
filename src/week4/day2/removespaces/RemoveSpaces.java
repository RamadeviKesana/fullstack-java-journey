package week4.day2.removespaces;

import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String withoutSpaces = text.replace(" ", "");

        System.out.println("Without spaces: " + withoutSpaces);

        scanner.close();
    }
}