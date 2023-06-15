package tdd;

import org.testng.annotations.Test;
import tdd.AirCondition;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AirConditionTest {
    @Test
    public void ifAirConditionCanBeOnTest() {
        AirCondition hisense = new AirCondition();
        boolean status = hisense.getIsOn();
        assertEquals(false, status);

        hisense.setIsOn(true);
        boolean newStatus = hisense.getIsOn();
        assertEquals(true, newStatus);
    }

    @Test
    public void ifAirConditionCanBeOffTest(){
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);

        hisense.setIsOn(false);

        boolean newStatus = hisense.getIsOn();
        assertEquals(false, newStatus);
    }

    @Test
    public void canTemperatureBeIncreasedTest(){
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);
        hisense.setTemperature(16);
        int acTemperature = hisense.getTemperature();
        assertEquals(16, acTemperature);

        hisense.increaseTemperature();
        int newAcTemperature = hisense.getTemperature();
        assertEquals(17, newAcTemperature);
    }

    @Test
    public void canTemperatureBeDecreasedTest() {
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);
        hisense.setTemperature(20);
        int acTemperature = hisense.getTemperature();
        assertEquals(20, acTemperature);

        hisense.decreaseTemperature();
        int newAcTemperature = hisense.getTemperature();
        assertEquals(19, newAcTemperature);
    }

    @Test
    public void canTemperatureGoBeyondThirtyTest() {
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);
        hisense.setTemperature(30);
        int acTemperature = hisense.getTemperature();
        assertEquals(30, acTemperature);

        hisense.increaseTemperature();
        int newAcTemperature = hisense.getTemperature();
        assertEquals(30, newAcTemperature);
    }

    @Test
    public void canTemperatureGoBelowSixteenTest() {
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);
        hisense.setTemperature(16);
        int acTemperature = hisense.getTemperature();
        assertEquals(16, hisense.getTemperature());

        hisense.decreaseTemperature();
        int newAcTemperature = hisense.getTemperature();
        assertEquals(16, newAcTemperature);

    }

    @Test
    public void canTemperatureBeSetToAboveFortyTest() {
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);
        hisense.setTemperature(40);
        int acTemperature = hisense.getTemperature();
        assertEquals(30, acTemperature);

        hisense.increaseTemperature();
        int newAcTemperature = hisense.getTemperature();
        assertEquals( 30, newAcTemperature);

    }

    @Test
    public void canTemperatureBeSetTemperatureBelow16Test() {
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);
        hisense.setTemperature(12);
        int acTemperature = hisense.getTemperature();
        assertEquals(16, acTemperature);

        hisense.decreaseTemperature();
        int newAcTemperature = hisense.getTemperature();
        assertEquals(16, newAcTemperature);

    }


}