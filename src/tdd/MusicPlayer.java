package tdd;
public class MusicPlayer {
    private boolean isOn;
    private int volume;
    private int musicNumber;
    private boolean isPlaying;

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void increaseVolume() {
        if(volume < 100) volume++;
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {if(volume > 0) volume --; }

    public void setMusicNumber(int musicNumber) { this.musicNumber = musicNumber; }

    public int getMusicNumber() { return musicNumber; }

    public void nextMusic() { musicNumber++; }

    public void previousMusic() { musicNumber--; }

    public boolean getIsPlaying() {
        return isPlaying;
    }
    public void setIsPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public void mute() { volume = 0; }

}
