package com.diffblue.demo;

import com.diffblue.demo.BankAccountService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountServiceTest {

    @Test
    public void testDepositPositiveAmount() {
        BankAccountService account = new BankAccountService(100);
        double newBalance = account.deposit(50);
        assertEquals(150, newBalance, "Balance should increase by deposit amount");
    }

    @Test
    public void testDepositZeroAmount() {
        BankAccountService account = new BankAccountService(100);
        double newBalance = account.deposit(0);
        assertEquals(100, newBalance, "Balance should remain same if deposit is zero");
    }

    @Test
    public void testDepositNegativeAmount() {
        BankAccountService account = new BankAccountService(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10);
        }, "Deposit of negative amount should throw IllegalArgumentException");
    }

    @Test
    public void testWithdrawWithinBalance() {
        BankAccountService account = new BankAccountService(100);
        double newBalance = account.withdraw(30);
        assertEquals(70, newBalance, "Balance should decrease by withdrawal amount");
    }

    @Test
    public void testWithdrawExactBalance() {
        BankAccountService account = new BankAccountService(100);
        double newBalance = account.withdraw(100);
        assertEquals(0, newBalance, "Balance should be zero after withdrawing entire amount");
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        BankAccountService account = new BankAccountService(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(150);
        }, "Withdrawal more than balance should throw IllegalArgumentException");
    }

    @Test
    public void testWithdrawNegativeAmount() {
        BankAccountService account = new BankAccountService(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-20);
        }, "Withdrawal of negative amount should throw IllegalArgumentException");
    }
}
