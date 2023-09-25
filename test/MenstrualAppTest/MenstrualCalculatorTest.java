package MenstrualAppTest;


import MenstrualApp.MenstrualCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstrualCalculatorTest {

    private MenstrualCalculator menstrualCalculator;
    @BeforeEach
    public void setUp(){
        menstrualCalculator = new MenstrualCalculator();
    }
    @Test
    public void testThatUserCanGetOvulationPeriod(){
        String ovulationDate = menstrualCalculator.getOvulationDay(
                "2023-09-12", 28, 6);

        assertEquals("2023-09-29", ovulationDate);
    }

    @Test
    public void testThatUserCanGetFertilityPeriod(){
        String startOfFertilityDate = menstrualCalculator.getStartOfFertilityDate("2023-09-29");
        assertEquals("2023-09-27", startOfFertilityDate);

        String endOfFertilityDate = menstrualCalculator.getEndOfFertilityDate("2023-09-29");
        assertEquals("2023-10-01", endOfFertilityDate);
    }

    @Test
    public void testThatUserCanGetPredictedDatesOfNextPeriod(){
        String startDateOfNextPeriod = menstrualCalculator.getStartDateOfNextPeriod(
                "2023-09-12", 28, 6);
        assertEquals("2023-10-16", startDateOfNextPeriod);

        String endDateOfNextPeriod = menstrualCalculator.getEndDateOfNextPeriod(startDateOfNextPeriod, 6);
        assertEquals("2023-10-22", endDateOfNextPeriod);

    }

    @Test
    public void testThatUserCanGetSafePeriod(){
        String startDateSafePeriod = menstrualCalculator.getStartOfSafePeriod(
                "2023-09-12", 6);
        assertEquals("2023-09-19", startDateSafePeriod);

        String endDateSafePeriod = menstrualCalculator.getEndOfSafePeriod(
                "2023-09-12", 28, 6);
        assertEquals("2023-09-26", endDateSafePeriod);
    }
}
