package Chapter3Tdd;

import Dietel.ChapterThree.HealthProfile;
import org.testng.annotations.Test;

public class HealthProfileTest {

    @Test
    public void canHealthProfileBeCreated(){
        HealthProfile standard = new HealthProfile("Muiliyu", "Sodiq",
                "male", 30.56, 45.7, "1990-12-20");




    }
}
