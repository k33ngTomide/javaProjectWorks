package ClassWorkTest;

import ClassWork.Isogram;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsogramTest {


    @Test
    public void testIfTrueWillBeReturnedIfTextIsIsogram(){
        Isogram isogram = new Isogram();
        boolean actual = isogram.isIsogram("ab^^)c def __ 090876@#$%^&*543356ghi jkl mno~*//|,!# pqr stu vwx yz");
        assertTrue(actual);
    }

    @Test
    public void testIfFalseWillBeReturnedIfTextIsNotIsogram(){
        Isogram isogram = new Isogram();
        boolean actual = isogram.isIsogram("abc def ghi jkl pqr stu vwx yz");
        assertFalse(actual);
    }

    @Test
    public void testIfFalseWillBeReturnedIfTextContainAnyAlphabetMoreThanOnce(){
        Isogram isogram = new Isogram();

        boolean actual = isogram.isIsogram("akbc degf ghi jkl mmno pqr stu vwx yz");
        assertFalse(actual);
    }
}
