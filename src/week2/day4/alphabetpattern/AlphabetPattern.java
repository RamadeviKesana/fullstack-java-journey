package week2.day4.alphabetpattern;

public class AlphabetPattern {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}