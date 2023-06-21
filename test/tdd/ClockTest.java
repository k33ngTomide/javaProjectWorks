package tdd;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClockTest {

    @Test
    public void canClockBeCreatedTest(){
        Clock rolex;
        rolex = new Clock();
        assertNotNull(rolex);

    }

    @Test
    public void canMinutesBeSetTest(){
        Clock rolex = new Clock();
        rolex.setMinutes(60);
        assertEquals(60, rolex.getMinutes());

        rolex.setMinutes(80);
        assertEquals(80, rolex.getMinutes());

    }

    @Test
    public void canMinutesBe_Converted_To_Seconds(){
        Clock rolex = new Clock();

        rolex.convertMinutes(60);
        assertEquals(3600, rolex.getSeconds());

    }

    @Test
    public void canNegativeMinutesBe_Converted_To_Seconds(){
        Clock rolex = new Clock();

        rolex.convertMinutes(-10);
        assertEquals(0, rolex.getSeconds());

    }

    @Test
    public void canSecondsBeConvertedToMinutes(){
        Clock rolex = new Clock();

        rolex.convertSeconds(6000);
        assertEquals(100, rolex.getMinutes());
    }

    @Test
    public void canMinutes_Be_Converted_To_Years(){
        Clock rolex = new Clock();

        rolex.convertMinutes(1051200);
        assertEquals(2, rolex.getYear());
    }


}
