package TaskTest;

import Tasks.Fibonacci;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FibonacciTest {

    @Test
    public void testForReturnOfTerms(){
        int[] answer = Fibonacci.fibonacci(4);
        int[] compare = {0, 1, 1, 2};
        assertArrayEquals(compare,answer);
    }

    @Test
    public void testForReturnOfTerms_1(){
        int[] answer = Fibonacci.fibonacci(5);
        int[] compare = {0, 1, 1, 2, 3};

        assertArrayEquals(compare,answer);
    }


//    @Test
//    public void testFibonacciWithZero() {
//        int[] expected = {0};
//        int[] result = Fibonacci.fibonacci(1);
//        assertArrayEquals(expected, result);
//    }

    @Test
    public void testFibonacciWithOne() {
        int[] expected = {0, 1};
        int[] result = Fibonacci.fibonacci(2);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFibonacciWithFive() {
        int[] expected = {0, 1, 1, 2, 3};
        int[] result = Fibonacci.fibonacci(5);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFibonacciWithTen() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] result = Fibonacci.fibonacci(10);
        assertArrayEquals(expected, result);
    }

//    @Test
//    public void testFibonacciWithNegative() {
//        int[] expected = {};
//        int[] result = Fibonacci.fibonacci(-5);
//        assertArrayEquals(expected, result);
//    }

}
