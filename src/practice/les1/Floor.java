package practice.les1;

public class Floor {

    private int numOfFloor;
    private Flat[] flats;

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }

    public Floor(int numOfFloor, Flat[] flats) {
        this.numOfFloor = numOfFloor;
        this.flats = flats;
    }

    public void print() {
        System.out.printf( "Этаж %s , количество квартир : %s \n", numOfFloor, flats.length);
    }
}
