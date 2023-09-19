package ClassTaskTest;

import Minutes25.StringManipulation;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulationTest {

    @Test void testThatSecondLargestNumberIsReturned(){
        String input = "dfa12321afd";

        assertEquals(2, StringManipulation.getSecondLargestNumber(input));
    }

    @Test void testThatNegativeOneIsReturned_IfNoSecondLargestNumberIsPresent(){
        String input = "ad11111sfhdf1111gdhdt111";

        assertEquals(-1, StringManipulation.getSecondLargestNumber(input));
    }
}
