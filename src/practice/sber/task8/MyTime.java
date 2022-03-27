package practice.sber.task8;

import java.util.Date;

public class MyTime {

    private int hour;
    private int minute;
    private int second;


    public MyTime() {
       this(System.currentTimeMillis());
    }

    public MyTime(long elapsedTime) {
        setTime(elapsedTime);
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        // Вычислить количество секунд, прошедших с 00:00, 1 января 1970 г.
        long totalSeconds = elapsedTime / 1000;

        // Вычислить текущую секунду в минуте и часе
        second = (int)(totalSeconds % 60);

        // Вычислить количество минут
        long totalMinutes = totalSeconds / 60;

        // Вычислить текущую минуту в часе
        minute = (int)(totalMinutes % 60);

        // Вычислить количество часов
        int totalHours = (int)(totalMinutes / 60);

        // Вычислить текущий час
        hour = (int)(totalHours % 24);
    }
}
