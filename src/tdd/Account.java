package tdd;

public class Account {

    private String PIN;
    private int balance;

    public Account(String pin) {
        this.PIN = "0000";
        if (pin.length() == 4 && (pin.matches("[0-9]+"))) {
            PIN = pin;
        }
    }

    public int getBalance(String pin) {
        if (!PIN.equals(pin)) return 0;
        return balance;
    }

    public void deposit(int amount) {
        if(amount >= 1) balance = balance + amount;
    }

    public void withdraw(int amount, String pin) {
        if (amount < 0 || amount > balance || (!PIN.equals(pin)) ) return ;
        if (PIN.equals(pin)) {
            balance = balance - amount;
        }

    }

}
