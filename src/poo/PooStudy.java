package poo;

public class PooStudy {

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.isOn());

        c1.turnOn();
        System.out.println(c1.isOn());

        c1.speedUp();
        c1.speedUp();
        c1.brake();
        System.out.println(c1.getMotor().spin());
    }

}
