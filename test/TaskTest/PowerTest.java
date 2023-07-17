package TaskTest;

import Tasks.Power;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PowerTest {

    @Test
    public void testForPower(){
        int answer = Power.power(5, 3);

        assertEquals(125, answer);
    }

    @Test
    public void testForPower_1(){
        int answer = Power.power(6, 2);

        assertEquals(36, answer);
    }

    @Test
    public void testForPower_2(){
        int answer = Power.power(8, 4);

        assertEquals(4096, answer);
    }
    @Test
    public void testForPower_3(){
        int answer = Power.power(10, 4);

        assertEquals(10000, answer);
    }
}
