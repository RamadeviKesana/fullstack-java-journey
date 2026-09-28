package week4.day2.wordcount;

import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine().trim();

        if (text.isEmpty()) {
            System.out.println("Word count: 0");
        } else {

            String[] words = text.split("\\s+");

            System.out.println("Word count: " + words.length);
        }

        scanner.close();
    }
}