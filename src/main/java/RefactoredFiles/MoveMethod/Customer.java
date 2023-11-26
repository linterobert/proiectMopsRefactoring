package RefactoredFiles.MoveMethod;

public class Customer {
    // Moved method to perform transfer between accounts
    public static void transfer(BankAccount sender, BankAccount recipient, double amount) {
        if (amount > 0 && amount <= sender.balance) {
            sender.balance -= amount;
            recipient.balance += amount;
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed. Insufficient funds or invalid amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123", 1000.0);
        BankAccount account2 = new BankAccount("456", 500.0);

        // Perform a transfer using the reference in BankAccount
        account1.transfer(account2, 200.0);
    }
}
