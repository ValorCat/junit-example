package csci360;

/**
 * This is the class to be tested by Junit.
 * @author Anthony Morrell
 * @since 10/26/2017
 */
public class Account {

    private double balance;

    /*
    This program would work exactly the same if this constructor were omitted,
    but I'm leaving it here to avoid confusion.
     */
    public Account() {
        balance = 0.0;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("deposit amount must be >= 0");
        }
        balance += amount;
    }

    public double withdraw(double amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("withdrawal amount must be >= 0");
        } else if (balance >= amount) {
            balance -= amount;
            return amount;
        } else {
            return 0;
        }
    }

    public double getBalance() {
        return balance;
    }

}
