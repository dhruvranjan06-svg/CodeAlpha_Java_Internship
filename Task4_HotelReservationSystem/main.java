import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        while (true) {
            System.out.println("\n1. Show Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                hotel.showRooms();
            } else if (choice == 2) {
                System.out.print("Enter room number: ");
                int roomNo = sc.nextInt();
                hotel.bookRoom(roomNo);
            } else {
                break;
            }
        }
    }
}
