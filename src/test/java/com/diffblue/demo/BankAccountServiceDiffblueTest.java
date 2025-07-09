package com.diffblue.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.diffblue.demo.BankAccountService.Transaction;
import com.diffblue.demo.BankAccountService.TransactionType;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BankAccountServiceDiffblueTest {
    /**
     * Test {@link BankAccountService#BankAccountService(double)}.
     * <ul>
     *   <li>When {@code -1.0E-10}.</li>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#BankAccountService(double)}
     */
    @Test
    @DisplayName("Test new BankAccountService(double); when '-1.0E-10'; then throw IllegalArgumentException")
    @Tag("MaintainedByDiffblue")
    void testNewBankAccountService_when10e10_thenThrowIllegalArgumentException() {
        // Arrange, Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new BankAccountService(-1.0E-10d));
    }

    /**
     * Test {@link BankAccountService#BankAccountService(double)}.
     * <ul>
     *   <li>When ten.</li>
     *   <li>Then return Balance is ten.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#BankAccountService(double)}
     */
    @Test
    @DisplayName("Test new BankAccountService(double); when ten; then return Balance is ten")
    @Tag("MaintainedByDiffblue")
    void testNewBankAccountService_whenTen_thenReturnBalanceIsTen() {
        // Arrange, Act and Assert
        assertEquals(10.0d, new BankAccountService(10.0d).getBalance());
    }

    /**
     * Test {@link BankAccountService#deposit(double)}.
     * <ul>
     *   <li>Then {@link BankAccountService#BankAccountService(double)} with initialBalance is ten Transactions size is one.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#deposit(double)}
     */
    @Test
    @DisplayName("Test deposit(double); then BankAccountService(double) with initialBalance is ten Transactions size is one")
    @Tag("MaintainedByDiffblue")
    void testDeposit_thenBankAccountServiceWithInitialBalanceIsTenTransactionsSizeIsOne() {
        // Arrange
        BankAccountService bankAccountService = new BankAccountService(10.0d);

        // Act
        double actualDepositResult = bankAccountService.deposit(10.0d);

        // Assert
        List<Transaction> transactions = bankAccountService.getTransactions();
        assertEquals(1, transactions.size());
        Transaction getResult = transactions.get(0);
        assertEquals(10.0d, getResult.getAmount());
        assertEquals(20.0d, actualDepositResult);
        assertEquals(20.0d, bankAccountService.getBalance());
        assertEquals(TransactionType.DEPOSIT, getResult.getType());
    }

    /**
     * Test {@link BankAccountService#deposit(double)}.
     * <ul>
     *   <li>When ten.</li>
     *   <li>Then return twenty.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#deposit(double)}
     */
    @Test
    @DisplayName("Test deposit(double); when ten; then return twenty")
    @Tag("MaintainedByDiffblue")
    void testDeposit_whenTen_thenReturnTwenty() {
        // Arrange
        BankAccountService bankAccountService = new BankAccountService(10.0d);

        // Act and Assert
        assertEquals(20.0d, bankAccountService.deposit(10.0d));
        assertEquals(20.0d, bankAccountService.getBalance());
    }

    /**
     * Test {@link BankAccountService#deposit(double)}.
     * <ul>
     *   <li>When zero.</li>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#deposit(double)}
     */
    @Test
    @DisplayName("Test deposit(double); when zero; then throw IllegalArgumentException")
    @Tag("MaintainedByDiffblue")
    void testDeposit_whenZero_thenThrowIllegalArgumentException() {
        // Arrange, Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new BankAccountService(10.0d).deposit(0.0d));
    }

    /**
     * Test Transaction getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link Transaction#getAmount()}
     *   <li>{@link Transaction#getTimestamp()}
     *   <li>{@link Transaction#getType()}
     * </ul>
     */
    @Test
    @DisplayName("Test Transaction getters and setters")
    @Tag("MaintainedByDiffblue")
    void testTransactionGettersAndSetters() {
        // Arrange
        Transaction transaction = new Transaction(TransactionType.DEPOSIT, 10.0d);

        // Act
        double actualAmount = transaction.getAmount();
        transaction.getTimestamp();

        // Assert
        assertEquals(10.0d, actualAmount);
        assertEquals(TransactionType.DEPOSIT, transaction.getType());
    }

    /**
     * Test Transaction {@link Transaction#Transaction(TransactionType, double)}.
     * <p>
     * Method under test: {@link Transaction#Transaction(TransactionType, double)}
     */
    @Test
    @DisplayName("Test Transaction new Transaction(TransactionType, double)")
    @Tag("MaintainedByDiffblue")
    void testTransactionNewTransaction() {
        // Arrange and Act
        Transaction actualTransaction = new Transaction(TransactionType.DEPOSIT, 10.0d);

        // Assert
        assertEquals(10.0d, actualTransaction.getAmount());
        assertEquals(TransactionType.DEPOSIT, actualTransaction.getType());
    }

    /**
     * Test {@link BankAccountService#BankAccountService(double)}.
     * <ul>
     *   <li>When ten.</li>
     *   <li>Then return Balance is ten.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#BankAccountService(double)}
     */
    @Test
    @DisplayName("Test new BankAccountService(double); when ten; then return Balance is ten")
    @Tag("MaintainedByDiffblue")
    void testNewBankAccountService_whenTen_thenReturnBalanceIsTen2() {
        // Arrange and Act
        BankAccountService actualBankAccountService = new BankAccountService(10.0d);

        // Assert
        assertEquals(10.0d, actualBankAccountService.getBalance());
        assertTrue(actualBankAccountService.getTransactions().isEmpty());
    }

    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link BankAccountService#getAccountId()}
     *   <li>{@link BankAccountService#getBalance()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    void testGettersAndSetters() {
        // Arrange
        BankAccountService bankAccountService = new BankAccountService(10.0d);

        // Act
        bankAccountService.getAccountId();

        // Assert
        assertEquals(10.0d, bankAccountService.getBalance());
    }

    /**
     * Test {@link BankAccountService#withdraw(double)}.
     * <ul>
     *   <li>Given {@link BankAccountService#BankAccountService(double)} with initialBalance is zero.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#withdraw(double)}
     */
    @Test
    @DisplayName("Test withdraw(double); given BankAccountService(double) with initialBalance is zero")
    @Tag("MaintainedByDiffblue")
    void testWithdraw_givenBankAccountServiceWithInitialBalanceIsZero() {
        // Arrange, Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new BankAccountService(0.0d).withdraw(10.0d));
    }

    /**
     * Test {@link BankAccountService#withdraw(double)}.
     * <ul>
     *   <li>Then {@link BankAccountService#BankAccountService(double)} with initialBalance is ten Balance is zero.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#withdraw(double)}
     */
    @Test
    @DisplayName("Test withdraw(double); then BankAccountService(double) with initialBalance is ten Balance is zero")
    @Tag("MaintainedByDiffblue")
    void testWithdraw_thenBankAccountServiceWithInitialBalanceIsTenBalanceIsZero() {
        // Arrange
        BankAccountService bankAccountService = new BankAccountService(10.0d);

        // Act
        double actualWithdrawResult = bankAccountService.withdraw(10.0d);

        // Assert
        assertEquals(0.0d, bankAccountService.getBalance());
        assertEquals(0.0d, actualWithdrawResult);
    }

    /**
     * Test {@link BankAccountService#withdraw(double)}.
     * <ul>
     *   <li>Then {@link BankAccountService#BankAccountService(double)} with initialBalance is ten Balance is zero.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#withdraw(double)}
     */
    @Test
    @DisplayName("Test withdraw(double); then BankAccountService(double) with initialBalance is ten Balance is zero")
    @Tag("MaintainedByDiffblue")
    void testWithdraw_thenBankAccountServiceWithInitialBalanceIsTenBalanceIsZero2() {
        // Arrange
        BankAccountService bankAccountService = new BankAccountService(10.0d);

        // Act
        double actualWithdrawResult = bankAccountService.withdraw(10.0d);

        // Assert
        assertEquals(0.0d, bankAccountService.getBalance());
        assertEquals(0.0d, actualWithdrawResult);
        List<Transaction> transactions = bankAccountService.getTransactions();
        assertEquals(1, transactions.size());
        Transaction getResult = transactions.get(0);
        assertEquals(10.0d, getResult.getAmount());
        assertEquals(TransactionType.WITHDRAWAL, getResult.getType());
    }

    /**
     * Test {@link BankAccountService#withdraw(double)}.
     * <ul>
     *   <li>When zero.</li>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#withdraw(double)}
     */
    @Test
    @DisplayName("Test withdraw(double); when zero; then throw IllegalArgumentException")
    @Tag("MaintainedByDiffblue")
    void testWithdraw_whenZero_thenThrowIllegalArgumentException() {
        // Arrange, Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new BankAccountService(10.0d).withdraw(0.0d));
    }

    /**
     * Test {@link BankAccountService#getRecentTransactions(int)}.
     * <ul>
     *   <li>When one.</li>
     *   <li>Then return Empty.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#getRecentTransactions(int)}
     */
    @Test
    @DisplayName("Test getRecentTransactions(int); when one; then return Empty")
    @Tag("MaintainedByDiffblue")
    void testGetRecentTransactions_whenOne_thenReturnEmpty() {
        // Arrange, Act and Assert
        assertTrue(new BankAccountService(10.0d).getRecentTransactions(1).isEmpty());
    }

    /**
     * Test {@link BankAccountService#getRecentTransactions(int)}.
     * <ul>
     *   <li>When zero.</li>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link BankAccountService#getRecentTransactions(int)}
     */
    @Test
    @DisplayName("Test getRecentTransactions(int); when zero; then throw IllegalArgumentException")
    @Tag("MaintainedByDiffblue")
    void testGetRecentTransactions_whenZero_thenThrowIllegalArgumentException() {
        // Arrange, Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new BankAccountService(10.0d).getRecentTransactions(0));
    }

    /**
     * Test {@link BankAccountService#isOverdrawn()}.
     * <p>
     * Method under test: {@link BankAccountService#isOverdrawn()}
     */
    @Test
    @DisplayName("Test isOverdrawn()")
    @Tag("MaintainedByDiffblue")
    void testIsOverdrawn() {
        // Arrange, Act and Assert
        assertFalse(new BankAccountService(10.0d).isOverdrawn());
    }

    /**
     * Test {@link BankAccountService#getBalance()}.
     * <p>
     * Method under test: {@link BankAccountService#getBalance()}
     */
    @Test
    @DisplayName("Test getBalance()")
    @Tag("MaintainedByDiffblue")
    void testGetBalance() {
        // Arrange, Act and Assert
        assertEquals(10.0d, new BankAccountService(10.0d).getBalance());
    }

    /**
     * Test {@link BankAccountService#getTransactions()}.
     * <p>
     * Method under test: {@link BankAccountService#getTransactions()}
     */
    @Test
    @DisplayName("Test getTransactions()")
    @Tag("MaintainedByDiffblue")
    void testGetTransactions() {
        // Arrange, Act and Assert
        assertTrue(new BankAccountService(10.0d).getTransactions().isEmpty());
    }
}
