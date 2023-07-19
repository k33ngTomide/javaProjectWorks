package ClassWorkTest;

import ClassWork.SevenSegmentDisplay;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SevenSegmentDisplayTest {

    @Test
    public void testForAllLightsOn(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("11111111");
        String expectedDisplay = """
                # # # #
                #     #
                # # # #
                #     #
                # # # #""";
        assertEquals(expectedDisplay, displayLight);

    }

    @Test
    public void testThatSwitchesShouldBeEight(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("11111111122367");
        assertEquals(" ", displayLight);
    }

    @Test
    public void testForAllLightsOff(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("11111110");

        assertEquals("", displayLight);
    }

    @Test
    public void testThatSwitchLightCanDisplayOne(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("00001101");
        String expectedDisplay = """
                      #      
                      #      
                      #      
                      #      
                      #""";
        assertEquals(expectedDisplay, displayLight);
    }

    @Test
    public void testThatSwitchLightCanDisplayTwo(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("11011011");
        String expectedDisplay = """
                # # # #
                      #
                # # # #
                # 
                # # # #""";
        assertEquals(expectedDisplay, displayLight);
    }

    @Test
    public void testThatSwitchLightCanDisplayThree(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("11110011");
        String expectedDisplay = """
                # # # #
                      #
                # # # #
                      #
                # # # #""";
        assertEquals(expectedDisplay, displayLight);
    }

    @Test
    public void testThatSwitchLightCanDisplayFour(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("01100111");
        String expectedDisplay = """
                #     #
                #     #
                # # # #
                      #
                      #""";
        assertEquals(expectedDisplay, displayLight);
    }

    @Test
    public void testThatSwitchLightCanDisplayFive(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("10110111");
        String expectedDisplay = """
                # # # #
                #      
                # # # #
                      #
                # # # #""";
        assertEquals(expectedDisplay, displayLight);
    }

    @Test
    public void testThatSwitchLightCanDisplaySix(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("10111111");
        String expectedDisplay = """
                # # # #
                #      
                # # # #
                #     #
                # # # #""";
        assertEquals(expectedDisplay, displayLight);
    }

    @Test
    public void testThatSwitchLightCanDisplaySeven(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("11100001");
        String expectedDisplay = """
                # # # #
                      #
                      #
                      #
                      #""";
        assertEquals(expectedDisplay, displayLight);
    }

    @Test
    public void testThatSwitchLightCanDisplayEight(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("11111111");
        String expectedDisplay = """
                # # # #
                #     #
                # # # #
                #     #
                # # # #""";
        assertEquals(expectedDisplay, displayLight);
    }

    @Test
    public void testThatSwitchLightCanDisplayNine(){
        SevenSegmentDisplay lightSwitch = new SevenSegmentDisplay();
        String displayLight = lightSwitch.switchLight("11110111");
        String expectedDisplay = """
                # # # #
                #     #
                # # # #
                      #
                # # # #""";
        assertEquals(expectedDisplay, displayLight);
    }


}
