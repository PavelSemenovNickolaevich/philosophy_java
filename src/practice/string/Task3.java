package practice.string;


/**
 * Написать функцию, принимающую в качетстве параметров имя, фамилию и отчетство и возвращающую инициалы в формате ФИО
 * честь , что входные парамтеры могут быть в любом регистре , а результирующая тсрока должна быть в верпхнем
 *
 */
public class Task3 {
    public static void main(String[] args) {
        String name = "ivan";
        String surname = "ivanov";
        String fatherName = "Ivanovich";
        System.out.println(fio(name, surname, fatherName));

    }

    static String fio(String name, String surname, String fatherName) {
        String one = name.substring(0,1).toUpperCase();
        String two = surname.toUpperCase().substring(0,1);
        String three = fatherName.toUpperCase().substring(0,1);
        return String.format("%s.%s.%s", one, two, three);
     //   return one.concat("." + two).concat("." + three);
    }
}
