package com.company.chapter7.task8;

/* Create a base class with only a non-default constructor, and a derived class
 * with both a default (no-arg) and non-default constructor. In the derived-class
 * constructors, call the base-class constructor.
 */

public class B extends A{
    private char c;
    private int i;
    B() {
        super('z', 8);
        System.out.println("B()");
    }

    B(char a, int j) {
        super(a, j);
        c = a;
        i = j;
        System.out.println("B()");
    }

    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B('b', 2);
    }
}
