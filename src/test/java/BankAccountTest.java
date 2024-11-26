import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("12345", 100.0);
        assertEquals(150.0, account.deposit(50.0), "Deposit should increase balance");
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("12345", 100.0);
        assertEquals(50.0, account.withdraw(50.0), "Withdrawal should decrease balance");
    }

    @Test
    public void testInsufficientFunds() {
        BankAccount account = new BankAccount("12345", 100.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(150.0), "Should throw exception for insufficient funds");
    }
}
