package practice.les1;

public class Flat {

    private int numOfFlat;
    private Room[] rooms;

    public Flat(int numOfFlat, Room[] rooms) {
        this.numOfFlat = numOfFlat;
        this.rooms = rooms;
    }

    public void print() {
        System.out.printf( "Квартира № %s , количество комнат : %s \n", numOfFlat, rooms.length);
    }
}
