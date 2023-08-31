package BankApp;

public class Account {
    private double balance;
    private String accountNumber;
    private String accountName;
    private String pin;
    public Account(String accountNumber, String accountName, String pin){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        validateCreatedPin(pin);
        this.pin = pin;
    }

    private void validateCreatedPin(String pin) {
        if(!pin.matches("[0-9]{4}")) throw new IllegalArgumentException("Account MUST be 4 digits Number");
    }

    public void deposit(double amount){
        validateNegativeAmount(amount);
        balance += amount;
    }

    public double checkBalance(String pin) {
        validatePinInputted(pin);
        return balance;
    }

    private void validatePinInputted(String pin) {
        if(!this.pin.equals(pin)) throw new IllegalArgumentException ("Incorrect Pin");
    }

    public String getAccountName() {
        return accountName;
    }

    public void withdraw(double amount, String pin) {
        validatePinInputted(pin);
        validateNegativeAmount(amount);
        validateBalanceIsGreaterThanAmount(amount);
        balance -= amount;
    }

    private void validateBalanceIsGreaterThanAmount(double amount) {
        if(amount > balance) throw new IllegalArgumentException("Insufficient Funds");
    }

    private void validateNegativeAmount(double amount) {
        if(amount < 0) throw new IllegalArgumentException("Amount cannot be Negative");
    }

    public String getAccount() {
        return getAccountName();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void updatePin(String currentPin, String newPin) {
        validatePinInputted(currentPin);
        this.pin = newPin;
    }
}
