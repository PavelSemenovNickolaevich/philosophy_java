package practice.date.practice;

//1. Создать объект LocalDateTime, представляющий собой
//        дату 25.06.2020 19:47. Используя этот объект, создать другой объект LocalDateTime,
//        представляющий собой дату через 3 месяца после сегодняшней.
//        Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.

import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 6,25,19,47 );
        LocalDateTime newLocalDateTime = localDateTime.plusMonths(3L);

        System.out.println(newLocalDateTime.toLocalDate());
        System.out.println(newLocalDateTime.toLocalTime());
    }
}
