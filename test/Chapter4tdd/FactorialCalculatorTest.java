package Chapter4tdd;

import org.testng.annotations.Test;
import tdd.FactorialCalculator;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    @Test
    public void testThatFactorialWorks(){
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int factorialAnswer = factorialCalculator.calculateFactorial(0);
        assertEquals(1, factorialAnswer);

    }

    @Test
    public void testThatFactorialWorks_2() {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int factorialAnswer = factorialCalculator.calculateFactorial(1);
        assertEquals(1, factorialAnswer);
    }

    @Test
    public void testThatFactorialWorks_1() {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int factorialAnswer = factorialCalculator.calculateFactorial(11);
        assertEquals(39916800, factorialAnswer);
    }

    @Test
    public void testThatFactorialWorks_3() {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int factorialAnswer = factorialCalculator.calculateFactorial(7);
        assertEquals(5040, factorialAnswer);
    }

//    @Test
//    public void testForNegativeValue() {
//        FactorialCalculator factorialCalculator = new FactorialCalculator();
//        int factorialAnswer = factorialCalculator.calculateFactorial(-7);
//        assertEquals(0, factorialAnswer);
//    }
}
