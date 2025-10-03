public class Main {

    public static void main(String[] args) {
        System.out.println("Finance Tracker — hello Frase 👋");

        // Example: create an account
        Account myAccount = new Account("Frase", 500.0);
        System.out.println("Account created for: " + myAccount.getName() + 
                           " with balance: $" + myAccount.getBalance());

        // Example transaction
        myAccount.deposit(100.0);
        myAccount.withdraw(50.0);

        // Optional: create a transaction object
        Transaction t = new Transaction(75.0, "Deposit");
        t.printTransaction();
    }
}

