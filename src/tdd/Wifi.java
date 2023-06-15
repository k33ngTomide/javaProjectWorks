package tdd;

public class Wifi {
    private boolean isOn;

    public boolean power(){
        isOn = !this.isOn;
        return isOn;
    }
}
