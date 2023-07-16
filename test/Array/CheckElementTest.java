package Array;

import Assignments.Array.CheckElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CheckElementTest {

    @Test
    public void testForElement_Presence(){
        boolean isElementPresent =
                CheckElement.isPresent(26, 36, 27, 82, 25, 45, 26, 73, 54);

        assertEquals(true, isElementPresent);
    }

    @Test
    public void testForElement_NotPresent(){
        boolean isElementPresent =
                CheckElement.isPresent(20, 36, 27, 82, 25, 45, 26, 73, 54);

        assertEquals(false, isElementPresent);
    }

    @Test
    public void testForNegativeElement_Presence(){
        boolean isElementPresent =
                CheckElement.isPresent(-26, 36, 27, 82, 25, 45, 26, 73, 54);

        assertEquals(false, isElementPresent);
    }
}
