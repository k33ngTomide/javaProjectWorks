package Array;

import Assignments.Array.LargestElement;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class LargestElementTest {

    @Test
    public void testThatListWillReturn_LargestElement_AllPositiveNumbers(){


        double largestElement = LargestElement.getLargest(11, 56, 43, 23);
        assertEquals(56, largestElement);
    }

    @Test
    public void testThatListWillReturn_LargestElement_MixedWithNegativeNumber(){

        double largestElement = LargestElement.getLargest(-111, 6, -403, 2, -15, 0);
        assertEquals(6, largestElement);
    }

    @Test
    public void testThatListWillReturn_LargestElement_AllNegativeNumber(){

        double largestElement = LargestElement.getLargest(-111, -65, -403, -20, -18);
        assertEquals(-18, largestElement);
    }

}
