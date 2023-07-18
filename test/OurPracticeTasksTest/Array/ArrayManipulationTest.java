package OurPracticeTasksTest.Array;

import OurPracticeTasks.Array.ArrayManipulation;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayManipulationTest {

    @Test
    public void testThatAnElementCanBeRemoved(){
        int[] answer = ArrayManipulation.remove(1, 1, 2, 3, 4, 5);
        int[] compare = {2, 3, 4, 5};
        assertArrayEquals(compare, answer);
    }

    @Test
    public void testThatAnElementCanBeRemoved_1(){
        int[] answer = ArrayManipulation.remove(23, 12, 23, 23, 40, 23, 25, 46);
        int[] compare = {12, 40, 25, 46};
        assertArrayEquals(compare, answer);
    }

    @Test
    public void testThatAnElementCanBeRemovedNegative(){
        int[] answer = ArrayManipulation.remove(-2, 12, -2, -2, 40, -2, -2, 46);
        int[] compare = {12, 40, 46};
        assertArrayEquals(compare, answer);
    }
}
