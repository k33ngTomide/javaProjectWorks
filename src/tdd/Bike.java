package tdd;
public class Bike {
    private boolean turnedOn;
    private int accelerate;
    public boolean getTurnedOn() {
        return turnedOn;
    }
    public void setTurnedOn(boolean turnedOn) { this.turnedOn = turnedOn; }
    public void increaseAcceleration() {
        int gear = 0;
        if (accelerate < 0) { }
        if (accelerate <= 20) {gear = 1; accelerate++; }
        if (accelerate >= 21 && accelerate <= 30) {gear = 2; accelerate += 2;}
        if (accelerate >= 31 && accelerate <= 40) {gear = 3; accelerate += 3;}
        if (accelerate > 40) {gear = 4; accelerate += 4;}
    }
    public void setAcceleration(int accelerate) {
        if (accelerate > 0) { this.accelerate = accelerate; }
        if (accelerate < 0) { accelerate = 0; }
    }
    public int getAcceleration() {
        if (accelerate < 0) return  0;
        return accelerate; }
    public void decreaseAcceleration() {
        int gear = 0;
        if (accelerate < 0) return ;
        if (accelerate <= 20) {gear = 1; accelerate--;}
        if (accelerate >= 21 && accelerate <= 30) {gear = 2; accelerate -= 2;}
        if (accelerate >= 31 && accelerate <= 40) {gear = 3; accelerate -= 3;}
        if (accelerate > 40) {gear = 4; accelerate -= 4;}
    }

}
