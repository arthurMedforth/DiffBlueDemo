package com.diffblue.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class BankAccountService {
    public enum TransactionType {
        DEPOSIT, WITHDRAWAL
    }

    public static class Transaction {
        private final TransactionType type;
        private final double amount;
        private final LocalDateTime timestamp;

        public Transaction(TransactionType type, double amount) {
            this.type = type;
            this.amount = amount;
            this.timestamp = LocalDateTime.now();
        }

        public TransactionType getType() {
            return type;
        }

        public double getAmount() {
            return amount;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }
    }

    private final String accountId;
    private double balance;
    private final List<Transaction> transactions;

    public BankAccountService(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.accountId = UUID.randomUUID().toString();
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
        transactions.add(new Transaction(TransactionType.DEPOSIT, amount));
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        transactions.add(new Transaction(TransactionType.WITHDRAWAL, amount));
        return balance;
    }

    public List<Transaction> getRecentTransactions(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number of transactions must be positive");
        }
        int start = Math.max(transactions.size() - n, 0);
        return transactions.subList(start, transactions.size());
    }

    public boolean isOverdrawn() {
        return balance < 0;
    }
}
