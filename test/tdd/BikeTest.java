package tdd;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;

public class BikeTest {
    @Test
    public void canBikeBeTurnedOn(){
        Bike suzuki = new Bike();
        boolean status = suzuki.getTurnedOn();
        assertFalse(status);

        suzuki.setTurnedOn(true);
        boolean newStatus = suzuki.getTurnedOn();
        assertEquals(true, newStatus);
    }
    @Test
    public void CanBikeBeTurnedOff(){
        Bike suzuki = new Bike();
        boolean status = suzuki.getTurnedOn();
        assertFalse(status);
        suzuki.setTurnedOn(true);
        boolean newStatus = suzuki.getTurnedOn();
        assertEquals(true, newStatus);

        suzuki.setTurnedOn(false);
        boolean anotherStatus = suzuki.getTurnedOn();
        assertEquals(false, anotherStatus);

    }
    @Test
    public void canBikeAcceleratesOnGearOneTest(){
        Bike suzuki = new Bike();
        boolean status = suzuki.getTurnedOn();
        assertFalse(status);
        suzuki.setTurnedOn(true);
        boolean newStatus = suzuki.getTurnedOn();
        assertEquals(true, newStatus);

        suzuki.setAcceleration(5);
        suzuki.increaseAcceleration();
        int speed = suzuki.getAcceleration();
        assertEquals(6, speed);


    }
    @Test
    public void canBikeAccelerateOnGearTwoTest(){
        Bike suzuki = new Bike();
        boolean status = suzuki.getTurnedOn();
        assertFalse(status);
        suzuki.setTurnedOn(true);
        boolean newStatus = suzuki.getTurnedOn();
        assertEquals(true, newStatus);

        suzuki.setAcceleration(23);
        suzuki.increaseAcceleration();
        int speed = suzuki.getAcceleration();
        assertEquals(25, speed);
    }
    @Test
    public void canBikeAccelerateOnGearThreeTest(){
        Bike suzuki = new Bike();
        boolean status = suzuki.getTurnedOn();
        assertFalse(status);
        suzuki.setTurnedOn(true);
        boolean newStatus = suzuki.getTurnedOn();
        assertEquals(true, newStatus);

        suzuki.setAcceleration(33);
        suzuki.increaseAcceleration();
        int speed = suzuki.getAcceleration();
        assertEquals(36, speed);
    }
    @Test
    public void canBikeAccelerateOnGearFourTest(){
        Bike suzuki = new Bike();
        boolean status = suzuki.getTurnedOn();
        assertFalse(status);
        suzuki.setTurnedOn(true);
        boolean newStatus = suzuki.getTurnedOn();
        assertEquals(true, newStatus);

        suzuki.setAcceleration(56);
        suzuki.increaseAcceleration();
        int speed = suzuki.getAcceleration();
        assertEquals(60, speed);
    }
    @Test
    public void canBikeDecelerateOnGearOneTest(){
        Bike suzuki = new Bike();
        boolean status = suzuki.getTurnedOn();
        assertFalse(status);
        suzuki.setTurnedOn(true);
        boolean newStatus = suzuki.getTurnedOn();
        assertEquals(true, newStatus);

        suzuki.setAcceleration(17);
        suzuki.decreaseAcceleration();
        int speed = suzuki.getAcceleration();
        assertEquals(16, speed);

    }
    @Test
    public void canBikeDecelerateOnGearTwoTest() {
        Bike suzuki = new Bike();
        boolean status = suzuki.getTurnedOn();
        assertFalse(status);
        suzuki.setTurnedOn(true);
        boolean newStatus = suzuki.getTurnedOn();
        assertEquals(true, newStatus);

        suzuki.setAcceleration(20);
        suzuki.decreaseAcceleration();
        int speed = suzuki.getAcceleration();
        assertEquals(19, speed);
    }
    @Test
    public void canBikeDecelerateOnGearThreeTest() {
        Bike suzuki = new Bike();
        boolean status = suzuki.getTurnedOn();
        assertFalse(status);
        suzuki.setTurnedOn(true);
        boolean newStatus = suzuki.getTurnedOn();
        assertEquals(true, newStatus);


        suzuki.setAcceleration(34);
        suzuki.decreaseAcceleration();
        int speed = suzuki.getAcceleration();
        assertEquals(31, speed);
    }
    @Test
    public void canBikeDecelerateOnGearFourTest() {
        Bike suzuki = new Bike();
        boolean status = suzuki.getTurnedOn();
        assertFalse(status);
        suzuki.setTurnedOn(true);
        boolean newStatus = suzuki.getTurnedOn();
        assertEquals(true, newStatus);

        suzuki.setAcceleration(45);
        suzuki.decreaseAcceleration();
        int speed = suzuki.getAcceleration();
        assertEquals(41, speed);
    }
    @Test
    public void canBikeAccelerationBeNegativeTest() {
        Bike suzuki = new Bike();
        boolean status = suzuki.getTurnedOn();
        assertFalse(status);
        suzuki.setTurnedOn(true);
        boolean newStatus = suzuki.getTurnedOn();
        assertEquals(true, newStatus);

        suzuki.setAcceleration(-4);
        suzuki.decreaseAcceleration();
        int speed = suzuki.getAcceleration();
        assertEquals(0, speed);
    }
}
