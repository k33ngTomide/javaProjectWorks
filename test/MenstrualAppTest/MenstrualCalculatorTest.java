package MenstrualAppTest;


import MenstrualApp.MenstrualCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstrualCalculatorTest {

    private MenstrualCalculator menstrualCalculator;
    @BeforeEach
    public void setUp(){
        menstrualCalculator =
                new MenstrualCalculator("2023-09-12", 28, 6);
    }
    @Test
    public void testThatUserCanGetOvulationPeriod(){
        String ovulationDate = menstrualCalculator.getOvulationDay();

        assertEquals("2023-09-29", ovulationDate);
    }

    @Test
    public void testThatUserCanGetFertilityPeriod(){
        String startOfFertilityDate = menstrualCalculator.getStartOfFertilityDate();
        assertEquals("2023-09-27", startOfFertilityDate);

        String endOfFertilityDate = menstrualCalculator.getEndOfFertilityDate();
        assertEquals("2023-10-01", endOfFertilityDate);
    }

    @Test
    public void testThatUserCanGetPredictedDatesOfNextPeriod(){
        String startDateOfNextPeriod = menstrualCalculator.getStartDateOfNextPeriod();
        assertEquals("2023-10-16", startDateOfNextPeriod);

        String endDateOfNextPeriod = menstrualCalculator.getEndDateOfNextPeriod();
        assertEquals("2023-10-22", endDateOfNextPeriod);

    }

    @Test
    public void testThatUserCanGetSafePeriod(){
        String startDateSafePeriod = menstrualCalculator.getStartOfSafePeriod();
        assertEquals("2023-09-19", startDateSafePeriod);

        String endDateSafePeriod = menstrualCalculator.getEndOfSafePeriod();
        assertEquals("2023-09-26", endDateSafePeriod);
    }
}
