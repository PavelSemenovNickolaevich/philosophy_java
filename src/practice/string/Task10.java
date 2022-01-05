package practice.string;

//Дана строка с текстом, в котором есть цифры от 0 до 9.
//
//        Написать 2 метода:
//
//        - возвращающий массив цифр из переданной строки
//
//        - возвращающий сумму цифр из переданного целочисленного массива
//
//        Посчитать сумму всех чисел из строки
//
//        Например:
//
//        “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {

        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        System.out.println(Arrays.toString(arrayDigits(value)));
        char[] test =  arrayDigits(value);
        System.out.println(sum(test));

    }

    private static char[] arrayDigits(String value) {

        String digits = "";
        StringBuilder data = new StringBuilder(value);
        for(int i = 0; i < data.length(); i++) {
            char chrs =  data.charAt(i);
            if(Character.isDigit(chrs)) {
                digits = data.charAt(i) + digits;
            }
        }

     //   Integer.parseInt(digits);
        char[] digitss = new char[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            digitss[i] = digits.charAt(i);
        }

        return digitss;

    }

    private static int sum (char[] test) {
        int sum = 0;
        for (int i = 0; i < test.length; i++) {
           sum += Character.getNumericValue(test[i]);
        }
        return sum;
    }

}
