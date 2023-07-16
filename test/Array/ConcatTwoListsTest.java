package Array;

import Assignments.Array.ConcatTwoLists;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

import static org.testng.AssertJUnit.assertEquals;

public class ConcatTwoListsTest {

    @Test
    public void testThatTwoListCanBeConcatenated(){
        String[] numbers = {"43", "23", "23", "23"};
        String[] chars = {"a", "b", "c", "d"};
        String joinedList = ConcatTwoLists.addTwoLists(numbers, chars);

        assertEquals("43, 23, 23, 23, a, b, c, d", joinedList);
    }

    @Test
    public void testThatTwoListCanBeConcatenated_(){
        String[] numbers = {"-3", "2", "230", "203"};
        String[] chars = {"a", "b", "c", "d"};
        String joinedList = ConcatTwoLists.addTwoLists(numbers, chars);

        assertEquals("-3, 2, 230, 203, a, b, c, d", joinedList);
    }
}
