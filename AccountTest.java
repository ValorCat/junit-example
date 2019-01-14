package csci360;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Anthony Morrell
 * @since 10/26/2017
 */
public class AccountTest {

    private Account a;
    private static final double DELTA = 0;

    @Before
    public void setUp() {
        a = new Account();
    }

    @Test
    public void testDeposit() {
        a.deposit(20);
        assertEquals(20d, a.getBalance(), DELTA);

        a.deposit(0);
        assertEquals(20d, a.getBalance(), DELTA);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testDepositNegative() {
        a.deposit(-20);
    }

    @Test
    public void testWithdraw() {
        a.deposit(20);
        assertEquals(0d, a.withdraw(0), DELTA);
        assertEquals(20d, a.getBalance(), DELTA);

        assertEquals(5d, a.withdraw(5), DELTA);
        assertEquals(15d, a.getBalance(), DELTA);

        assertEquals(15d, a.withdraw(15), DELTA);
        assertEquals(0d, a.getBalance(), DELTA);

        assertEquals(0d, a.withdraw(0), DELTA);
        assertEquals(0d, a.getBalance(), DELTA);

        assertEquals(0d, a.withdraw(100), DELTA);
        assertEquals(0d, a.getBalance(), DELTA);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testWithdrawNegative() {
        a.withdraw(-20);
    }

    @Test
    public void testGetBalance() {
        a.deposit(100);
        assertEquals(100d, a.getBalance(), DELTA);
    }

}
