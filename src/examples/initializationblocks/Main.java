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

        Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("hello this is thread one");
                }
            }
        };

        Thread threadTwo = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("hello this is thread two");
                }
            }
        };

        thread.start();

        threadTwo.start();

        for ( int i = 0; i < 100; i++) {
            String s = "3333" + i;
            System.out.println(s);
        }
    }


}
