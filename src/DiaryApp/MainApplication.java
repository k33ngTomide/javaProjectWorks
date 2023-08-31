package DiaryApp;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.*;

public class MainApplication {
    private Diary diary;
    private Diaries diaries = new Diaries();
    
    public static void main(String... args) {
        MainApplication mainApplication = new MainApplication();

        welcomeMessage();
        mainApplication.openAccount();

    }

    private static void welcomeMessage() {
        display("""
                *******************************************************************
                Hi, Welcome to Chronicle Diary.
                    Chronicle helps you document your day-to-day experiences,
                    social commentary, complaints, poems, prose, illicit thoughts
                    and any content.
                *******************************************************************
                 
                 Click Ok to continue...""");
    }

    private void openAccount(){
        String inputMessage = """
                Enter:
                1. Create Diary
                """;
        String username = inputCollector(inputMessage);
        if (username.equals("1")){
            newSignUp();
            anotherAccount();
        }
        else {display("Invalid Input"); openAccount();}
    }

    private void anotherAccount() {
        String username = inputCollector("Enter: \n1. Create another diary \n2. Log In");
        if (username.equals("1")){
            newSignUp();
        }
        else if (username.equals("2"))
            logInInput();
        else {display("Invalid Input"); anotherAccount();}
    }

    private void logInInput(){
        try{
            String username = inputCollector("Log in \nEnter Username: ");
            String password = inputCollector("Enter Password: ");

            validateInfo(username, password);
            display("Log In Successful");
            loggedIn();
        }
        catch (IllegalArgumentException e){
            display(e.getMessage());
            logInInput();
        }
    }

    private void validateInfo(String username, String password) {
        try{
            diaries.validatePassword(username,password);
        }
        catch (IllegalArgumentException e){
            display(e.getMessage());
            logInInput();
        }

    }

    private void newSignUp() {
        try {
            String fullName = inputCollector("Sign New Account. \nEnter your full name: ");
            String username = inputCollector("Enter a username: ");
            String password = inputCollector("Enter a password: ");
            String number = inputCollector("Enter your phone number: ");

            validateDetails(fullName, number, username, password);

            diary = new Diary(username, password);
            saving();
            diaries.add(username, password);
            display("Hello " + username + "\nWelcome To Chronicle Diary");
            anotherAccount();
        }
        catch (IllegalArgumentException e) {
            display(e.getMessage());
            newSignUp();
        }
    }

    private void validateDetails(String fullName, String number, String username, String password) {
        try {
            if (fullName.isEmpty() || !fullName.matches("^[^(?![\\s.'])[-a-zA-Z\\s.'\\p{L}]{1,40}]+$"))
                throw new IllegalArgumentException("Name cannot be empty or contain numbers.");
            if (!number.matches("\\d{11}"))
                throw new IllegalArgumentException("Enter number in the correct format(081********)");
            if (!username.matches("\\S"))
                throw new IllegalArgumentException("Username cannot contain space.");
        } catch (IllegalArgumentException e) {display(e.getMessage());}
    }

    private static void saving()  {
        display("Saving...  \nSaved Successfully");
    }

    private static String inputCollector(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    private void loggedIn(){
        String userEntry = inputCollector("""
                Enter:
                    1. Add Entry
                    2. Search Entry
                    3. Delete Entry
                    4. Update/ Edit Entry
                    5. Lock Diary
                    6. Log Out
                    7. Exit
                """);
        switch (userEntry) {
            case "1" -> addEntry();
            case "2" -> findEntry();
            case "3" -> deleteEntry();
            case "4" -> updateEntry();
            case "5" -> lockDiary();
            case "6" -> loggedOut();
            case "7" -> exitApp();
            default -> {
                display("Invalid Input, try again.");
                loggedIn();
            }
        }
        
    }

    private void exitApp() {
        display("Saving all inputs... \nSaved Successfully");
        exit(1);
    }

    private void loggedOut() {
        display("Logged out...");
        anotherAccount();
    }

    private void lockDiary(){
        diary.lockDiary();
        display("Diary is Locked");
        String input = inputCollector("""
                Enter:
                1. UnlockDiary
                2. Log Out
                """);
        if (input.equals("1")) unlockDiary();
        else if (input.equals("2")) loggedOut();
        else {
            display("Invalid Input, try again");
            lockDiary();
        }

    }

    private void unlockDiary(){
        try {
            String userPassword = inputCollector("Enter your password: ");
            diary.unlockDiary(userPassword);
            loggedIn();
        } catch (IllegalArgumentException e){
            display(e.getMessage());
            unlockDiary();
        }
    }

    private void updateEntry() {
        try{
            int entryId = Integer.parseInt(inputCollector("Enter the Entry Id: "));
            String newTitle = inputCollector("Enter the new title: ");
            String newBody = inputCollector("Enter the body: ");
            diary.update(entryId, newTitle, newBody);
            saving();
            loggedIn();
        } catch (IllegalArgumentException | InputMismatchException e){
            display(e.getMessage());

            updateEntry();
        }

    }

    private void deleteEntry() {
        try {
            int entryId = Integer.parseInt(inputCollector("Enter the Entry Id: "));
            diary.delete(entryId);
        } catch(IllegalArgumentException | InputMismatchException e){
            display(e.getMessage());
            deleteEntry();
        }
    }

    private void findEntry() {
        try{
            int entryId = Integer.parseInt(inputCollector("Enter the Entry Id: "));
            display(diary.findEntryById(entryId).getEntryDetails());
            loggedIn();
        } catch(IllegalArgumentException e) {
            display(e.getMessage());
            findEntry();
        }

    }

    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private void addEntry() {
        String title = inputCollector("Enter Title: ");
        String body = inputCollector("Enter the body: ");
        diary.createEntry(title, body);
        saving();
        loggedIn();
    }

}
