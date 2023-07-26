package Chapter4tdd;

import Dietel.ChapterFour.CreditLimitCalculator;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CreditLimitCalculatorTest {

    private final CreditLimitCalculator customer = new CreditLimitCalculator();

    @Test
    public void testForBalance()
    {
        double customerInput = customer.creditInput(5000.0,
                400.0, 700.0);
        assertEquals(4700, customerInput);
    }

    @Test
    public void testIfBalanceAt_The_Beginning_CanBeNegative()
    {
        double customerInput = customer.creditInput(-5000.0,
                400.0, 700.0);
        assertEquals(0, customerInput);
    }

}
