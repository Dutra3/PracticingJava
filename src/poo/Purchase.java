package poo;

import java.util.ArrayList;

public class Purchase {

    String client;
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(String name, int quantity, double price) {
        this.addProduct(new Product(name, quantity, price));
    }

    void addProduct(Product product) {
        this.products.add(product);
        product.purchase = this;
    }

    public double getTotalValue() {
        double total = 0;

        for (Product product: products) {
            total += product.quantity * product.price;
        }

        return total;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "client='" + client + '\'' +
                ", products=" + products +
                '}';
    }
}
