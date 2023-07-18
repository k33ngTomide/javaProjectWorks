package OurPracticeTasksTest.Array;

import OurPracticeTasks.Array.ArrayCopy;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayCopyTest {

    @Test
    public void testThatArrayCanBeCopied(){
        int[] newArray = {1, 2, 3, 4, 5};
        int[] array = ArrayCopy.copyList(1, 2, 3, 4, 5);

        assertArrayEquals(newArray, array);
    }

    @Test
    public void testThatArrayCanBeCopied_1(){
        int[] newArray = {-2, 22, -13, 48, 15};
        int[] array = ArrayCopy.copyList(-2, 22, -13, 48, 15);

        assertArrayEquals(newArray, array);
    }
}
