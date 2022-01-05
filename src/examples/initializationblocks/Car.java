package examples.initializationblocks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Car {

    static Map<String , Set<Car>> catalog;
    static {
        catalog = new HashMap<>();
        catalog.put("model1", new HashSet<Car>());
//        catalog.put("model2", new HashSet<Car>());
//        catalog.put("model3", new HashSet<Car>());
//        catalog.put("model4", new HashSet<Car>());
    }

    public Car(String model) {
        catalog.get(model).add(this);
    }


}
