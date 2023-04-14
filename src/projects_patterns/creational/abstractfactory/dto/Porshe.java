package projects_patterns.creational.abstractfactory.dto;

import projects_patterns.creational.abstractfactory.Car;

public class Porshe implements Car {
    @Override
    public void drive() {
        System.out.println("Porshe drive");
    }

    @Override
    public void stop() {
        System.out.println("Porshe stop");
    }
}
