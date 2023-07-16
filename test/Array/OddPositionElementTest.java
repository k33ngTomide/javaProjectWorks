package Array;

import Assignments.Array.OddPositionElements;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class OddPositionElementTest {

    @Test
    public void testThatElementOnOddPosition_canBePrinted(){
        String output =
                OddPositionElements.getElementsAtOddPositions(34, 43, 23, 73, 12, 24, 78, 48);

        assertEquals("34 23 12 78", output);

    }

    @Test
    public void testThatFloatingElementOnOddPosition_canBePrinted(){
        String output =
                OddPositionElements.getElementsAtOddPositions(3.5, 43.5, 27.8, 7.3, 1.2, 2.4, 7.8, 4.8);

        assertEquals("3.5 27.8 1.2 7.8", output);

    }
}
