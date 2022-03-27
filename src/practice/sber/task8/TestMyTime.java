package practice.sber.task8;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        System.out.println(time1.getHour() + ":" +
                time1.getMinute() + ":" + time1.getSecond());

        MyTime time2 = new MyTime(555550000);
        System.out.println(time2.getHour() + ":" +
                time2.getMinute() + ":" + time2.getSecond());

        MyTime time3 = new MyTime(5, 23, 55);
        System.out.println(time3.getHour() + ":" +
                time3.getMinute() + ":" + time3.getSecond());
    }
}
