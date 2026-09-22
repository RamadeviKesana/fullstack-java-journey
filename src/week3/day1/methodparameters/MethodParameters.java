package week3.day1.methodparameters;

public class MethodParameters {

    public static void main(String[] args) {

        int additionResult = add(20, 10);
        int subtractionResult = subtract(20, 10);
        int maxResult = findMax(20, 10);
        int minResult = findMin(20, 10);

        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Maximum: " + maxResult);
        System.out.println("Minimum: " + minResult);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int findMax(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int findMin(int a, int b) {

        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}