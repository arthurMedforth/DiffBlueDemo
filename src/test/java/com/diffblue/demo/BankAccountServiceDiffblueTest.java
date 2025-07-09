package com.diffblue.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
}
