package practice.les2;

public class Time {

    private int sec;
    private int min;
    private int hour;

    public Time(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public Time(int allSec) {
        this.hour = allSec / 3600;
        this.min = allSec % 3600 / 60;
        this.sec = allSec % 3600 % 60;
    }

    public int getAllSec() {
        return hour * 3600 + min * 60 + sec;
    }

    public Time sum(Time second) {
        return new Time(this.getAllSec() + second.getAllSec());
    }

    public void print() {
        System.out.println(hour + " " + min + " " + sec);
    }
 }
