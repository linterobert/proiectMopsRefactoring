package RefactoredFiles.MoveMethod;

public class BankAccount {
    private String accountNumber;
    public double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Reference to the transfer method in Customer
    public void transfer(BankAccount recipient, double amount) {
        Customer.transfer(this, recipient, amount);
    }
}
