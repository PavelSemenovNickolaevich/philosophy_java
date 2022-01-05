package com.company.chapter7.task23;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

class B extends A {
    static int k = printInit("B.k initialized");
    B() { println("B() constructor"); }
}
