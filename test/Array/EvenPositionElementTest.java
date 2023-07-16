package Array;

import Assignments.Array.EvenPositionElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EvenPositionElementTest {

    @Test
    public void testThatElementOnEvenPosition_canBePrinted(){
        String output =
                EvenPositionElement.getElementsAtEvenPosition(34, 43, 23, 73, 12, 24, 78, 48);

        assertEquals("43 73 24 48", output);

    }

    @Test
    public void testThatFloatingElementOnEvenPosition_canBePrinted(){
        String output =
                EvenPositionElement.getElementsAtEvenPosition(3.5, 43.5, 27.8, 7.3, 1.2, 2.4, 7.8, 4.8);

        assertEquals("43.5 7.3 2.4 4.8", output);

    }
}
