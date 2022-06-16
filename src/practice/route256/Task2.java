package practice.route256;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Введитен 3-х значное число: ");
        if (number < 123 || number > 987) {
            System.out.println("Ваше число должно быть 123 ≤ n ≤ 987 и != 0");
        }
        String num  =  String.valueOf(number);
        for (int i  = 0 ; i < num.length(); i++) {

        }


    }
}
