package even_roll_no;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private static int customerCounter = 100;
    private int customerId;
    private String name;
    private Map<Integer, BankAccount> accounts;

    public Customer(String name) {
        this.customerId = customerCounter++;
        this.name = name;
        this.accounts = new HashMap<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public BankAccount createNewAccount() {
        BankAccount newAccount = new BankAccount();
        accounts.put(newAccount.getAccountNumber(), newAccount);
        return newAccount;
    }

    public BankAccount getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public Map<Integer, BankAccount> getAllAccounts() {
        return accounts;
    }
}
