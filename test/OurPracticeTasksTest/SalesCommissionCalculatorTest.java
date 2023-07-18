package OurPracticeTasksTest;

import OurPracticeTasks.SalesCommissionCalculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SalesCommissionCalculatorTest {

    @Test
    public void testThatCommissionWillBeCalculated(){
        SalesCommissionCalculator calculator = new SalesCommissionCalculator();
        double answer = calculator.commissionCalculator(5000.00);
        assertEquals(650.0, answer);
    }
}
