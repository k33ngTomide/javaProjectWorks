package OurPracticeTasksTest;

import OurPracticeTasks.BinaryDecimal;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BinaryToDecimalTest {

    @Test
    public void testForConversionFromBinaryToDecimal(){
        int convertedValue = BinaryDecimal.toDecimal(1101);
        assertEquals(13, convertedValue);
    }

    @Test
    public void testForConversionFromBinaryToDecimal_1(){
        int convertedValue = BinaryDecimal.toDecimal(11011);
        assertEquals(27, convertedValue);
    }

}
