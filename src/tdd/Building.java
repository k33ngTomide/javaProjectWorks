package tdd;

public class Building {
    private boolean hasWifi;
    //private boolean isOn;
    private Wifi wifi;

    //wifi.power();
    public void setHasWifi(boolean hasWifi){

        this.hasWifi = hasWifi;
    }
    public boolean hasWifi() {
        return hasWifi;
    }
    public Wifi getWifi() {
        return wifi;
    }
}
