package practice.route256;

import java.util.Scanner;

//Вводится целое число n. (10^10  ≤ n < 10^11)
//
//        Выведите трехзначное число — код оператора.
//
//        Входные данные:
//        79031112233
//        Выходные данные:
//        903
//        Входные данные:
//        89205555555
//        Выходные данные:
//        920

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        String num = String.valueOf(number);

        System.out.println(num.substring(1, 4));
    }
}
