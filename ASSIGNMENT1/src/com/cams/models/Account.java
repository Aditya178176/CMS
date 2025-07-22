package com.cams.models;

public class Account {
    private int accountId;
    private String accountHolderName;
    private double balance;

    public Account(int accountId, String accountHolderName, double balance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) return false;
        this.balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "Account ID: " + accountId + ", Name: " + accountHolderName + ", Balance: ₹" + balance;
    }
}
