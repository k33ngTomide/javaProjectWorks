package Minute25Test;

import Minutes25.AddDigits;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddDigitsTest {

    @Test
    public void testThatAdditionOfTheDigitWillBeReturned(){

        assertEquals(2, AddDigits.addDigits(38));
    }
}
