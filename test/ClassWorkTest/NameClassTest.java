package ClassWorkTest;

import ClassWork.NameClass;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameClassTest {

    @Test void testThatNameInitialWithNameIsReturned() {
        String actual = NameClass.getInitial("Muiliyu sodiq Tomide Akintomide");

        assertEquals("M.S.T. Akintomide", actual);
    }

    @Test void testThatNameInitialWithNameIsReturned_again() {
        String actual = NameClass.getInitial("Femi Mustapha Adebayo");

        assertEquals("F.M. Adebayo", actual);
    }
}
