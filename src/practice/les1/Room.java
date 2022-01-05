package practice.les1;

public class Room {

    private boolean isWalking;

    public Room(boolean isWalking) {
        this.isWalking = isWalking;
    }

    void print() {
        System.out.println("Комната проходящая " + isWalking);
    }

}
