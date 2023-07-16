package Array;

import Assignments.Array.SumOfNumbersInList;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SumOfNumbersInListTest {

    @Test
    public void testForSumOfTheNumbersInList(){
        int sum = SumOfNumbersInList.getSumOfList(23, 25, 56, 57, 43, 12);
        assertEquals(216, sum);
    }

    @Test
    public void testForSumOfTheListWithFloatingNumbers(){
        double sum = SumOfNumbersInList.getSumOfList(23.5, 2.5, 5.6, 5.7, 43.5, 12.6);
        assertEquals(93.4, sum);
    }

    @Test
    public void testForSumOfTheListWithNegativeNumbers(){
        double sum = SumOfNumbersInList.getSumOfList(-3.5, 2.5, 5.6, 5.7, -3.5, 12.6);
        assertEquals(19.4, sum);
    }


}
