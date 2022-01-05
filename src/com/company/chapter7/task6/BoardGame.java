package com.company.chapter7.task6;

class BoardGame extends Game {
    BoardGame(int i) {
        // print("BoardGame constructor"); // call to super must be first
        // statement in constructor
       super(i); // else: "cannot find symbol: constructor Game()
        System.out.println("BoardGame constructor");
    }
}
