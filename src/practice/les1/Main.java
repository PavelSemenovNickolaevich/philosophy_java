package practice.les1;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(true);
        Room room2 = new Room(false);
        
        Flat flat = new Flat(33,new Room[]{room1, room2} );
        Flat flat1 = new Flat(34,new Room[]{room1, room2});
        
        Floor floor = new Floor(5, new Flat[]{flat, flat1});
        
        House house = new House(5, new Floor[]{floor});

        printAllInformation(flat, floor, house, room1);


    }

    private static void printAllInformation(Flat flat, Floor floor, House house, Room room) {
        room.print();
        flat.print();
        floor.print();
        house.print();
    }
}
