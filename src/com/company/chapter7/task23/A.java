package com.company.chapter7.task23;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

class A {
    static int j = printInit("A.j initialized");
    static int printInit(String s) {
        println(s);
        return 1;
    }
    A() { println("A() constructor"); }
}
