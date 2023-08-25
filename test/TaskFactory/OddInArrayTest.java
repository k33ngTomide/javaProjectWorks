package TaskFactory;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddInArrayTest {

    @Test
    public void testThatNegativeTwoCanBeDeductedFromTheOddElementsInArray(){
        int[] actual = OddInArray.getOddElementsDeductedByTwo(22, 41, 15, 8, 2, 1);
        int[] expected = {39, 13, -1};

        assertArrayEquals(expected, actual);
    }
}
