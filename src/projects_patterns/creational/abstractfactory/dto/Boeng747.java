package projects_patterns.creational.abstractfactory.dto;

import projects_patterns.creational.abstractfactory.AirCraft;

public class Boeng747 implements AirCraft {
    @Override
    public void flight() {
        System.out.println("Boeng747 fly");
    }
}
