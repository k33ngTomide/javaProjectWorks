package Chapter4tdd;

import Dietel.ChapterFour.WorldPopulationGrowth;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldPopulationGrowthTest {

    WorldPopulationGrowth worldPopulation =
            new WorldPopulationGrowth(7_975_105_156L, 0.009);

    @Test
    public void testPopulationGrowth_Number(){
        double world = worldPopulation.getPopulation();
        assertEquals(7_975_105_156L, world);
    }

    @Test
    public void testPopulationGrowthRate(){
        double rate = worldPopulation.getRate();
        assertEquals(0.9/100, rate, 0.05);
    }

    @Test
    public void testNextYearPopulation(){
        double populationGrowth = worldPopulation.getGrowth(1);
        assertEquals( 7_975_105_156L + 71_775_946.404 , populationGrowth);

    }
}
