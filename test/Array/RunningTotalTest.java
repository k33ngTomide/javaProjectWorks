package Array;

import Assignments.Array.RunningTotal;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RunningTotalTest {

    @Test
    public void testForFloating_RunningTotal(){
        double total = RunningTotal.getTotal(1, 2, 22.5, 3, 4, 5);

        assertEquals(37.5, total);

    }

    @Test
    public void testForRunningTotal(){
        int total = RunningTotal.getTotal(1, 2, 25, 3, 4, 5);

        assertEquals(40, total);

    }


}
