package com.company.chapter7.task24;

/* In Beetle.java, inherit a specific type beetle from class Beetle, following
 * the same format as the existing classes. Trace and expain the output.
 */

public class Scarab extends Beetle {
    private int n = printInit("Scarab.n initialized");
    public Scarab() {
        System.out.println("n = " + n);
        System.out.println("j = " + j);
    }
    private static int x3 = printInit("static Scarab.x3 initialized");
    public static void main(String[] args) {
        System.out.println("Scarab constructor");
        Scarab sc = new Scarab();
    }
}
