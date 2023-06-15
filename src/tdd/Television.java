package tdd;

public class Television {

    private boolean isOn;
    private int volume;
    private int channel;

    public boolean getIsOn() {
        return isOn;
    }
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        if (volume > 100) return 100;
        if (volume < 0) return 0;
        return volume;
    }
    public void increaseVolume() {
        if(volume < 100) volume++ ;
    }
    public void decreaseVolume() {
        if (volume <= 0) return ;
        volume--;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        if(channel > 1000) return 1000;
        if(channel < 0) return 0;
        return channel;
    }

    public void increaseChannel() {
        if (channel < 1000) channel++;
    }

    public void decreaseChannel() {
        if (channel <= 0) return ;
        channel--;
    }

    public void mute() {
        volume = 0;
    }
}
