package week3.day4.arraypractice;

public class ElementFrequency {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 10, 40, 20};

        int searchNumber = 10;

        int count = 0;

        for (int number : numbers) {

            if (number == searchNumber) {
                count++;
            }
        }

        System.out.println(
                searchNumber + " appears " + count + " times."
        );
    }
}