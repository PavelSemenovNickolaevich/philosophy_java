package com.company.chapter5_Initialization;

/* Attach objects to the references in array in exercise 17: Create a class with
 * a constructor that takes a String argument. During constriction, print the
 * argument. Create and array of object references to this class, but don't
 * actually create objects to assign into the array. When you run the program,
 * notice whether the initialization messages from the constructor are printed.
 */

public class Task18 {
    public static void main(String[] args) {
        Constructor1[] it = new Constructor1[4];
        for (int i = 0; i < it.length; i++) {
            it[i] = new Constructor1("teas" + i);
        }
    }

}

class Constructor1 {

    Constructor1(String name) {
        System.out.println(name);
    }
}
