package practice.sber.task11;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        System.out.println("год: " + date.getYear());
        System.out.println("месяц: " + date.getMonth());
        System.out.println("день: " + date.getDay());

        date.setDate(561555550000L);
        System.out.println("год: " + date.getYear());
        System.out.println("месяц: " + date.getMonth());
        System.out.println("день: " + date.getDay());

        date = new MyDate(561555550000L);
        System.out.println("год: " + date.getYear());
        System.out.println("месяц: " + date.getMonth());
        System.out.println("день: " + date.getDay());
    }
}

