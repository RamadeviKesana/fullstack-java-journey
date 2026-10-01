package week4.day5.stringpractice;

import java.util.Scanner;

public class ReverseEachWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[] words = text.split(" ");

        for (String word : words) {

            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }

            System.out.print(reversed + " ");
        }

        scanner.close();
    }
}