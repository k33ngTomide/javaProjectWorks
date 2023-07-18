package Array;

import Assignments.Array.AlternatingList;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.testng.AssertJUnit.assertEquals;

public class AlternatingListTest {

    @Test
    public void testForAlternate(){
        char[] characters = {'a', 'b', 'c'};
        int[] numbers = {1, 2, 3};
        String[] alternate = AlternatingList.alternateList(characters, numbers);
        String[] land = new String[]{"a, 1, b, 2, c, 3"};
        assertArrayEquals(land, alternate);


    }
}
