package BankApp;

import javax.swing.*;
import java.security.Key;
import java.util.InputMismatchException;

public class MainBankApp {

    private static Bank bank = new Bank("Afunimawobe Bank");

    public static void main(String[] args) {
        welcome();
        registerIn();
    }

    private static void registerIn() {
        String userInput = displayInput("""
                Enter:
                1. Register an Account
                2. Transact
                3. Report an Issue
                4. Help and Support
                5. Exit.

                Enter:
                 """);
        switch (userInput) {
            case "1" -> registerAnAccount();
            case "2" -> transact();
            case "3" -> reportIssue();
            case "4" -> help();
            case "5" -> exitApplication();
            default -> {
                display("Wrong Input");
                registerIn();
            }
        }

    }

    private static void help() {
        String helpNeeded = displayInput("""
                Hi, How can we help you?""");

        int referenceNumber = (int) (Math.random() * 9999);
        display("-".repeat(70) +
                "THANK YOU FOR CHOOSING AFUNIMAWOBE BANK" +
                "A customer care representative \n will reach out to you shortly" +
                "\n             Your reference Id: AFB012" + referenceNumber + "" +
                "\nkindly keep your reference Number." +
                "-".repeat(70) +
                "\nThank you...");
    }

    private static void reportIssue() {
        int referenceNumber = (int) (Math.random() * 100);
        String issue  = displayInput("Enter your complain");
        display("THANK YOU FOR CHOOSING AFUNIMAWOBE BANK" +
                "Your complains are received and will be checked\n" +
                "Kindly call back if your issues are not fixed within 3 Working Days" +
                "\n             Your reference Id: AFB012" + referenceNumber + "" +
                "\nKeep this id saved, as this will be used to track your issues." +
                "\nThank you...");
        anotherTransaction();
    }

    private static void transact() {
        String user_input = displayInput("""
                            Welcome
                            Enter:
                            1. Deposit
                            2. Withdraw
                            3. Balance Enquiry
                            4. Transfer
                            5. Change Pin
                            6. Cancel
                            
                            Enter:
                            """);
        switch (user_input){
            case "1" -> deposit();
            case "2" -> withdraw();
            case "3" -> balanceEnquiry();
            case "4" -> transfer();
            case "5" -> changePin();
            case "6" -> cancel();
            default -> {
                display("Invalid Input");
                transact();
            }
        }
    }

    private static void deposit() {
        try {
            double amount = Double.parseDouble(displayInput("Enter your amount: "));
            String accountNumber = displayInput("Enter account number: ");
            bank.deposit(amount, accountNumber);
            display("Transaction Successful...");
            anotherTransaction();
        }
        catch( IllegalArgumentException | InputMismatchException  | NullPointerException all_error){
            display(all_error.getMessage());
            deposit();
        }
    }

    private static void withdraw() {
        try {
            double amount = Double.parseDouble(displayInput("Enter amount: "));
            String accountNumber = displayInput("Enter account number: ");
            String userPin = displayInput("Enter your pin");
            bank.withdrawal(amount, accountNumber, userPin);
            display("Withdrawal completed...");
            display(bank.alert(accountNumber, userPin));

            anotherTransaction();
        }
        catch( IllegalArgumentException | InputMismatchException | NullPointerException allError){
            display(allError.getMessage());
            withdraw();
        }

    }

    private static void balanceEnquiry() {

        try{
            String accountNumber = displayInput("Balance Check\n Enter account number: ");
            String userPin = displayInput("Enter your pin");
            display(bank.alert(accountNumber, userPin));

            anotherTransaction();
        }
        catch (IllegalArgumentException | NullPointerException allError){
            display(allError.getMessage());
            balanceEnquiry();
        }
    }

    private static void transfer() {

        try {
            double amount = Double.parseDouble(displayInput("Transfer\n Enter your amount: "));
            String senderAccountNumber = displayInput("Enter your account number: ");
            String receiverAccount = displayInput("Enter receiver's account number: ");
            String pin = displayInput("Enter pin: ");
            bank.transfer(amount, senderAccountNumber, receiverAccount, pin);
            display("Transaction Successful...");
            display(bank.alert(senderAccountNumber, pin));
            anotherTransaction();
        }
        catch (IllegalArgumentException | InputMismatchException | NullPointerException allError){
            display(allError.getMessage());
            anotherTransaction();
        }

    }

    private static void changePin() {
        try {

            String accountNumber = displayInput("Change Pin\n  Enter your account number: ");
            String currentPin = displayInput("Enter current pin: ");
            String newPin = displayInput("Enter new pin: ");
            String confirmedPin = displayInput("Enter new pin again: ");

            if (!newPin.equals(confirmedPin))
                throw new InputMismatchException("New pin do not match, Try again");
            bank.updatePin(accountNumber, currentPin, newPin);
            display("Pin changed Successfully");
            anotherTransaction();
        }
        catch (IllegalArgumentException | NullPointerException error){
            display(error.getMessage());
            changePin();
        }
    }

    private static void cancel() {
        display("Transaction cancelled");
        anotherTransaction();
    }

    private static void anotherTransaction() {
         String user_input = displayInput("""
                    1. Another Transaction
                    2. Main Menu
                    3. Exit
                        
                    Enter:
                    """);
        switch (user_input){
            case "1" -> transact();
            case "2" -> registerIn();
            case "3" -> exitApplication();
            default -> {
                display("Invalid Input");
                anotherTransaction();
        }
        }
    }

    private static void exitApplication() {
        display("Thank you for using Afunimawobe Bank");
        System.exit(1);
    }

    private static void registerAnAccount() {
        try {
            String userFName = displayInput("Enter your first name: ");
            validateUserName(userFName);
            String userLName = displayInput("Enter your last name: ");
            validateUserName(userLName);
            String userPin = displayInput("Enter pin: ");
            validatePin(userPin);
            Account account = bank.register(userFName, userLName, userPin);
            display(bank.alert(account.getAccountNumber(), userPin));
            registerIn();
        }
        catch(InputMismatchException e){
            display(e.getMessage());
            registerAnAccount();
        }

    }

    private static void validatePin(String pin) {
        if (!pin.matches("\\d{4}"))
            throw new InputMismatchException("Invalid Pin");
    }

    private static void validateUserName(String word) {
        if(!word.matches("^[A-Z]*[a-z]*$"))
            throw new InputMismatchException("Invalid Input");
    }
    private static void welcome() {
        display("Welcome to Afunimawobe Bank");
    }

    private static void display(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    private static String displayInput(String prompt){
        return JOptionPane.showInputDialog(null, prompt);
    }
}
