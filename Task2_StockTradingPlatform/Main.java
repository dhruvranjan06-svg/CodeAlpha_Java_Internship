import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock apple = new Stock("APPLE", 150);
        User user = new User();

        System.out.println("=== Stock Trading Platform ===");
        System.out.println("1. Buy Stock");
        System.out.println("2. Exit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            user.buyStock(apple, qty);
        }

        System.out.println("Remaining Balance: " + user.balance);
    }
}
