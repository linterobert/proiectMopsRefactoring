package OldFiles.MoveMethod;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Existing method in BankAccount to transfer money to another account
    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed. Insufficient funds or invalid amount.");
        }
    }
}
