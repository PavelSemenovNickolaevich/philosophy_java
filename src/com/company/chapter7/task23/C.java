package com.company.chapter7.task23;


import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

class C {
    static int n = printInitC("C.n initialized");
    static A a = new A();
    C() { println("C() constructor"); }
    static int printInitC(String s) {
        println(s);
        return 1;
    }
}
