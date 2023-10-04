package even_roll_no;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Access Customer");
            System.out.println("3. Bank Employee Access");
            System.out.println("4. Exit");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter customer name: ");
                        scanner.nextLine();  // Consume newline
                        String name = scanner.nextLine();
                        bank.addCustomer(name);
                        System.out.println("Customer added successfully!");
                        break;
                    case 2:
                        System.out.print("Enter customer ID: ");
                        int customerId = scanner.nextInt();
                        accessCustomer(customerId);
                        break;
                    case 3:
                        bankEmployeeAccess();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Clear the invalid input
            }
        }
    }

    private static void accessCustomer(int customerId) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = bank.getCustomer(customerId);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Access Account");
            System.out.println("3. Back to Main Menu");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        customer.createNewAccount();
                        System.out.println("Account created successfully!");
                        break;
                    case 2:
                        System.out.print("Enter account number: ");
                        int accountNumber = scanner.nextInt();
                        accessAccount(customer, accountNumber);
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Clear the invalid input
            }
        }
    }

    private static void accessAccount(Customer customer, int accountNumber) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = customer.getAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }
        while (true) {
            System.out.println("\nAccount Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Back to Customer Menu");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Amount deposited successfully!");
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                        System.out.println("Amount withdrawn successfully!");
                        break;
                    case 3:
                        System.out.println("Balance: " + account.getBalance());
                        break;
                    case 4:
                        System.out.println("Transaction History:");
                        for (String transaction : account.getTransactionHistory()) {
                            System.out.println(transaction);
                        }
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Clear the invalid input
            }
        }
    }

    private static void bankEmployeeAccess() {
        System.out.println("\nBank Employee Access:");
        for (Customer customer : bank.getAllCustomers().values()) {
            System.out.println("Customer ID: " + customer.getCustomerId() + ", Name: " + customer.getName());
            for (BankAccount account : customer.getAllAccounts().values()) {
                System.out.println("  Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
            }
        }
    }
}
