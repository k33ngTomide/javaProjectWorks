package Chapter3Tdd;

import Dietel.ChapterThree.HeartRate;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class HeartRateTest {

    @Test
    public void heartRatesExistsTest(){
        HeartRate heartRate = new HeartRate("Akintomide", "Muiliyu", 15, "DECEMBER", 1990);
        assertNotNull(heartRate);
    }

    @Test
    public void heartRatesHasFirstNameTest(){
        HeartRate heartRate = new HeartRate("Akintomide", "Muiliyu", 15, "DECEMBER", 1990);
        heartRate.setFirstName("Akintomide");
        assertNotNull(heartRate.getFirstName());
    }

    @Test
    public void heartRatesHasLastNameTest(){
        HeartRate heartRate = new HeartRate("Akintomide", "Muiliyu", 15, "DECEMBER", 1990);
        heartRate.setLastName("Muiliyu");
        assertNotNull(heartRate.getLastName());
    }
    @Test
    public void heartRateHasDateOfBirthTest(){
        HeartRate heartRate = new HeartRate("Akintomide", "Muiliyu", 15, "DECEMBER", 1990);
        heartRate.setDateOfBirth(13, "December", 1990);
        LocalDate date = heartRate.getDateOfBirth();
        assertEquals(LocalDate.of(1990, Month.DECEMBER, 13), date);
    }
    @Test
    public void createdHeartRatesUsingAllAttributes(){
        HeartRate heartRate = new HeartRate("Akintomide", "Muiliyu", 15, "DECEMBER", 1990);
        assertNotNull(heartRate);
        assertNotNull(heartRate.getFirstName());
        assertEquals("Akintomide", heartRate.getFirstName());
    }
    @Test
    public void canCalculateAge(){
        HeartRate heartRate = new HeartRate("Akintomide", "Muiliyu", 15, "DECEMBER", 1990);
        heartRate.calculateAge();
        assertEquals(33, heartRate.calculateAge());
    }

    @Test
    public void canFirstNameBeChanged(){
        HeartRate heartRate = new HeartRate("Akintomide", "Muiliyu", 15, "DECEMBER", 1990);
        heartRate.setFirstName("Sodiq");
        assertEquals("Sodiq", heartRate.getFirstName());
    }

    @Test
    public void canMaximumHeartRateBeCalculated() {
        HeartRate heartRate = new HeartRate("Akintomide", "Muiliyu", 15, "DECEMBER", 1990);
        heartRate.calculateAge();
        assertEquals(33, heartRate.calculateAge());

        heartRate.maximumHeartRate();
        assertEquals(187, heartRate.maximumHeartRate());

    }

    @Test
    public void canTargetHeartRateBeCalculated(){
        HeartRate heartRate = new HeartRate("Akintomide", "Muiliyu", 15, "DECEMBER", 1990);
        heartRate.calculateAge();
        assertEquals(33, heartRate.calculateAge());

        heartRate.maximumHeartRate();
        assertEquals(187, heartRate.maximumHeartRate());

        heartRate.targetHeartRate();
        assertEquals("93.5 - 149.6", heartRate.targetHeartRate());
    }





}
