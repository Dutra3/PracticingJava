package poo.inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Civic civic = new Civic(220);
        Corolla corolla = new Corolla(300);

        System.out.println(civic);
        civic.speedUp();
        System.out.println(civic);
        civic.brake();
        System.out.println(civic);

        System.out.println(corolla);
        corolla.speedUp();
        corolla.speedUp();
        corolla.speedUp();
        System.out.println(corolla);
        corolla.brake();
        System.out.println(corolla);
        corolla.brake();
        System.out.println(corolla);
        corolla.brake();
        System.out.println(corolla);
        corolla.brake();
        System.out.println(corolla);

    }

}
