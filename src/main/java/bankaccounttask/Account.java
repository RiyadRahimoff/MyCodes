package bankaccounttask;

import bankaccounttask.exceptionforbanksys.InsufficientAmount;
import bankaccounttask.exceptionforbanksys.InvalidAmount;

public class Account {
    private long accountNumber;
    private double balance;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account details---->" +
                "Account Number:" + accountNumber +
                ",Balance: " + balance;
    }

    public void deposit(double money) {
        if (money <= 0) {
            throw new InvalidAmount("Entered ammount not enough for deposit!");
        } else {
            balance = balance + money;
            System.out.println("Deposit is successful." + "Your current balance: " + balance);
        }
    }

    public void withdraw(double money) {
        if (money <= 0) {
            throw new InvalidAmount("Withdraw amount must be 1$+");
        } else if (money > balance) {
            throw new InsufficientAmount("Withdraw money is many from your balance");
        } else {
            balance = balance - money;
            System.out.println("Withdraw is successful." + "Your current balance: " + balance);
        }

    }
}
