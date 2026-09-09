package week1.day2.typecasting;

public class TypeCasting {

    public static void main(String[] args) {

        // Implicit casting
        int number = 25;
        double convertedNumber = number;

        System.out.println("Integer value: " + number);
        System.out.println("Converted to double: " + convertedNumber);

        // Explicit casting
        double price = 99.75;
        int convertedPrice = (int) price;

        System.out.println("Double value: " + price);
        System.out.println("Converted to int: " + convertedPrice);
    }
}