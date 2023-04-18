package poo.challenge;

import java.util.ArrayList;
import java.util.List;

public class Client {

    final private String name;
    final private List<Purchase> purchases = new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }

    public void addPurchase(Purchase purchase) {
        this.purchases.add(purchase);
        purchase.setClient(this);
    }

    public double getTotalBought() {
       double totalBought = 0.0;

       for (Purchase purchase : this.purchases) {
           totalBought += purchase.getTotalValue();
       }

        return totalBought;
    }

    public String getName() {
        return name;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", purchases=" + purchases +
                '}';
    }
}
