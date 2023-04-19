package poo.inheritance;

public class Corolla extends Car{

    public Corolla(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public String toString() {
        return "Corolla{" +
                "speed=" + speed +
                '}';
    }
}
