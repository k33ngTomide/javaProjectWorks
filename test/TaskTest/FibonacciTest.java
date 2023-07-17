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

}
