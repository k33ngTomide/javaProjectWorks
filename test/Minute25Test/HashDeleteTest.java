package Minute25Test;

import Minutes25.HashDelete;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashDeleteTest {

    @Test public void testThatTheLetterBeforeHashIsRemoved_returnTrueIfEqual(){
        assertTrue(HashDelete.implBackSpace("ab#c", "al#c"));
    }

    @Test public void testThatTheLetterBeforeHashIsRemoved_andReturnFalseIfNotEqual(){
        assertFalse(HashDelete.implBackSpace("abb#c", "alb#c"));
    }
}
