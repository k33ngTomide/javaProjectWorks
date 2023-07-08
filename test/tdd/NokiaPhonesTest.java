package tdd;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NokiaPhonesTest {

    @Test
    public void testNokiaPhone(){
        NokiaPhones android = new NokiaPhones();
        String output = android.tone();
        assertNotNull(output);

    }

    @Test
    public void testNokiaPhoneTone(){
        NokiaPhones android = new NokiaPhones();
        String output = android.tone();

        assertEquals("""
                Tone
                1. Ringing
                2. Running the wheel
                3. All ringing tone
                4. Ringing tones settings
                5. Do Not Disturb
                6. All of the above
                0. Back""", output);

    }

}
