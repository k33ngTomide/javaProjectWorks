package TaskTest;

import Tasks.ReverseNumber;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ReserveNumberTest {

    @Test
    public void testForReverse(){
        int reverse = ReverseNumber.reverse(87654);
        assertEquals(45678, reverse);
    }

    @Test
    public void testForReverse_1(){
        int reverse = ReverseNumber.reverse(98295);
        assertEquals(59289, reverse);
    }
}
