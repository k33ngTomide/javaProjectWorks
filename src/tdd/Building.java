package tdd;

public class Building {
    private boolean hasWifi;

    public void setHasWifi(boolean hasWifi){

        this.hasWifi = hasWifi;
    }
    public boolean hasWifi() {
        return hasWifi;
    }

    public boolean getIsOn() {
        return Wifi.getIsOn();
    }
}
