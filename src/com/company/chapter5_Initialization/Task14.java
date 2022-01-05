package com.company.chapter5_Initialization;

public class Task14 {

    static String s1 = "run";
    static String s2;
    static  {
        s2 = " drive car";
    }
    static void show() {
        System.out.println(s1 +", " + s2);

    }

    Task14() {
        System.out.println("go");
    }



}

class  Test {
    public static void main(String[] args) {
        Task14.show();
        System.out.println(Task14.s1 + Task14.s2);
    }
    static Task14 test1 = new Task14();
    static Task14 test2 = new Task14();


}
