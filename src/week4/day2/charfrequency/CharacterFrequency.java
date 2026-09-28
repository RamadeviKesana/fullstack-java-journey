package week4.day2.charfrequency;

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        System.out.print("Enter a character to search: ");
        char searchChar = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == searchChar) {
                count++;
            }
        }

        System.out.println(
                searchChar + " appears " + count + " times."
        );

        scanner.close();
    }
}