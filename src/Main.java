import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Finance Tracker ===");

        // Ask user for account details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your starting balance: ");
        double balance = scanner.nextDouble();

        // Create the account
        Account myAccount = new Account(name, balance);
        System.out.println("Account created for: " + myAccount.getOwner() +
                " with balance: $" + myAccount.getBalance());

        // Loop for income/outgoings
        boolean running = true;
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Income");
            System.out.println("2. Add Outgoing");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter income amount: ");
                double amount = scanner.nextDouble();
                myAccount.deposit(amount);
                new Transaction("Income", amount).printTransaction();

            } else if (choice == 2) {
                System.out.print("Enter outgoing amount: ");
                double amount = scanner.nextDouble();
                myAccount.withdraw(amount);
                new Transaction("Outgoing", amount).printTransaction();

            } else if (choice == 3) {
                System.out.println("Current balance: $" + myAccount.getBalance());

            } else if (choice == 4) {
                System.out.println("Goodbye, " + myAccount.getOwner() + "!");
                running = false;

            } else {
                System.out.println("Invalid option, please try again.");
            }
        }

        scanner.close();
    }
}


