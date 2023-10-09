package CollectionsClasses;

import org.testng.annotations.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MySetTest {

    @Test
    public void testThatNon_DuplicateOfList_willBeReturned(){
        String[] value = {"water", "sand", "salt", "water", "ground"};
        List<String> given = Arrays.asList(value);

        Set<String> actual = MySet.printNonDuplicates(given);
        assertEquals(Set.of("sand", "salt", "water", "ground"), actual);
    }
}
