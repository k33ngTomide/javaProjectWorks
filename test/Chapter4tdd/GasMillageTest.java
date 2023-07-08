package Chapter4tdd;


import ChapterFour.GasMillage;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GasMillageTest {

    @Test
    public void testMilesPerGallons(){
        double milePerGallon = GasMillage.calculateMilePerGallon(345, 65);

        assertEquals(5.2, milePerGallon, 0.5);
    }

    @Test
    public void testTotalMilesPerTotalGallons(){
        double milePerGallon = GasMillage.calculateOverall(2500, 82);

        assertEquals(30.49, milePerGallon, 0.5);
    }




}
