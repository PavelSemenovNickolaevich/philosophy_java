package practice.date.practice;

//3. Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime, представляющий
//        собой дату, полученную из этой строки.

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public static void main(String[] args) {
        String formDate = "26-03-1968T09:24";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(formDate, dateTimeFormatter);
        System.out.println(localDateTime);

    }
}
