package Minute25Test;

import Minutes25.ArrayManipulations;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayManipulationsTest {

    @Test public void testThatTheLargestNumberIsReturned(){
        int[] num = {1, 65, 71, 40, 90, 23, 1, 6, 7, 9};
        int expected = ArrayManipulations.getLargestNumber(num);
        assertEquals(90, expected);
    }

    @Test public void testThatTheReverseWillBeReturned(){
        int[] num = {1, 65, 71, 40, 90, 23, 1, 6, 7, 9};
        int[] reversed = {9, 7, 6, 1, 23, 90, 40, 71, 65, 1};
        int[] expected = ArrayManipulations.reverse(num);
        assertArrayEquals(reversed, expected);
    }

}
