package RefactoredFiles.ReplaceDataObjectWithMoney;

public class BankAccount {
    private String accountNumber;
    private Money balance;

    public BankAccount(String accountNumber, Money balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Money getBalance() {
        return balance;
    }

    public void deposit(Money amount) {
        if (amount.getAmount() > 0) {
            balance = balance.add(amount);
        }
    }

    public void withdraw(Money amount) {
        if (amount.getAmount() > 0 && amount.getAmount() <= balance.getAmount()) {
            balance = balance.subtract(amount);
        }
    }
}
