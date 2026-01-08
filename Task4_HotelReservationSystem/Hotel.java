import java.util.ArrayList;

public class Hotel {

    ArrayList<Room> rooms = new ArrayList<>();

    Hotel() {
        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Deluxe"));
        rooms.add(new Room(103, "Suite"));
    }

    void showRooms() {
        for (Room r : rooms) {
            System.out.println(
                r.roomNumber + " - " + r.category +
                (r.isBooked ? " (Booked)" : " (Available)")
            );
        }
    }

    void bookRoom(int roomNo) {
        for (Room r : rooms) {
            if (r.roomNumber == roomNo && !r.isBooked) {
                r.isBooked = true;
                System.out.println("Room booked successfully");
                return;
            }
        }
        System.out.println("Room not available");
    }
}
