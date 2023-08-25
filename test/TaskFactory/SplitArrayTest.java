package TaskFactory;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitArrayTest {

    @Test
    public void testThatDigitCanBeRetrievedInAnArray(){

        int[] actual = SplitArray.splitDigits(23,45,60,38);
        int[] expected = {2,3,4,5,6,0,3,8};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatDigitCanBeRetrievedInAnArrayIfArrayIsLonger(){

        int[] actual = SplitArray.splitDigits(236,145,6890,37832);
        int[] expected = {2,3,6,1,4,5,6,8,9,0,3,7,8,3,2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatOneCanBeAddedToTheArrayNumber(){
        int[] actual = SplitArray.addOneSplitDigits(9,9,9);
        int[] expected = {1,0,0,0};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatOneCanBeAddedToTheArrayOfNumber(){
        int[] actual = SplitArray.addOneSplitDigits(2,4,5);
        int[] expected = {2,4,6};

        assertArrayEquals(expected, actual);
    }
}
