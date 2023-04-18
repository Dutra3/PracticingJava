package poo;

public class Product {

    String name;
    int quantity;
    double price;
    Purchase purchase;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", purchase=" + purchase +
                '}';
    }
}
