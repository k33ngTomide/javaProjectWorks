package Chapter4tdd;

import ChapterFour.Exponential;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExponentialTest {

    @Test
    public void testAnswerOfExponential(){
        Exponential calc = new Exponential();
        assertEquals(2.5, calc.expo(2));
    }

    @Test
    public void testIfExponentialCanTake_Negative(){
        Exponential calc = new Exponential();
        assertEquals(0, calc.expo(-2));
    }
}
