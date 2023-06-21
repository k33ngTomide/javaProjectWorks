package tdd;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class ChairTest {

    @Test
    public void doesChairHaveBack(){
        //given
        Chair woodenChair = new Chair();
        woodenChair.hasBack(true);
        assertTrue(woodenChair.getBack());

    }

    @Test
    public void canBackBeRemoved(){

    }

}
