package tdd;

public class Clock {

    private int minutes;
    private int seconds;
    private int year;

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void convertMinutes(int minutes) {
        if (minutes > 0) {
            seconds = minutes * 60;
            year = minutes / 525600;
        }
    }
    public void convertSeconds(int seconds) {
        if (seconds > 0){
            minutes = seconds / 60;
        }
    }
    public int getYear() {
        return year;
    }
}
