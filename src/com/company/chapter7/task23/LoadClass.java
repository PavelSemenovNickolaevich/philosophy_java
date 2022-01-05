package com.company.chapter7.task23;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

/* Prove that class loading takes place only once. Prove that loading may be caused
 * by either the creation of the first instance of the that class of by access of a
 * static member.
 */

public class LoadClass extends B {
    static int i = printInit("LoadClass.i initialized");
    LoadClass() { println("LoadClass() constructor"); }
    public static void main(String[] args) {
        // accessing static main causes loading (and initialization)
        // of A, B, & LoadClass
        println("hi");
        // call constructors from loaded classes:
        LoadClass lc = new LoadClass();
        // call to static field loads & initializes C:
        println(String.valueOf(C.a));
        // call to constructor loads D:
        D d = new D();
    }
}
