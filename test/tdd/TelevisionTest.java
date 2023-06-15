package tdd;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TelevisionTest {

    @Test
    public void canTelevisionBeTurnedOnTest() {
        Television panasonic = new Television();
        assertEquals(false, panasonic.getIsOn());

        panasonic.setOn(true);
        assertEquals(true, panasonic.getIsOn());

    }

    @Test
    public void canTelevisionBeTurnedOffTest(){
        Television panasonic = new Television();
        panasonic.setOn(true);
        assertEquals(true, panasonic.getIsOn());

        panasonic.setOn(false);
        assertEquals(false, panasonic.getIsOn());
    }

    @Test
    public void canTemperatureBeIncreasedTest(){
        Television panasonic = new Television();
        panasonic.setOn(true);
        assertEquals(true, panasonic.getIsOn());

        panasonic.setVolume(10);
        assertEquals(10, panasonic.getVolume());

        panasonic.increaseVolume();
        assertEquals(11, panasonic.getVolume());
    }
    @Test
    public void canTemperatureBeDecreasedTest(){
        Television panasonic = new Television();
        panasonic.setOn(true);
        assertEquals(true, panasonic.getIsOn());

        panasonic.setVolume(15);
        assertEquals(15, panasonic.getVolume());

        panasonic.decreaseVolume();
        assertEquals(14, panasonic.getVolume());
    }

    @Test
    public void canChannelBeIncreasedTest(){
        Television panasonic = new Television();
        panasonic.setOn(true);
        assertEquals(true, panasonic.getIsOn());

        panasonic.setChannel(15);
        assertEquals(15, panasonic.getChannel());

        panasonic.increaseChannel();
        assertEquals(16, panasonic.getChannel());
    }

    @Test
    public void canChannelBeDecreasedTest(){
        Television panasonic = new Television();
        panasonic.setOn(true);
        assertEquals(true, panasonic.getIsOn());

        panasonic.setChannel(10);
        assertEquals(10, panasonic.getChannel());

        panasonic.decreaseChannel();
        assertEquals(9, panasonic.getChannel());
    }

    @Test
    public void canTelevisionChannelBeNegativeTest(){
        Television panasonic = new Television();
        panasonic.setOn(true);
        assertEquals(true, panasonic.getIsOn());

        panasonic.setChannel(0);
        assertEquals(0, panasonic.getChannel());

        panasonic.decreaseChannel();
        assertEquals(0, panasonic.getChannel());
    }
    @Test
    public void canTelevisionVolumeIncreaseMoreThanHundredTest(){
        Television panasonic = new Television();
        panasonic.setOn(true);
        assertEquals(true, panasonic.getIsOn());

        panasonic.setVolume(100);
        assertEquals(100, panasonic.getVolume());

        panasonic.increaseVolume();
        assertEquals(100, panasonic.getVolume());
    }
    @Test
    public void canTelevisionChannelBeMoreThanOneThousandTest(){
        Television panasonic = new Television();
        panasonic.setOn(true);
        assertEquals(true, panasonic.getIsOn());

        panasonic.setChannel(1000);
        assertEquals(1000, panasonic.getChannel());

        panasonic.increaseChannel();
        assertEquals(1000, panasonic.getChannel());
    }

    @Test
    public void canTelevisionVolumeDecreaseVolumeLessThanZeroTest(){
        Television panasonic = new Television();
        panasonic.setOn(true);
        assertEquals(true, panasonic.getIsOn());

        panasonic.setVolume(-1);
        assertEquals(0, panasonic.getVolume());

        panasonic.decreaseVolume();
        assertEquals(0, panasonic.getVolume());
    }
    @Test
    public void canTelevisionBeMutedTest(){
        Television panasonic = new Television();
        panasonic.setOn(true);
        assertEquals(true, panasonic.getIsOn());

        panasonic.setChannel(25);
        assertEquals(25, panasonic.getChannel());

        panasonic.mute();
        assertEquals(0, panasonic.getVolume());

    }


}
