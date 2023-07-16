package Array;

import Assignments.Array.AlternatingList;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlternatingListTest {

    @Test
    public void testForAlternate(){
        char[] characters = {'a', 'b', 'c'};
        int[] numbers = {1, 2, 3};
        String alternate = AlternatingList.alternateList(characters, numbers);

        assertEquals("a, 1, b, 2, c, 3", alternate);


    }
}
