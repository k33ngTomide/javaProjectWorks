package ClassWorkTest;

import ClassWork.CharacterChecker;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CharacterCheckerTest {

    @Test
    public void testIfCharacterIsPresent(){
        CharacterChecker characterChecker = new CharacterChecker();

        boolean isPresent = characterChecker.isSpecialCharacterPresent("12323#gdkjszdn");
        assertTrue(isPresent);
    }

    @Test
    public void testIfCharacterIsNotPresent(){
        CharacterChecker characterChecker = new CharacterChecker();

        boolean isPresent = characterChecker.isSpecialCharacterPresent("12323gdkjszdn");
        assertFalse(isPresent);
    }
}
