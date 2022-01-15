package practice.task9.car;

import java.util.Objects;

public class Bus extends Car{

    private int passengerAmount;

    public Bus(Model model, Color color, Brand brand, int year, int passengerAmount) {
        super(model, color, brand, year);
        this.passengerAmount = passengerAmount;
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }

    public void setPassengerAmount(int passengerAmount) {
        this.passengerAmount = passengerAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengerAmount == bus.passengerAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerAmount);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerAmount=" + passengerAmount +
                '}' + super.toString();
    }
}
