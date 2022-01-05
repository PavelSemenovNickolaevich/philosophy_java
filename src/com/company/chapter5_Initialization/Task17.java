package com.company.chapter5_Initialization;

/* Create a class with a constructor that takes a String argument. During
 * constriction, print the argument. Create and array of object references to this
 * class, but don't actually create objects to assign into the array. When you run
 * the program, notice whether the initialization messages from the constructor
 * are printed.
 */

public class Task17 {
    public static void main(String[] args) {
        Constructor[] it = new Constructor[] {new Constructor("test")};
        for (Constructor s : it) {
            System.out.println(s);
        }
    }

}

class Constructor {

    String name;

    Constructor(String name) {
        System.out.println(name);
    }
}
