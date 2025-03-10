package Concept;

class BankAccount {
    protected String accountNumber;
    protected double balance;
    protected String ownerName;

    // Constructor
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate in percentage

    // Constructor
    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }


    public void applyInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}


class CheckingAccount extends BankAccount {
    private double overdraftLimit; // Overdraft limit

    // Constructor
    public CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftLimit) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }


    public boolean withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Withdrawal failed: Exceeds overdraft limit.");
            return false;
        }
    }
}


public class BankingSystemDemo {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SA12345", "Alice", 5000.0, 3.5);
        System.out.println("\n--- Savings Account Details ---");
        savings.displayAccountInfo();
        savings.deposit(1000);
        savings.applyInterest();
        savings.displayAccountInfo();

        // Creating a Checking Account
        CheckingAccount checking = new CheckingAccount("CA67890", "Bob", 2000.0, 500);
        System.out.println("\n--- Checking Account Details ---");
        checking.displayAccountInfo();
        checking.withdraw(2200); // Within overdraft limit
        checking.displayAccountInfo();
        checking.withdraw(500); // Exceeds overdraft limit
    }
}


