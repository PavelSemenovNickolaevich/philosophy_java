package practice.sber.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s;
        int low, high;
        boolean isPalindrome;

        Scanner input = new Scanner(System.in);

        // Получить строку
        System.out.print("Введите строку без пробелов: ");
        s = input.nextLine();

        // Инициализировать индекс начала строки
        low = 0;

        // Инициализировать индекс конца строки
        high = s.length() - 1;

        // Проверить строку на палиндром
        isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        // Отобразить, является ли строка палиндромом
        if (isPalindrome)
            System.out.println(s + " является палиндромом");
        else
            System.out.println(s + " не является палиндромом");
    }
}
