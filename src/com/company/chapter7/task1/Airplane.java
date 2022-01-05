package com.company.chapter7.task1;

public class Airplane {
    private String fuselage, wings, tail;
    private Engine e;

    public Airplane() {
        System.out.println("Inside Airplane()");
        fuselage = "Body";
        wings = "Airfoils";
        tail = "Empennage";
    }

    public String toString() {
        if (e == null) // lazy (delayed) initialization:
            e = new Engine();
        return "fuselage = " + fuselage + ", " +
                "wings = " + wings + ", " +
                "tail = " + tail + ", " +
                "Engine = " + e;
    }
}
