package Chapter3Tdd;

import ChapterThree.Car;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    @Test
    public void canCarBeCreated(){
        Car bentley = new Car("Bentley Kangaroo", "2022", 413_000.00);
        assertNotNull(bentley);
    }

    @Test
    public void canSecondCarBeCreated(){
        Car astonMartin = new Car("AstonMartin Frog", "2020", 423_000.00);
        assertNotNull(astonMartin);
    }

    @Test
    public void canCarModelBeSet(){
        Car bentley = new Car("Bentley Kangaroo", "2020", 464_000.00);
        bentley.setModel("Bentley Monkey");
        assertEquals("Bentley Monkey",bentley.getModel());
    }

    @Test
    public void canSecondCarModelBeSet(){
        Car astonMartin = new Car("AstonMartin Frog", "2019", 431_000.00);
        astonMartin.setModel("AstonMartin Spider");
        assertEquals("AstonMartin Spider",astonMartin.getModel());
    }

    @Test
    public void canCarYearBeSetTest(){
        Car bentley = new Car("Bentley Kangaroo", "2018", 480_000.00);
        bentley.setYear("2019");
        assertEquals("2019", bentley.getYear());
    }

    @Test
    public void canSecondCarYearBeSetTest() {
        Car astonMartin = new Car("AstonMartin Frog", "2012", 347_000.00);
        astonMartin.setYear("2002");
        assertEquals("2002", astonMartin.getYear());
    }

    @Test
    public void canCarPriceBeSetTest(){
        Car bentley = new Car("Bentley Kangaroo", "2014", 450_600.00);
        bentley.setPrice(75_000.90);
        assertEquals(75_000.90, bentley.getPrice());
    }

    @Test
    public void canSecondCarPriceBeSetTest(){
        Car astonMartin = new Car("AstonMartin Frog", "2017", 555_000.00);
        astonMartin.setPrice(350_000.59);
        assertEquals(350_000.59, astonMartin.getPrice());
    }

    @Test
    public void canCarPriceBeSetToNegativeTest(){
        Car bentley = new Car("Bentley Kangaroo", "2016", -485_000.00);
        bentley.setPrice(-90_000.90);
        assertEquals(0, bentley.getPrice());
    }

    @Test
    public void canSecondCarPriceBeSetToNegativeTest(){
        Car astonMartin = new Car("AstonMartin Frog", "2023", -355_000.00);
        astonMartin.setPrice(-150_000.59);
        assertEquals(0, astonMartin.getPrice());
    }

    @Test
    public void discountedPriceOfCarTest(){
        Car bentley = new Car("Bentley Kangaroo", "2023", 405_000.00);
        bentley.setPrice(500_000.00);
        assertEquals(500_000.00, bentley.getPrice());
        bentley.discount(5);
        assertEquals(475_000.00, bentley.getPrice());
    }

    @Test
    public void discountedPriceOfSecondCarTest(){
        Car astonMartin = new Car("AstonMartin Frog", "2018", 450_000.00);
        astonMartin.setPrice(300_000.00);
        assertEquals(300_000.00, astonMartin.getPrice());
        astonMartin.discount(7);
        assertEquals(279_000.00, astonMartin.getPrice());
    }

    @Test
    public void carConstructorTest() {
        Car bentley = new Car("Bentley Kangaroo", "2013", 455_000.00);

        assertEquals("Bentley Kangaroo", bentley.getModel());
        assertEquals("2013", bentley.getYear());
        assertEquals(455_000.00, bentley.getPrice());
    }

    @Test
    public void secondCarConstructorTest() {
        Car astonMartin = new Car("AstonMartin Frog", "2010", 450_000.00);

        assertEquals("AstonMartin Frog", astonMartin.getModel());
        assertEquals("2010", astonMartin.getYear());
        assertEquals(450_000.00, astonMartin.getPrice());
    }


}
