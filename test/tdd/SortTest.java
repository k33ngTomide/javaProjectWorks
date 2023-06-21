package tdd;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SortTest {

    @Test
    public void canSortBeCreatedTest(){
        Sort newNumbers;
        newNumbers = new Sort();
        assertNotNull(newNumbers);
    }

    @Test
    public void canNumbersBeSortedTest(){
        Sort newNumbers = new Sort();

        newNumbers.sort(231, 532, 345);
        assertEquals("532, 345, 231", newNumbers.getSort());

    }

    @Test
    public void canNumbersBeSortedOneTest(){
        Sort newNumbers = new Sort();

        newNumbers.sort(145, 746, 232);
        assertEquals("746, 232, 145", newNumbers.getSort());

    }

    @Test
    public void canNumbersBeSortedTwoTest(){
        Sort newNumbers = new Sort();

        newNumbers.sort(645, 1657, 1905);
        assertEquals("1905, 1657, 645", newNumbers.getSort());

    }
}
