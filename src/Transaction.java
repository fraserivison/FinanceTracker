public class Transaction {
    private double amount;
    private String type; // "Income" or "Outgoing"

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public void printTransaction() {
        System.out.println(type + ": $" + amount);
    }
}
