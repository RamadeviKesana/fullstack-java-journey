package week4.day4.product;

public class Product {

    int id;
    String name;
    double price;
    int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateBillAmount() {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + calculateBillAmount());
    }

    public static void main(String[] args) {

        Product product =
                new Product(101, "Laptop", 750.50, 2);

        product.displayDetails();
    }
}