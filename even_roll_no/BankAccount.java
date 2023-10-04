package even_roll_no;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private static int accountCounter = 1000;
    private int accountNumber;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount() {
        this.accountNumber = accountCounter++;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        recordTransaction("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        recordTransaction("Withdrew: " + amount);
    }

    private void recordTransaction(String transaction) {
        transactionHistory.add(transaction);
    }
}