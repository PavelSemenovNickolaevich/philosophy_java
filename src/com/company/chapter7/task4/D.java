package com.company.chapter7.task4;

/* Prove that base-class constructors are (a) always called and (b) called before
 * derived-class constructors.
 */

public class D extends C {
    D() {
        System.out.println("D()");
    }

    public static D makeD() {
       return new D();
    }

    public static void main(String[] args) {
        D d = new D();
        D d2 = makeD();

    }
}
