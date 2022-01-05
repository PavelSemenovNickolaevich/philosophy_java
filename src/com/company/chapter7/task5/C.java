package com.company.chapter7.task5;

/* Create two classes, A and B, with default constructors (empty argument
 * lists) that announce themselves. Inherit a new class called C from A, and
 * create a member of class B inside C. Do not create a constructor for C. Create
 * an object of class C and observe the resluts.
 */

public class C extends A{

    B b =  new B();

    public static void main(String[] args) {
        C c = new C();
    }
}
