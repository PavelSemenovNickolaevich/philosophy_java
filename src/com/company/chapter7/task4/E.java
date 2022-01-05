package com.company.chapter7.task4;

public class E extends D {
    E() {
        System.out.println("E()");
    }

    public static void main(String[] args) {
        E e = new E();
        D.main(args);
    }

}
