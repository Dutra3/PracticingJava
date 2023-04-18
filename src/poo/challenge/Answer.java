package poo.challenge;

public class Answer {

    public static void main(String[] args) {

        Client c1 = new Client("Gabriel");

        Purchase p1 = new Purchase("Purchase 1");
        Purchase p2 = new Purchase("Purchase 2");

        Item item1 = new Item(4,new Product("Manga Yu Yu Hakusho", 10.90));
        Item item2 = new Item(4,new Product("HQ The Walking Dead", 36.90));
        Item item3 = new Item(3,new Product("Memoria Ram 16gb", 289.99));
        Item item4 = new Item(12, new Product("Manga Demom Slayer", 19.99));

        p1.addItem(item1);
        p1.addItem(item2);
        p2.addItem(item3);
        p2.addItem(item4);

        c1.addPurchase(p1);
        c1.addPurchase(p2);

        System.out.println(p1.getTotalValue());
        System.out.println(p2.getTotalValue());
        System.out.println(c1.getTotalBought());
    }
}
