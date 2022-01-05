package com.company.chapter5_Initialization;

public class Task15 {
    String s;

    {
        s = "initialization";
        System.out.println(s);
    }
    Task15() {
        System.out.println("Task15()");
    }
}

class Test1 {
    public static void main(String[] args) {
        new Task15();
    }

}