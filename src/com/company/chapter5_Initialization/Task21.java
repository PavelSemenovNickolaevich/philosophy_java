package com.company.chapter5_Initialization;

public class Task21 {

    Task21Part2 valute;

    public static void main(String[] args) {
        for (Task21Part2 s : Task21Part2.values()) {
            System.out.println(s + " " + s.ordinal());

            switch (s) {
                case RUBLE:
                    System.out.println("Это рубль");
                    continue;
                case FUNT:
                    System.out.println("Это фунт");
                    continue;
                case DOLLAR:
                    System.out.println("Это доллар");
            }
        }

    }



}



