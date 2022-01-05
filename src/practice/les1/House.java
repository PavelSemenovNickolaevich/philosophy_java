package practice.les1;

public class House {

    private int num;
    private Floor[] floor;

    public House(int num, Floor[] floor) {
        this.num = num;
        this.floor = floor;
    }

    public void print() {
        System.out.printf( "Номер дома %s , количество этажей : %s", num, floor.length);
    }
}

