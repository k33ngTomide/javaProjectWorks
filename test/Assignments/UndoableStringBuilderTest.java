package Assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UndoableStringBuilderTest {

    @Test
    void testThatAppendAddTheAvailableWord() {
        UndoableStringBuilder word = new UndoableStringBuilder("This is How Legends are made.");
        StringBuilder appendedWord = word.append(" This is just the Beginning.");

        StringBuilder expected = new StringBuilder("This is How Legends are made. This is just the Beginning.");
        assertEquals(expected.toString(), appendedWord.toString());

    }

    @Test
    void testThatReplaceReplacesWordsAtSpecifiedLocation() {
        UndoableStringBuilder word = new UndoableStringBuilder("This is How Legends are made.");

        StringBuilder replacedWord = word.replace(2, 7, "ese are");
        assertEquals("These are How Legends are made.", replacedWord.toString());
    }

    @Test
    void testThatReverseMethodReversesTheWord() {
        UndoableStringBuilder word = new UndoableStringBuilder();
        word.append("Squid Game");

        StringBuilder reversedWord = word.reverse();
        assertEquals("emaG diuqS", reversedWord.toString());
    }

    @Test
    void testThatInsertInputsWordsInSpecifiedOffset() {
        UndoableStringBuilder word = new UndoableStringBuilder();
        word.append("Squid Game");

        StringBuilder newWord = word.insert(6, "Movie was a nice ");
        assertEquals("Squid Movie was a nice Game", newWord.toString());

    }

    @Test
    void testThatTheUndoMethodCanGoBackToThePreviousText(){
        UndoableStringBuilder givenWord = new UndoableStringBuilder();
        StringBuilder afterAppend = givenWord.append("to be or not to be");
        assertEquals("to be or not to be", afterAppend.toString());

        StringBuilder afterFirstReplace = givenWord.replace(3, 5, "eat");
        assertEquals("to eat or not to be", afterFirstReplace.toString());

        StringBuilder afterSecondReplace = givenWord.replace(17, 19, "eat");
        assertEquals("to eat or not to eat", afterSecondReplace.toString());

        StringBuilder afterReverse =  givenWord.reverse();
        assertEquals("tae ot ton ro tae ot", afterReverse.toString());

        StringBuilder firstUndo = givenWord.undo();
        assertEquals("to eat or not to eat", firstUndo.toString());


        StringBuilder secondUndo = givenWord.undo();
        assertEquals("to eat or not to be", secondUndo.toString());

        StringBuilder finalUndo = givenWord.undo();
        assertEquals("to be or not to be", finalUndo.toString());
    }

}
