package OurPracticeTasksTest.Array;

import OurPracticeTasks.Array.SpecificPosition;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SpecificPositionTest {

    @Test
    public void testThatElementCanBeAddedToSpecifiedPosition(){
        int[] answer = SpecificPosition.insertElement
                (4, 5, 45, 7, 23, 56, 78);
        int[] expected = {45, 7, 23, 5, 78};
        assertArrayEquals(expected, answer);
    }
    @Test
    public void testThatElementCanBeAddedToSpecifiedPosition_1(){
        int[] answer = SpecificPosition.insertElement
                (7, 34, 45, 7, 23, 56, 78, 24, 26, 96);
        int[] expected = {45, 7, 23, 56, 78, 24, 34, 96};
        assertArrayEquals(expected, answer);
    }
}
