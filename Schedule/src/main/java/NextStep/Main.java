package NextStep;

public class Main {
    public static void main(String[] args) {


        Car car = new Car(12);
        car.move();
        Vehicle vehicle = car;
        vehicle.move();
        Vehicle v2 = new Car(13);
        v2.move();
        System.out.println(v2.toString());

    }
}