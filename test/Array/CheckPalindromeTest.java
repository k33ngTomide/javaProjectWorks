package Array;

import Assignments.Array.CheckPalindrome;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CheckPalindromeTest {

    @Test
    public void testThatStringIsAPalindrome(){
        boolean isPalindrome = CheckPalindrome.isStringPalindrome("Adeleda");

        assertEquals(true, isPalindrome);
    }

    @Test
    public void testThatStringIsNotAPalindrome(){
        boolean isPalindrome = CheckPalindrome.isStringPalindrome("Stars");
        assertEquals(false, isPalindrome);
    }
}
