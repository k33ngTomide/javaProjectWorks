package TaskTest;

import Tasks.BigAndSmall;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class BigAndSmallTest {

    @Test
    public void testForBigAndSmallNumber(){
        int[] query = {1, 5};
        int[] answer = BigAndSmall.getLargestAndSmallestSum(1, 2, 3, 4, 5);
        assertArrayEquals(query, answer);

    }
}
