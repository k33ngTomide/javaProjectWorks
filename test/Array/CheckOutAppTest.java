package Array;

import Assignments.Array.CheckOutApp;
import org.testng.annotations.Test;

public class CheckOutAppTest {
    @Test
    public void testForUserName(){
        CheckOutApp checkOutApp = new CheckOutApp();
        checkOutApp.StartInfoInput();
        checkOutApp.billPage();
        checkOutApp.receipt();
    }
}
