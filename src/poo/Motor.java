package poo;

public class Motor {
    boolean isMotorOn;
    double injectionFactor;
    Car car;

    public Motor(boolean isMotorOn, double injectionFactor, Car car) {
        this.isMotorOn = isMotorOn;
        this.injectionFactor = injectionFactor;
        this.car = car;
    }

    int spin() {
        return (int) Math.round(injectionFactor * 3000);
    }

    public boolean isMotorOn() {
        return isMotorOn;
    }

    public void setMotorOn(boolean motorOn) {
        isMotorOn = motorOn;
    }

    public double getInjectionFactor() {
        return injectionFactor;
    }

    public void setInjectionFactor(double injectionFactor) {
        this.injectionFactor = injectionFactor;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
