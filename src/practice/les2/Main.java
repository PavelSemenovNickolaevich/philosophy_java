package practice.les2;

public class Main {

    public static void main(String[] args) {

        Time time = new Time(45, 4, 65);
        System.out.println(time.getAllSec());

        Time time1 = new Time(time.getAllSec());
        System.out.println(time1.getAllSec());

        time1.print();

        Time timeSum = time.sum(time1);
        timeSum.print();

        Class<? extends Time> clazz = time1.getClass();
        System.out.println(clazz);


    }
}
