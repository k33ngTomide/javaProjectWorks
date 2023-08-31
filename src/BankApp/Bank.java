package BankApp;


import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();
    public Bank(String bankName){
    }

    public Account register(String firstName, String lastName, String pin) {
        String fullName = firstName + " " + lastName;
        Account account = new Account
                (generateAccountNumber(), fullName, pin );
        accounts.add(account);
        return account;
    }


    private String generateAccountNumber() {
        return (accounts.size() + 1) + "";
    }

    public Account findAccount(String accountNumber) {
        for(Account account : accounts)
            if(account.getAccountNumber().equals(accountNumber)) return account;

        throw new NullPointerException("Account not found");

    }

    public void deposit(double amount, String accountNumber) {
        Account foundAccount = findAccount(accountNumber);
        foundAccount.deposit(amount);
    }

    public double checkBalance(String accountNumber, String pin) {
        Account foundAccount = findAccount(accountNumber);
        return foundAccount.checkBalance(pin);
    }

    public void withdrawal(double amount, String accountNumber, String pin) {
        Account foundAccount = findAccount(accountNumber);
        foundAccount.withdraw(amount, pin);
    }

    public void transfer(double amount, String senderAccountNumber,
                         String receiverAccountNumber, String pin) {
        Account fromAccount = findAccount(senderAccountNumber);
        fromAccount.withdraw(amount, pin);

        Account toAccount = findAccount(receiverAccountNumber);
        toAccount.deposit(amount);
    }

    public void updatePin(String accountNumber, String currentPin, String newPin){
        Account account = findAccount(accountNumber);
        account.updatePin(currentPin, newPin);
    }

    public String alert(String accountNumber, String pin){
        String design = "=".repeat(40);
        Account account = findAccount(accountNumber);
        return  design + "\nAccount Number: " + account.getAccountNumber()
                + "\nAccount Name: " + account.getAccountName()
                + "\nAccount Balance: " + account.checkBalance(pin)
                + "\n" + design;
    }
}
