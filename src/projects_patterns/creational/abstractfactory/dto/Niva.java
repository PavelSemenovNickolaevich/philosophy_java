package projects_patterns.creational.abstractfactory.dto;

import projects_patterns.creational.abstractfactory.Car;

public class Niva implements Car {
    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {
        System.out.println("Niva stop");

    }
}
