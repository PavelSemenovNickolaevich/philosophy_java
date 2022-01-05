package com.company.chapter7.task7.task5;

// reusing/Ex7/C7.java
// TIJ4 Chapter Reusing, Exercise 7, page 246
/* Modify Exercise 5 so that A and B have constructors with arguments instead
 * of default constructors. Write a constructor for C and perform all
 * initialization within C's constructor.
 */

class C7 extends A {
    private char c;
    private int i;
    C7(char a, int j) {
        super(a, j);
        c = a;
        i = j;
    }
    B b = new B("hi", 1f); // will then construct another A and then a B
    public static void main(String[] args) {
        C7 c = new C7('b', 2); // will construct an A first
    }
}
