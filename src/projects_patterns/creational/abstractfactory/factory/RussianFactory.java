package projects_patterns.creational.abstractfactory.factory;

import projects_patterns.creational.abstractfactory.AirCraft;
import projects_patterns.creational.abstractfactory.Car;
import projects_patterns.creational.abstractfactory.TransportFactory;
import projects_patterns.creational.abstractfactory.dto.Niva;
import projects_patterns.creational.abstractfactory.dto.Tu132;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public AirCraft createAirCraft() {
        return new Tu132();
    }
}
