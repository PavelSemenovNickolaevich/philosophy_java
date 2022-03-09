package jdbc.starter;

import java.util.GregorianCalendar;
import java.util.Random;

public class ShowErrors {
    public static void main(String[] args) {
        Random generator1 = new Random(3);
        System.out.print("Из generator1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator1.nextInt(1000) + " ");
        Random generator2 = new Random(3);
        System.out.print("\nИз generator2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator2.nextInt(1000) + " ");
        System.out.println();
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(GregorianCalendar.YEAR));
        Random gen = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(gen.nextInt(100) + " ");
        }
    }
}
