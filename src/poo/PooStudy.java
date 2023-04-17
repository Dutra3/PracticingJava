package poo;

public class PooStudy {

    public static void main(String[] args) {
        // One to One
        Car c1 = new Car();
        System.out.println(c1.isOn());

        c1.turnOn();
        System.out.println(c1.isOn());

        c1.speedUp();
        c1.speedUp();
        c1.brake();
        System.out.println(c1.getMotor().spin());

        // One to Many
        Purchase purchase = new Purchase();
        purchase.client = "Gabriel Dutra";
        purchase.addProduct(new Product("Caneta", 20, 7.45));
        purchase.addProduct("Caderno", 12, 12.45);
        purchase.products.add(new Product("Borracha", 5, 1.35));

        System.out.println(purchase.getTotalValue());
    }

}
