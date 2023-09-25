package Minute25Test;

import Minutes25.ConcatTwoArrays;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcatTwoArraysTest {

    @Test void testThatReturned_Array_willBeAddition_ofTwoArray(){

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8};

        int[] actual = ConcatTwoArrays.add(array1, array2);
        int[] expected = {5,4,3,2,1,8,7,6};

        assertArrayEquals(expected, actual);
    }


}
