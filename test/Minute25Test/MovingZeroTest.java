package Minute25Test;

import Minutes25.MovingZeros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovingZeroTest {


    @Test
    void testThatZerosAreMoved() {
        int[] given = {4, 3, 0, 2, 0, 4, 10, 12};
        String[] expected = {"4", "3", "2", "4", "10", "12", "0", "0"};

        assertArrayEquals(expected, MovingZeros.moveZero(given));
    }
}
