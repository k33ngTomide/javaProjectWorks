package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuildingTest {
    private Building kingPalace;
    @BeforeEach
    public void setup(){
        kingPalace = new Building();
    }
    @Test
    public void canBuildingBeBuilt(){
        kingPalace = new Building();
        assertNotNull(kingPalace);
    }
    @Test
    public void isWifiAvailable(){
        kingPalace = new Building();
        assertFalse(kingPalace.hasWifi());
    }

    @Test
    public void canWifiBeOn(){
        kingPalace = new Building();
        kingPalace.setHasWifi(true);
        assertTrue(kingPalace.hasWifi());

        //kingPalace.power();
        //assertTrue(kingPalace.getWifi());
    }
}
