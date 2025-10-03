public class Transaction {
    private double amount;
    private String type; // e.g., "Deposit" or "Withdrawal"

    // Constructor
    public Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    // Print transaction info
    public void printTransaction() {
        System.out.println(type + ": $" + amount);
    }
}
