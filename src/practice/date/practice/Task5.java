package practice.date.practice;

//5. Создать объект LocalDate, представляющий собой сегодняшнюю
//        дату. Создать объект LocalDate, представляющий собой дату
//        07.07.2018. Используя созданные объекты, найти количество дней между
//        этими двумя датами.

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task5 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

        Period period = Period.between(prevDate, localDate);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        long days = ChronoUnit.DAYS.between(prevDate, localDate);
        System.out.println(days);
    }
}
