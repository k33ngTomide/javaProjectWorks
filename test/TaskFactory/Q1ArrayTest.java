package TaskFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Q1ArrayTest {

    @Test
    public void testThatArrayCanBeRearranged(){
        int[] actual = Q1Array.rearrange(1,2,3,4,5,6);
        int[] expected = {2,1,4,3,6,5};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void testThatArrayCanBeRearrangedWhenLengthIsOdd(){
        int[] actual = Q1Array.rearrange(1,2,3,4,5);
        int[] expected = {2,1,4,3,5};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void testThatArrayWillNotRearrangeIfThereIsOneEvenNumber(){
        int[] actual = Q1Array.rearrangedOdd(45,52,11,33,48,25);
        int[] expected = {45,52,33,11,48,25};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatArrayCanBeTurned(){
        int[] actual = Q1Array.mirrorArray(45,52,11,33,48,25);
        int[] expected = {25,48,33,11,52,45};
        assertArrayEquals(expected, actual);

    }


}
