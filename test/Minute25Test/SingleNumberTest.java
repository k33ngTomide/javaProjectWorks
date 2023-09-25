package Minute25Test;

import Minutes25.SingleNumber;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @Test void testThatSingleNumberWillBeReturned(){
        int[] given = {2, 2, 1};
        int number = SingleNumber.getSingleNumber(given);

        assertEquals(1, number);
    }

    @Test void testOnlyThatSingleNumberWillBeReturned(){
        int[] given = {4, 3, 2, 2, 3, 3};
        int number = SingleNumber.getSingleNumber(given);

        assertEquals(4, number);
    }

    @Test void testOnlyThatSingleNumberWillBeReturned_Again(){
        int[] given = {1};
        int number = SingleNumber.getSingleNumber(given);

        assertEquals(1, number);
    }

    @Test void testThatEveryElementInTheReturnedArrayIsAString(){
        Object[] given = {3, "2", 1, "table", 8};

        List<String> expected = List.of(new String[]{"2", "table"});
        assertEquals(expected, SingleNumber.removeNonStringElement(given));
    }


    @Test void testThatMaximumDifferenceWillBeReturned(){
        int[] given = {5, 7, 15, 1, 10};

        assertEquals(14, SingleNumber.maximumDifference(given));
    }

}