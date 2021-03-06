package com.company.chapter7.task18;

import java.util.Random;



/* Create a class with a static final field and a final field and demonstrate
 * the difference between the two.
 */

public class Difference {
    private String name;

    public Difference(String s) {
        name = s;
    }

    static final Test sft = new Test(); // constant reference address
    private final Test ft = new Test();
    static final String SFS = "static final"; // class constant
    private final String fs = "final";
    private static Random rand = new Random();
    static final int SFI = rand.nextInt(); // class constant
    private final int fi = rand.nextInt();

    public String toString() {
        return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);
    }

    public static void main(String[] args) {
        Difference d1 = new Difference("d1");
        Difference d2 = new Difference("d2");
        Difference d3 = new Difference("d3");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }
}