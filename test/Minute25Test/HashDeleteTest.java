package Minute25Test;

import Minutes25.HashDelete;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashDeleteTest {

    @Test public void testThatTheLetterBeforeHashIsRemoved_returnTrueIfEqual(){
        assertTrue(HashDelete.implBackSpace("ab#c", "al#c"));
    }

    @Test public void testThatTheLetterBeforeHashIsRemoved_andReturnFalseIfNotEqual(){
        assertFalse(HashDelete.implBackSpace("abb#c", "alb#c"));
    }

    @Test public void testThatAllCharactersAreImplemented(){
        String given = "The&name&of&my&guy&is&Seyi%And&he&is&a&mad&guy";
        String expected = "The name of my guy is Seyi.    And he is a mad guy";

        assertEquals(expected, HashDelete.implSpace(given));
    }

}
