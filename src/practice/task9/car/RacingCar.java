package practice.task9.car;

import java.util.Objects;

public class RacingCar extends Car{

    private int maxSpeed;

    public RacingCar(Model model, Color color, Brand brand, int year, int maxSpeed) {
        super(model, color, brand, year);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RacingCar racingCar = (RacingCar) o;
        return Double.compare(racingCar.maxSpeed, maxSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "liftingCapacity=" + maxSpeed +
                '}' + super.toString();
    }
}
