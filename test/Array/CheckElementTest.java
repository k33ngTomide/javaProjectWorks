package Array;

import Assignments.Array.CheckElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CheckElementTest {

    @Test
    public void testForElement_Presence(){
        int isElementPresent =
                CheckElement.isPresent(26, 36, 27, 82, 25, 45, 26, 73, 54);

        assertEquals(5, isElementPresent);
    }

    @Test
    public void testForElement_NotPresent(){
        int isElementPresent =
                CheckElement.isPresent(20, 36, 27, 82, 25, 45, 26, 73, 54);

        assertEquals(-1, isElementPresent);
    }

    @Test
    public void testForNegativeElement_Presence(){
        int isElementPresent =
                CheckElement.isPresent(-26, 36, 27, 82, 25, 45, 26, 73, 54);

        assertEquals(-1, isElementPresent);
    }
}
