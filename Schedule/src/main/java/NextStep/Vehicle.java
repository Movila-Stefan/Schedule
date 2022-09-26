package NextStep;

import java.time.LocalDate;

public abstract class Vehicle {
    double maxSpeed;

    public  Vehicle (double maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public abstract void move();
}
