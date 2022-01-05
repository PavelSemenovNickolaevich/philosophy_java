package com.company.chapter7.task2;

public class Sterilize extends Detergent{

    @Override
    public void scrub() {
        append(" Sterilize.scrub() ");
        super.scrub();
    }

    public void sterilize() {
        append(" Sterilize()");
    }

    public static void main(String[] args) {
        Sterilize x = new Sterilize();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
        System.out.println("Testing base class:");
        Detergent.main(args);
    }

}
