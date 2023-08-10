package ClassWorkTest;

import Zones.GeoPoliticalZone;
import Zones.Nigeria;
import org.testng.annotations.Test;

import java.util.Arrays;

import static Zones.GeoPoliticalZone.*;
import static org.junit.jupiter.api.Assertions.*;

public class GeoPoliticalZoneTest {

    @Test
    public void testToCheckAllEnums(){
        GeoPoliticalZone[] zone = values();
        System.out.println(Arrays.toString(zone) + "\n");

    }
    @Test
    public void testIfZoneWillBeReturned(){

        GeoPoliticalZone zone = GeoPoliticalZone.findZone("Osun");
        assertEquals(SOUTH_WEST, zone);
    }
    @Test
    public void testIfZoneWillBeReturned_1(){

        GeoPoliticalZone zone = GeoPoliticalZone.findZone("BoRno");
        assertEquals(NORTH_EAST, zone);
    }
    @Test
    public void testIfZoneWillBeReturned_2(){

        GeoPoliticalZone zone = GeoPoliticalZone.findZone("Kebbi");
        assertEquals(NORTH_WEST, zone);
    }
}
