package bankaccounttask;

import bankaccounttask.exceptionforbanksys.AccountNotFound;
import bankaccounttask.exceptionforbanksys.InsufficientAmount;
import bankaccounttask.exceptionforbanksys.InvalidAmount;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BankSystem {
    private Map<Long, Account> user;
    public BankSystem() {
        user = new HashMap<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankSystem that = (BankSystem) o;
        return Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(user);
    }

    public void add(Account account) {
        user.put(account.getAccountNumber(), account);
        System.out.println("Your bank account created!");
    }

    public void getAccount(long accountNumber) {
        Account account1 = user.get(accountNumber);
        if (account1 == null) {
            throw new AccountNotFound("User details not found!");
        } else {
            System.out.println("User details: ");
            System.out.println(account1);
        }
    }

    public void deposit(long accountNumber, double money) {
        Account account1 = user.get(accountNumber);
        try {
            account1.deposit(money);
        } catch (InvalidAmount ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void withdraw(long accountNumber, double money) {
        Account account1 = user.get(accountNumber);
        try {
            account1.withdraw(money);
        } catch (InvalidAmount | InsufficientAmount ex) {
            System.out.println(ex.getMessage());
        }
    }
}
