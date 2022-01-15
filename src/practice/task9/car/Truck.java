package practice.task9.car;

import java.util.Objects;

public class Truck extends Car{

    private double liftingCapacity;

    public Truck(Model model, Color color, Brand brand, int year,double liftingCapacity) {
        super(model, color, brand, year);
        this.liftingCapacity = liftingCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.liftingCapacity, liftingCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liftingCapacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "liftingCapacity=" + liftingCapacity +
                '}' + super.toString();
    }
}
