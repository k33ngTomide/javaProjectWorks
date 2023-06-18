package tdd;

public class Wifi {
    private static boolean isOn;

    public static void power(){
        isOn = !isOn;
    }

    public static boolean getIsOn() {
        return isOn;
    }

}
