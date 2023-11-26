package OldFiles.MoveMethod;

public class Customer {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123", 1000.0);
        BankAccount account2 = new BankAccount("456", 500.0);

        // Perform a transfer from account1 to account2
        account1.transfer(account2, 200.0);
    }
}
