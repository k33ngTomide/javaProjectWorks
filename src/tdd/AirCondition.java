package tdd;

public class AirCondition {

    private boolean isOn;
    private int temperature;

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        if (temperature > 30) return 30;
        if (temperature < 16) return 16;
        return temperature;
    }

    public void increaseTemperature() {
        if (temperature < 30 ) {
            temperature = temperature + 1;
        }
    }
    public void decreaseTemperature () {
        if (temperature > 16) {
            temperature--;
        }
    }

}