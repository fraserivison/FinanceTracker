public class Account {
    private String name;
    private double balance;

    // Constructor
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Methods to update balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
