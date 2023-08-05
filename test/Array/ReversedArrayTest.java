package Array;

import OurPracticeTasks.Array.ReverrsedArray;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReversedArrayTest {

    @Test
    public void testForArrayReverse(){
        int[] reversed = ReverrsedArray.elementReverse(34, 56, 74, 83, 95);
        int[] workDone = {95, 83, 74, 56, 34};

        assertArrayEquals(workDone, reversed);
    }
}
