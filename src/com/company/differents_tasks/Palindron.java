package com.company.differents_tasks;

import java.util.Scanner;

import static com.company.differents_tasks.Palindron.checkWord;

public class Palindron {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        checkWord(word, 0);
    }

    static boolean checkWord(String word, int i) {
        if( i == Math.floor(word.length()/2)) return true;
        if (word.charAt(i) != word.charAt(word.length() -1 - i)) return false;
        return checkWord(word, ++i);


    }


}
