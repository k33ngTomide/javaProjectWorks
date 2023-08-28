package DiaryApp;

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
        out.println("""
                *******************************************************************
                Hi, Welcome to Chronicle Diary.
                    Chronicle helps you document your day-to-day experiences,
                    social commentary, complaints, poems, prose, illicit thoughts
                    and any content.
                *******************************************************************
                """);
    }

    private void openAccount(){

        out.println("""
                Enter:
                1. Create Diary
                """);
        String username = inputCollector("Input Your Choice: ");
        if (username.equals("1")){
            newSignUP();
            anotherAccount();
        }
        else {out.println("Invalid Input"); openAccount();}
    }

    private void anotherAccount() {
        out.println("""
                Enter:
                1. Create another diary
                2. Log In
                """);
        String username = inputCollector("Input Your Choice: ");
        if (username.equals("1")){
            newSignUP();
        }
        else if (username.equals("2"))
            logInInput();
        else {out.println("Invalid Input"); anotherAccount();}
    }

    private void logInInput(){
        try{
            out.println("Log in");
            String username = inputCollector("Username: ");
            String password = inputCollector("Password: ");

            validateInfo(username, password);
            out.println("Log In Successful");
            loggedIn();
        }
        catch (IllegalArgumentException e){
            err.println(e.getMessage());
            out.println(" ");
            logInInput();
        }
    }

    private void validateInfo(String username, String password) {
        try{
            diaries.validatePassword(username,password);
        }
        catch (IllegalArgumentException e){
            err.println(e.getMessage());
            logInInput();
        }

    }

    private void newSignUP() {
        try {
            String fullName = inputCollector("Enter your full name: ");
            String username = inputCollector("Enter a username: ");
            String password = inputCollector("Enter a password: ");
            String number = inputCollector("Enter your phone number: ");

            validateDetails(fullName, number, username, password);

            diary = new Diary(username, password);
            saving();
            diaries.add(username, password);
            out.println("Hello " + username + "\nWelcome To Chronicle Diary");
            anotherAccount();
        }
        catch (IllegalArgumentException e) {
            err.println(e.getMessage());
            newSignUP();
        }
    }

    private void validateDetails(String fullName, String number, String username, String password) {
        if (fullName.isEmpty() || !fullName.matches( "^[a-zA-Z][ ]*$"))
            throw new IllegalArgumentException("Name is not suppose to contain numbers.");
        if(!number.matches("\\d{10}"))
            throw new IllegalArgumentException("Enter number in the correct format(081********)");
        if(!username.matches("\\S"))
            throw new IllegalArgumentException("Username cannot contain space.");

    }

    private static void saving()  {
        try{
        out.print("Saving");
        for (int count = 0; count < 15; count++) {
            out.print(".");
            Thread.sleep(250);}
        }
        catch (InterruptedException e){
            err.println(e.getMessage());
        }

        out.println("Successful");
    }

    private static String inputCollector(String message) {
        Scanner scanner = new Scanner(in);

        out.print(message);
        return scanner.nextLine();
    }

    private void loggedIn(){
        out.println("""
                Enter:
                    1. Add Entry
                    2. Search Entry
                    3. Delete Entry
                    4. Update/ Edit Entry
                    5. Lock Diary
                    6. Log Out
                """);
        String userEntry = inputCollector("Enter your choice: ");
        if (userEntry.equals("1")) addEntry();
        else if (userEntry.equals("2")) findEntry();
        else if (userEntry.equals("3")) deleteEntry();
        else if (userEntry.equals("4")) updateEntry();
        else if (userEntry.equals("5")) lockDiary();
        else if (userEntry.equals("6")) loggedOut();
        else {out.println("Invalid Entry");loggedIn();}
        
    }

    private void loggedOut() {
        out.println("Logging out...");
        anotherAccount();
    }

    private void lockDiary(){
        diary.lockDiary();
        out.println("Diary is Locked.");
        out.println("""
                Enter:
                1. UnlockDiary
                2. Log Out""");
        String input = inputCollector("Enter your choice: ");
        if (input.equals("1")) unlockDiary();
        else if (input.equals("2")) loggedOut();
        else {
            out.println("invalid Input");
            lockDiary();
        }

    }

    private void unlockDiary(){
        try {
            String userPassword = inputCollector("Enter your password: ");
            diary.unlockDiary(userPassword);
            loggedIn();
        } catch (IllegalArgumentException e){
            out.println(e.getMessage());

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
            err.println(e.getMessage());

            updateEntry();
        }

    }

    private void deleteEntry() {
        try {
            int entryId = Integer.parseInt(inputCollector("Enter the Entry Id: "));
            diary.delete(entryId);
        } catch(IllegalArgumentException | InputMismatchException e){
            err.println(e.getMessage());
            deleteEntry();
        }
    }

    private void findEntry() {
        try{
            int entryId = Integer.parseInt(inputCollector("Enter the Entry Id: "));
            out.println(diary.findEntryById(entryId).getEntryDetails());
            loggedIn();
        } catch(IllegalArgumentException e) {
            err.println(e.getMessage());
            findEntry();
        }

    }

    private void addEntry() {
        String title = inputCollector("Enter Title: ");
        String body = inputCollector("Enter the journal: ");

        diary.createEntry(title, body);
        saving();
        loggedIn();
    }

}
