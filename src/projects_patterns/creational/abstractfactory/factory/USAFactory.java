package projects_patterns.creational.abstractfactory.factory;

import projects_patterns.creational.abstractfactory.AirCraft;
import projects_patterns.creational.abstractfactory.Car;
import projects_patterns.creational.abstractfactory.TransportFactory;
import projects_patterns.creational.abstractfactory.dto.Boeng747;
import projects_patterns.creational.abstractfactory.dto.Porshe;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porshe();
    }

    @Override
    public AirCraft createAirCraft() {
        return new Boeng747();
    }
}
