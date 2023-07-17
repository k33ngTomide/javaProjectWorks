package TaskTest;

import Tasks.MultiplyClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MultiplyClassTest {

    @Test
    public void testForNumberMultiply(){
        int answer = MultiplyClass.multiply(2, 8);
        assertEquals(16, answer);
    }

    @Test
    public void testForNumberMultiplyAgain(){
        int answer = MultiplyClass.multiply(10, 8);
        assertEquals(80, answer);
    }
}
