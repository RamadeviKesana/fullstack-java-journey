package week3.day4.methodpractice;

public class EvenOddMethod {

    public static void main(String[] args) {

        checkEvenOdd(15);
    }

    public static void checkEvenOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}