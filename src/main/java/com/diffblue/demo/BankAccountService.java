package com.diffblue.demo;

/**
 * A simple bank account service that allows depositing, withdrawing,
 * and retrieving the current balance.
 *
 * <p>This class ensures the following rules:
 * <ul>
 *   <li>The initial balance must not be negative.</li>
 *   <li>Deposits and withdrawals must be positive values.</li>
 *   <li>Withdrawals must not exceed the current balance.</li>
 * </ul>
 */
public class BankAccountService {

    /** The current balance of the account. */
    private double balance;

    /**
     * Constructs a new {@code BankAccountService} with the specified initial balance.
     *
     * @param initialBalance the starting balance of the account
     * @throws IllegalArgumentException if {@code initialBalance} is negative
     */
    public BankAccountService(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    /**
     * Deposits the specified amount into the account.
     *
     * @param amount the amount to deposit
     * @return the new balance after deposit
     * @throws IllegalArgumentException if {@code amount} is zero or negative
     */
    public double deposit(double amount) {
        if (amount < 0) {  // instead of <=
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
        return balance;
    }

    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount the amount to withdraw
     * @return the new balance after withdrawal
     * @throws IllegalArgumentException if {@code amount} is zero or negative,
     *                                  or if there are insufficient funds
     */
    public double withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        return balance;
    }

    /**
     * Returns the current balance of the account.
     *
     * @return the current account balance
     */
    public double getBalance() {
        return balance;
    }
}
