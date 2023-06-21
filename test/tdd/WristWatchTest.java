package tdd;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WristWatchTest {

    @Test
    public void canWatchBeCreated(){
        WristWatch hublot;
        hublot = new WristWatch();

        assertNotNull(hublot);
    }

    @Test
    public void canWatchSetTimeTest(){
        WristWatch hublot = new WristWatch();

//        hublot.setTime(2, 30, 45);


    }

    @Test
    public void canWatchSetMinutes(){
        WristWatch hublot = new WristWatch();

        hublot.convertMinutes(20);
        assertEquals(20 , hublot.getMinutes());

    }

    @Test
    public void canWatchSetSecondsTest(){
        WristWatch hublot = new WristWatch();

        hublot.convertSeconds(50);
        assertEquals(50 , hublot.getSeconds());

    }

    @Test
    public void canWatchConvertSecondsToHoursAndMinutes(){
        WristWatch hublot = new WristWatch();

//        hublot.setTime(0,0 ,3601);
        assertEquals(1 ,hublot.getHours());
        assertEquals(0, hublot.getMinutes());
        assertEquals(1, hublot.getSeconds());

    }
    @Test
    public void canWatchConvertMinutesToHours(){
        WristWatch hublot = new WristWatch();

//        hublot.setTime(1,500,45);
        assertEquals(9 ,hublot.getHours());
        assertEquals(20, hublot.getMinutes());
        assertEquals(45, hublot.getSeconds());

    }

    @Test
    public void canWatchConvertHours(){
        WristWatch hublot = new WristWatch();

        hublot.convertHours(24);
        assertEquals(0,hublot.getHours());
        assertEquals(0, hublot.getMinutes());
        assertEquals(0, hublot.getSeconds());

    }
    @Test
    public void canWatchConvertMinutesTest(){
        WristWatch hublot = new WristWatch();

        hublot.convertMinutes(1250);
        assertEquals(20,hublot.getHours());
        assertEquals(50, hublot.getMinutes());
        assertEquals(0, hublot.getSeconds());

    }

    @Test
    public void canWatchConvertSecondsTest(){
        WristWatch hublot = new WristWatch();

        hublot.convertSeconds(86300);
        assertEquals(0,hublot.getHours());
        assertEquals(20, hublot.getMinutes());
        assertEquals(50, hublot.getSeconds());

    }







}
