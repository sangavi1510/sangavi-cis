package customException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    public BankAccount ba;

    @BeforeEach
    void setUp() {
        ba = new BankAccount(123);
    }

    @Test
    void getBalance() {
        assertEquals(ba.getBalance(), 123);
    }

    @Test
    void amountWithdraw() throws InsufficientFundsException, InvalidWithdrawalException {
        assertThrows(InsufficientFundsException.class, () ->ba.amountWithdraw(1234));
    }

    @Test
    void amountWithdraw2() throws InsufficientFundsException, InvalidWithdrawalException {
        assertThrows(InvalidWithdrawalException.class, () ->ba.amountWithdraw(-1));
    }
}