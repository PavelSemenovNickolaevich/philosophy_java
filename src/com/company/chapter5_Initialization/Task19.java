package com.company.chapter5_Initialization;


/* Write a method that takes a vararg String array.  Verify that you can pass
 * either a comma-separated list of Strings or a String[] into this method.
 */
public class Task19 {

    public static void main(String[] args) {
        testMethod("1", "2");
        testMethod(new String[] {"1", "2" });
    }
     static void testMethod(String ... args) {
        for (String s: args) {
            System.out.println(s);
        }
    }
}
