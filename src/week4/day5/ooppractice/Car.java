package week4.day5.ooppractice;

public class Car {

    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public void startCar() {
        System.out.println(brand + " " + model + " is starting...");
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 2025);

        car.displayDetails();
        car.startCar();
    }
}