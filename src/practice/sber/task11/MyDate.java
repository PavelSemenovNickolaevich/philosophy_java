package practice.sber.task11;

//Создайте класс с именем MyDate для представления даты. Класс MyDate должен содержать:
//
//        Поля данных year, month и day, которые представляют дату. Поле month должно быть основано на числе,
//        т.е. 0 — для января, 1 — для февраля и т.д.
//        Безаргументный конструктор, который создает объект типа MyDate для текущей даты.
//        Конструктор, который создает объект типа MyDate с указанным временем в миллисекундах, прошедших
//        с 00:00, 1 января 1970 г.
//        Конструктор, который создает объект типа MyDate с указанными годом, месяцем и днем.
//        Три getter-метода для полей данных year, month и day, соответственно.
//        Метод с именем setDate(long elapsedTime), который присваивает новую дату объекту, используя прошедшее время.


import java.util.Calendar;
import java.util.GregorianCalendar;

class MyDate {
    private int year;
    private int month;
    private int day;

    MyDate() {
        setDate(new GregorianCalendar().getTimeInMillis());
    }

    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime){
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        // Найти год, месяц и день из даты. Вы пишете свой код, чтобы заменить устаревшие методы get()
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }
}
