package NextStep;

public class Car extends Vehicle{


    public Car(double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
