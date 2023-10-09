package Minute25Test;

import Minutes25.FrequentNumbers;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequentNumbersTest {

    @Test
    public void testThatMostFrequentNumberWillBeReturned(){
        int[] given = {3,2,3};

        assertEquals(3, FrequentNumbers.getMostFrequent(given));
    }

    @Test
    public void testThatMostFrequentNumber_WillBeReturned_(){
        int[] given = {2,2,1,1,1,2,2};

        assertEquals(2, FrequentNumbers.getMostFrequent(given));
    }

    @Test
    public void testThatMost_FrequentNumber_WillBeReturned_(){
        int[] given = {1,1,1,2,2};

        assertEquals(1, FrequentNumbers.getMostFrequent(given));
    }
}
