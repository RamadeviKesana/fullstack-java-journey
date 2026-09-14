package week2.day2.whileloop;

public class WhileLoopPractice {

    public static void main(String[] args) {

        int number = 1;

        System.out.println("Ascending:");

        while (number <= 10) {
            System.out.println(number);
            number++;
        }

        int countdown = 10;

        System.out.println("Countdown:");

        while (countdown >= 1) {
            System.out.println(countdown);
            countdown--;
        }
    }
}