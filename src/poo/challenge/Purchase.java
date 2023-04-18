package poo.challenge;

import java.util.ArrayList;
import java.util.List;

public class Purchase {

    final private String name;
    final private List<Item> items = new ArrayList<>();
    private Client client;

    public Purchase(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        this.items.add(item);
        item.setPurchase(this);
    }

    public double getTotalValue() {
        double totalValue = 0.0;

        for (Item item : this.items) {
            totalValue += item.getProduct().getPrice() * item.getQuantity();
        }

        return totalValue;
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", items=" + items +
                ", client=" + client +
                '}';
    }
}
