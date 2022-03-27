package practice.sber.task9;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 четное? " + n1.isEven());
        System.out.println("n1 простое? " + n1.isPrime());
        System.out.println("15 простое? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(5);
        System.out.println("n2 нечетное? " + n2.isOdd());
        System.out.println("45 нечетное? " + MyInteger.isOdd(45));
        System.out.println("n1 равно n2? " + n1.equals(n2));
        System.out.println("n1 равно 5? " + n1.equals(24));
    }
}