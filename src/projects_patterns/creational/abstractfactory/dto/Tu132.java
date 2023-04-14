package projects_patterns.creational.abstractfactory.dto;

import projects_patterns.creational.abstractfactory.AirCraft;

public class Tu132 implements AirCraft {
    @Override
    public void flight() {
        System.out.println("Tu132 fly");
    }
}
