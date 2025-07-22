package com.cams;

import com.cams.models.Account;

public class DerivedClasses extends BaseClasses implements BankOperations {

    @Override
    public void viewAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }
        accounts.values().forEach(System.out::println);
    }

    @Override
    public void addAccount() {
        String name = UserInput.getString("Enter account holder name: ");
        double balance = UserInput.getDouble("Enter initial deposit: ");
        accountCounter++;
        accounts.put(accountCounter, new Account(accountCounter, name, balance));
        System.out.println("Account added with ID: " + accountCounter);
    }

    @Override
    public void editAccount() {
        int id = UserInput.getInt("Enter Account ID to edit: ");
        if (!accounts.containsKey(id)) {
            System.out.println("Account not found.");
            return;
        }
        String name = UserInput.getString("Enter new name: ");
        accounts.get(id).setAccountHolderName(name);
        System.out.println("Account updated successfully.");
    }

    @Override
    public void deposit() {
        int id = UserInput.getInt("Enter Account ID: ");
        if (!accounts.containsKey(id)) {
            System.out.println("Account not found.");
            return;
        }
        double amount = UserInput.getDouble("Enter amount to deposit: ");
        accounts.get(id).deposit(amount);
        System.out.println("Amount deposited successfully.");
    }

    @Override
    public void withdraw() {
        int id = UserInput.getInt("Enter Account ID: ");
        if (!accounts.containsKey(id)) {
            System.out.println("Account not found.");
            return;
        }
        double amount = UserInput.getDouble("Enter amount to withdraw: ");
        boolean success = accounts.get(id).withdraw(amount);
        if (success) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void logout() {
        System.out.println("Logged out successfully.");
    }
}
