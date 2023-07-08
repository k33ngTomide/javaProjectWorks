package Chapter5tdd;

import ChapterFive.DivisibleBy3;
import ChapterTwo.DivisibleByThree;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleByThreeTest {

    @Test
    public void testForDivisionOfThreeAnswers(){
        DivisibleBy3 uloma = new DivisibleBy3();
        int answer = uloma.divisionOfThree(10);
        assertEquals(18, answer);

    }

    @Test
    public void testForNegativeNumber(){
        DivisibleBy3 uloma = new DivisibleBy3();
        int answer = uloma.divisionOfThree(-10);
        assertEquals(0, answer);

    }

    @Test
    public void testForThirty(){
        DivisibleBy3 uloma = new DivisibleBy3();
        int answer = uloma.divisionOfThree(30);
        assertEquals(165, answer);

    }
}
