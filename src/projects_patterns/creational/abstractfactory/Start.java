package projects_patterns.creational.abstractfactory;

import projects_patterns.creational.abstractfactory.factory.RussianFactory;
import projects_patterns.creational.abstractfactory.factory.USAFactory;

public class Start {

    public static void main(String[] args) {

        TransportFactory russianFactory = new RussianFactory();
        AirCraft airCraft1 = russianFactory.createAirCraft();

        airCraft1.flight();


        TransportFactory usaFactory = new USAFactory();
        Car car = usaFactory.createCar();
        car.drive();


    }
}
