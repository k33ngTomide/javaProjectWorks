package Array;

import Assignments.Array.ReverseList;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ReverseListTest {

    @Test
    public void testThatListCanBeReversed(){
        String reversedList = ReverseList.reverseList(32, 43, 65, 78, 23);

        assertEquals("23, 78, 65, 43, 32", reversedList);

    }

    @Test
    public void testThatFLoatingListCanBeReversed(){
        String reversedList = ReverseList.reverseList(3.5, 47.8, 6.89, 79.3, 20.8);

        assertEquals("20.8, 79.3, 6.89, 47.8, 3.5", reversedList);

    }
}
