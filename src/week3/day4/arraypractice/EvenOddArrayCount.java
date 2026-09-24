package week3.day4.arraypractice;

public class EvenOddArrayCount {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30, 35};

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}