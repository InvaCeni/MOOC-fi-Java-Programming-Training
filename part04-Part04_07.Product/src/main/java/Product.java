public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    // Method to print product information
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
}