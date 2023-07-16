package Array;

import Assignments.Array.ArrayOfDigit;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ArrayOfDigitsTest {

    @Test
    public void testThatFunctionReturnsListOfDigit(){
        String digitList = ArrayOfDigit.listOfDigits("123487");

        assertEquals("1, 2, 3, 4, 8, 7", digitList);
    }
}
