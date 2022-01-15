package practice.task9.car;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    Map<Car, Integer> cars = new HashMap<>();

    public void park(Car car){
        int newCount = cars.getOrDefault(car, 0);
        cars.put(car, newCount + 1);
    }

    public void departure(Car car) {
        int oldCount = cars.getOrDefault(car, 0);
        Integer newCount = oldCount == 0 ? 0 : oldCount - 1;
        cars.put(car, newCount);
    }

    public int getCarByModel(Model model) {
        int result = 0;
        for (Map.Entry<Car, Integer> entry : cars.entrySet()) {
            if (entry.getKey().getModel() == model) {
                result += entry.getValue();
            }
        }
        return result;
    }

    public int getCarCountByBrand(Brand brand) {
        int result = 0;
        for (Map.Entry<Car, Integer> entry : cars.entrySet()) {
            if (entry.getKey().getBrand() == brand) {
                result += entry.getValue();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }
}
