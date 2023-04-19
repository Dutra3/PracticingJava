package poo.inheritance;

public class Car {

    protected final int MAX_SPEED;
    protected int speed;
    protected int delta = 5;

    protected Car(int maxSpeed) {
        this.MAX_SPEED = maxSpeed;
    }

    public void speedUp() {
        if (speed + delta > MAX_SPEED) {
            speed = MAX_SPEED;
        } else {
            this.speed += delta;
        }
    }

    public void brake() {
        if (this.speed >= 5) {
            this.speed -= delta;
        } else if (this.speed < 5 && this.speed > 0) {
            this.speed = 0;
        } else {
            System.out.println("O carro esta parado, nao tem como freiar!");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }
}
