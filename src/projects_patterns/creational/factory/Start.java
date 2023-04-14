package projects_patterns.creational.factory;

public class Start {

    public static void main(String[] args) {

        Car jeep = new Geep();
        jeep.drive();


        CarSelector carSelector = new CarSelector();
        System.out.println(carSelector.getCar(RoadType.GAZON));

        Car car1 = carSelector.getCar(RoadType.GAZON);
        car1.drive();
        car1.stop();

        Car car2 = carSelector.getCar(RoadType.OFF_ROAD);
        car2.drive();
        car2.stop();


    }
}
