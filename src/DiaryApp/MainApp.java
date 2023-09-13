package DiaryApp;

import javax.swing.*;

import java.util.InputMismatchException;

import static java.lang.System.exit;

public class MainApp {

    private Diaries diaries = new Diaries();
    private String username;

    public static void main(String... args) {
        MainApp app = new MainApp();
        welcomeMessage();

        app.openAccount();
    }

    private static void welcomeMessage() {
        String stars = "*".repeat(70);
        display(stars + """
                \n
                Hi, Welcome to Chronicle Diary.
                    Chronicle helps you document your day-to-day experiences,
                    social commentary, complaints, poems, prose, illicit thoughts
                    and any content.
                    
                Click Ok to continue...\n""" + stars);
    }

    private void openAccount(){
        String inputMessage = """
                Enter:
                
                1. Create Diary
                
                2. Login
                
                3. Exit
                
                """;
        String userInput = inputCollector(inputMessage);
        switch (userInput) {
            case "1" -> {
                newSignUp();
                anotherAccount();
            }
            case "2" -> logInInput();
            case "3" -> exitApp();
            default -> {
                display("Invalid Input");
                openAccount();
            }
        }
    }
    private void logInInput(){
        try{
            String username = inputCollector("Log in \nEnter Username: ");
            String password = inputCollector("Enter Password: ");

            diaries.validatePassword(username,password);
            this.username = username;

            display("Log In Successful");
            loggedIn();
        }
        catch (IllegalArgumentException e){
            display(e.getMessage());
            logInInput();
        }
    }
    private void anotherAccount() {
        String username = inputCollector("Enter: \n1. Create another diary \n2. Log In \n3. Exit");
        switch (username) {
            case "1" -> newSignUp();
            case "2" -> logInInput();
            case "3" -> exitApp();
            default -> {
                display("Invalid Input");
                anotherAccount();
            }
        }
    }

    private void newSignUp() {
        try {
            String username = inputCollector("Sign New Account. \nEnter a username: ");
            String password = inputCollector("Enter a password: ");

            diaries.add(username, password);
            display("Account Created Successfully, Proceed to login");
            anotherAccount();
            display("Hello " + username + "\nWelcome To Chronicle Diary");

        }
        catch (IllegalArgumentException e) {
            display(e.getMessage());
            newSignUp();
        }
    }
    private void loggedIn() {

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

    private void addEntry() {
        try {
            String title = inputCollector("Enter Title: ");
            String body = inputCollector("Enter the body: ");
            diaries.findByUsername(username).createEntry(title, body);
            saving();
            loggedIn();
        } catch (IllegalArgumentException e){
            display(e.getMessage());
            addEntry();
        }
    }

    private void findEntry() {
        try{
            int entryId = Integer.parseInt(inputCollector("Enter the Entry Id: "));
            display(diaries.findByUsername(username).findEntryById(entryId).getEntryDetails());
            loggedIn();
        } catch(IllegalArgumentException e) {
            display(e.getMessage());
            findEntry();
        }

    }

    private void deleteEntry() {
        try {
            int entryId = Integer.parseInt(inputCollector("Enter the Entry Id: "));
            diaries.findByUsername(username).delete(entryId);
            display("Entry Deleted Successfully");
            loggedIn();
        } catch(IllegalArgumentException | InputMismatchException e){
            display(e.getMessage());
            deleteEntry();
        }
    }

    private void updateEntry() {
        try{
            int entryId = Integer.parseInt(inputCollector("Enter the Entry Id: "));
            String newTitle = inputCollector("Enter the new title: ");
            String newBody = inputCollector("Enter the body: ");
            diaries.findByUsername(username).update(entryId, newTitle, newBody);
            saving();
            loggedIn();
        } catch (IllegalArgumentException | InputMismatchException e){
            display(e.getMessage());

            updateEntry();
        }

    }

    private void lockDiary(){
        diaries.findByUsername(username).lockDiary();
        display("Diary is Locked");
        String input = inputCollector("""
                Enter:
                1. UnlockDiary
                
                2. Log Out
                
                3. Exit
                """);
        switch (input) {
            case "1" -> unlockDiary();
            case "2" -> loggedOut();
            case "3" -> exitApp();
            default -> {
                display("Invalid Input, try again");
                lockDiary();
            }
        }

    }

    private void unlockDiary(){
        try {
            String userPassword = inputCollector("Enter your password: ");
            diaries.findByUsername(username).unlockDiary(userPassword);
            display("Diary Unlocked");
            loggedIn();
        } catch (IllegalArgumentException e){
            display(e.getMessage());
            unlockDiary();
        }
    }
    private void loggedOut() {
        display("Logged out...");
        anotherAccount();
    }

    private void exitApp() {
        display("Saving all inputs... \nSaved Successfully");
        exit(1);
    }
    private static String inputCollector(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    private static void saving()  {
        display("Saving...  \nSaved Successfully");
    }

}
