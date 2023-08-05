package Array;

import Assignments.Array.Position;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PositionTest {

    @Test
    public void testForPosition(){

        int[] actual = Position.assignGrade(5, 18, 32, 3, 4);
        int[] expected = {3, 2, 1, 5, 4};
        assertArrayEquals(expected, actual);

    }

}
