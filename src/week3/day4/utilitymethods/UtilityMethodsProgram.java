package week3.day4.utilitymethods;

public class UtilityMethodsProgram {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Addition: " + add(10, 20));
        System.out.println("Subtraction: " + subtract(30, 10));
        System.out.println("Maximum: " + findMax(numbers));
        System.out.println("Minimum: " + findMin(numbers));
        System.out.println("Sum of Array: " + findSum(numbers));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int findMax(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static int findMin(int[] numbers) {

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static int findSum(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum;
    }
}