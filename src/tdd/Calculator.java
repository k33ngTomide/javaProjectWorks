package tdd;

public class Calculator {
    private boolean isOn;
    private double result;
    public void power() {isOn = !this.isOn; }
    public boolean isOn() { return isOn; }
    public void add(double numberOne, double numberTwo) {
        if (isOn) result = numberOne + numberTwo; }

    public double getResult() {
        if (!isOn) return 0;
        return result; }

    public void subtract(int numberOne, int numberTwo) {
        if (isOn) result = numberOne - numberTwo; }
    public void divide(double numberOne, double numberTwo) {
        if (isOn) result = numberOne / numberTwo; }
    public void multiply(double numberOne, double numberTwo) {
        if (isOn) result = numberOne * numberTwo; }
    public void remainder(int numberOne, int numberTwo) {
        if (isOn) result = numberOne % numberTwo; }
}
