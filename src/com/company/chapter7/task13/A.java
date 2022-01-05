package com.company.chapter7.task13;

public class A {

    protected void methodOne(int a) {
        System.out.println("A()First " + a);
    }

    protected  void methodOne(int b, int a) {
        System.out.println("A()Second" + a + b);
    }

    protected  void methodOne(int c, int d, int e) {
        System.out.println("A()Third " + c + d + e );
    }
}
