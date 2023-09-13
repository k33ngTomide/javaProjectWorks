package ClassWorkTest;

import ClassWork.ArrayManipulate;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayManipulateTest {

    @Test
    public void testThatElementsAtGivenIndicesCanBeSwapped(){
        int[] given = {5,2,6,10,9,3};
        int[] expected = {5,2,9,10,6,3};

        int[] actual = ArrayManipulate.swapElement(2, 4, given);
        assertArrayEquals(expected, actual);

    }
}
