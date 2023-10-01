package Minute25Test;

import Minutes25.KissDry;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KissDryTest {

    @Test void testThatGivenWordWillBeReturnedWithGivenIndex(){

        String word = "kissdry";

        int[] indices = {6, 2, 3, 4, 1, 0, 5};

        String actual = KissDry.getWord(word, indices);
        assertEquals("yssdikr", actual);
    }
}
