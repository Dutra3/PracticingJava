package poo;

public class Car {
    private Motor motor;

    public Car() {
        this.motor = new Motor(false, 1, this);
    }

    void speedUp() {
        if (motor.getInjectionFactor() < 2.7) {
            motor.injectionFactor += 0.4;
        }
    }

    void brake() {
        if (motor.getInjectionFactor() >= 0.9) {
            motor.injectionFactor -= 0.4;
        } else {
            motor.injectionFactor = 0.5;
        }
    }

    void turnOn() {
        motor.isMotorOn = true;
    }

    void turnOff() {
        motor.isMotorOn = false;
    }

    boolean isOn() {
        return motor.isMotorOn;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "motor=" + motor +
                '}';
    }
}
