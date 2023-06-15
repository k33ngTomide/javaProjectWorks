package tdd;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MusicPlayerTest {
    @Test
    public void canBeTurnedOnTest() {
        MusicPlayer groove = new MusicPlayer();
        assertEquals(false, groove.getIsOn());

        groove.setIsOn(true);
        assertEquals(true, groove.getIsOn());
    }

    @Test
    public void canBeTurnedOffTest() {
        MusicPlayer groove = new MusicPlayer();
        groove.setIsOn(true);
        assertEquals(true, groove.getIsOn());

        groove.setIsOn(false);
        assertEquals(false, groove.getIsOn());
    }

    @Test
    public void canVolumeBeIncreasedTest() {
        MusicPlayer groove = new MusicPlayer();
        groove.setIsOn(true);
        assertEquals(true, groove.getIsOn());
        groove.setVolume(12);
        assertEquals(12, groove.getVolume());

        groove.increaseVolume();
        assertEquals(13, groove.getVolume());
    }

    @Test
    public void canVolumeBeDecreasedTest() {
        MusicPlayer groove = new MusicPlayer();
        groove.setIsOn(true);
        assertEquals(true, groove.getIsOn());
        groove.setVolume(20);
        assertEquals(20, groove.getVolume());

        groove.decreaseVolume();
        assertEquals(19, groove.getVolume());
    }

    @Test
    public void canVolumeBeIncreasedBeyondHundredTest() {
        MusicPlayer groove = new MusicPlayer();
        groove.setIsOn(true);
        assertEquals(true, groove.getIsOn());
        groove.setVolume(100);
        assertEquals(100, groove.getVolume());

        groove.increaseVolume();
        assertEquals(100, groove.getVolume());
    }

    @Test
    public void canVolumeBeDecreasedBeyondZeroTest() {
        MusicPlayer groove = new MusicPlayer();
        groove.setIsOn(true);
        assertEquals(true, groove.getIsOn());
        groove.setVolume(0);
        assertEquals(0, groove.getVolume());

        groove.decreaseVolume();
        assertEquals(0, groove.getVolume());
    }

    @Test
    public void canPlayerMoveToNextChannelTest() {
        MusicPlayer groove = new MusicPlayer();
        groove.setIsOn(true);
        assertEquals(true, groove.getIsOn());
        groove.setMusicNumber(45);
        assertEquals(45, groove.getMusicNumber());

        groove.nextMusic();
        assertEquals(46, groove.getMusicNumber());

    }

    @Test
    public void canPlayerMoveBackToPreviousChannelTest() {
        MusicPlayer groove = new MusicPlayer();
        groove.setIsOn(true);
        assertEquals(true, groove.getIsOn());
        groove.setMusicNumber(25);
        assertEquals(25, groove.getMusicNumber());

        groove.previousMusic();
        assertEquals(24, groove.getMusicNumber());
    }

    @Test
    public void canPlayerBePausedTest() {
        MusicPlayer groove = new MusicPlayer();
        groove.setIsOn(true);
        assertEquals(true, groove.getIsOn());

        groove.setIsPlaying(false);
        assertEquals(false, groove.getIsPlaying());
    }
    @Test
    public void canPlayerBePlayedAfterBeenPausedTest(){
        MusicPlayer groove = new MusicPlayer();
        groove.setIsOn(true);
        assertEquals(true, groove.getIsOn());
        groove.setIsPlaying(false);
        assertEquals(false, groove.getIsPlaying());

        groove.setIsPlaying(true);
        assertEquals(true, groove.getIsPlaying());
    }
    @Test
    public void canPlayerBeMutedTest(){
        MusicPlayer groove = new MusicPlayer();
        groove.setIsOn(true);
        assertEquals(true, groove.getIsOn());
        groove.setVolume(30);
        assertEquals(30, groove.getVolume());

        groove.mute();
        assertEquals(0, groove.getVolume());
    }
}
