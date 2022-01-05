package examples.initializationblocks;

import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
     //   Car car = new Car("Test", Set.of(new Car()));
       // Car.catalog.put("Test", car);
        for (Map.Entry entry: Car.catalog.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

       // System.out.println(StaticTest.StatClass.i);
        System.out.println(Class.forName(StaticTest.StaticBlockClass.class.getName()));
    }
}
