package Chapter4tdd;

import ChapterFour.Factorial;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    private Factorial factorial = new Factorial();

    @Test
    public void calculateFactorialTest(){
        assertEquals(120, factorial.calculateFactorial(5));
    }

    @Test
    public void calculateFactorialTestMore(){
        assertEquals(3_628_800, factorial.calculateFactorial(10));
    }

    @Test
    public void calculateFactorialTestMoreAndMore_(){
        assertEquals(3_628_800*11, factorial.calculateFactorial(11));
    }

    @Test
    public void calculateFactorialTestMoreAndMore(){
        assertEquals(3_628_800/10, factorial.calculateFactorial(9));
    }

    @Test
    public void calculateFactorialForNegativeNumberTest(){
        assertEquals("Invalid input", factorial.calculateFactorial(-9));
    }
}
