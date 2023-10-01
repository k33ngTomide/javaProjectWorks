package Minute25Test;

import Minutes25.SmallNumbers;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SmallNumbersTest {

    @Test void testThatAll_zerosAreMovedToBack(){
        int[] given = {2, 0, 4, 5, 0, 1, 3, 0, 5};

        int[] expected = {2, 4, 5, 1, 3, 5, 0, 0, 0};

        assertArrayEquals(expected, SmallNumbers.moveAllZeros(given));


    }

}
