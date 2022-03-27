package practice.sber.task9;

public class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return  isPrime(value);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0 ? true : false;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0 ? true : false;
    }

    public static boolean isPrime(int num) {
        return num > 1 && num % 1 ==0 && num % num == 0 ? true : false;


    }

    public static boolean isPrime(MyInteger o) {
        return isPrime(o.getValue());
    }

    public static boolean isOdd(MyInteger o) {
        return isOdd(o.getValue());
    }

    public static boolean isEven(MyInteger o) {
        return isEven(o.getValue());
    }

    public boolean equals(int num) {
        return value == num;
    }

    public boolean equals(MyInteger o) {
        return value == o.getValue();
    }

    public static int parseInt(char[] numbers) {
        // numbers состоит из символов цифр.
        // Например, если numbers равно {'1', '2', '5'}, то возвращаемое значение
        // должно быть равным 125. Обратите внимание, что
        // numbers[0] равно '1'
        // numbers[1] равно '2'
        // numbers[2] равно '5'

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result * 10 + (numbers[i] - '0');
        }

        return result;
    }

    public static int parseInt(String s) {
        // s состоит из символов цифр.
        // Например, если s равно "125", то возвращаемое значение
        // должно быть равным 125.
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }

        return result;
    }

}
