package tdd;

import org.junit.jupiter.api.BeforeEach;
import TheTasks.CurrencyExchange;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CurrencyExchangeTest {

    private CurrencyExchange currency;
    @BeforeEach
    public void setup(){
        currency = new CurrencyExchange();
    }

    @Test
    public void test_USD_currencyExchange_To_RMB() {
        double exchange = currency.calculateUSDCurrencyToRMB(100.0, 6.81);

        assertEquals(681.0, exchange);
    }

    @Test
    public void test_RMB_currencyExchange_To_USD() {
        double exchange = currency.calculateRMBCurrencyToUSD(10000.0, 6.81);

        assertEquals(1468.43, exchange, 0.5);
    }
}
