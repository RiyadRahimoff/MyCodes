package bankaccounttask;

import bankaccounttask.exceptionforbanksys.AccountNotFound;

public class BankApp {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();
        bankSystem.add(new Account(7672640, 500));
        bankSystem.add(new Account(5398934, 620));
        bankSystem.add(new Account(8489282, 918));
        try {
            bankSystem.getAccount(7672640);
            bankSystem.getAccount(4287178);
        } catch (AccountNotFound ex) {
            System.out.println("Account not found!!!");
        }
        bankSystem.deposit(7672640, 200);
        bankSystem.deposit(5398934, 0);
        bankSystem.withdraw(5398934, 0);
        bankSystem.withdraw(5398934, 3);

    }
}
