public class User {
    double balance = 10000;

    void buyStock(Stock stock, int quantity) {
        double cost = stock.price * quantity;

        if (balance >= cost) {
            balance -= cost;
            System.out.println("Bought " + quantity + " shares of " + stock.name);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
