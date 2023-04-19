package poo.inheritance;

public class Civic extends Car{

    public Civic(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void speedUp() {
        speed += 15;
    }

    @Override
    public String toString() {
        return "Civic{" +
                "speed=" + speed +
                '}';
    }
}
