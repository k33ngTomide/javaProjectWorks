package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class CalculatorTest {
    @Test
    public void canCalculatorBeCreatedTest() {
        Calculator casio;
        casio = new Calculator();
    }
    @Test
    public void canBeOnTest(){
        Calculator casio = new Calculator();
        assertFalse(casio.isOn());

        casio.power();
        assertTrue(casio.isOn());
    }
    @Test
    public void canBeOffTest(){
        Calculator casio = new Calculator();
        casio.power();
        assertTrue(casio.isOn());

        casio.power();
        assertFalse(casio.isOn());
    }
    @Test
    public void canCalculatorAddTest(){
        Calculator casio = new Calculator();
        casio.power();
        assertTrue(casio.isOn());

        casio.add(5, 6);
        assertEquals(11, casio.getResult());

    }
    @Test
    public void canCalculatorSubtractTest(){
        Calculator casio = new Calculator();
        casio.power();
        assertTrue(casio.isOn());

        casio.subtract(11, 4);
        assertEquals(7, casio.getResult());

    }

    @Test
    public void canCalculatorDivideTest(){
        Calculator casio = new Calculator();
        casio.power();
        assertTrue(casio.isOn());

        casio.divide(10.0, 5.0);
        assertEquals(2.0, casio.getResult());

    }

    @Test
    public void canCalculatorMultiply(){
        Calculator casio = new Calculator();
        casio.power();
        assertTrue(casio.isOn());

        casio.multiply(11.1, 7.0);
        assertEquals(77.7, casio.getResult());
    }

    @Test
    public void cannotAddIfCalculatorIsOff(){
        Calculator casio = new Calculator();
        casio.add(3,4);
        assertEquals(0, casio.getResult());
    }

    @Test
    public void canAddNegativeNumberTest(){
        Calculator casio = new Calculator();
        casio.power();
        assertTrue(casio.isOn());

        casio.add(-33.0,4.0);
        assertEquals(-29.0, casio.getResult());
    }
    @Test
    public void  canRemainderBeCalculatedTest(){
        Calculator casio = new Calculator();
        casio.power();
        assertTrue(casio.isOn());

        casio.remainder(10, 7);
        assertEquals(3, casio.getResult());

    }

}
