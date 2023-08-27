package DiaryApp;

import java.util.Scanner;
import static java.lang.System.*;

public class MainApplication {
    private Diary diary;
    private Diaries diaries = new Diaries();
    
    public static void main(String... args) throws InterruptedException {
        MainApplication mainApplication = new MainApplication();
        out.println("""
                Hi, Welcome to Chronicle Diary.
                    Chronicle help you keeps your day-to-day experiences,
                    social commentary, complaints, poems, prose, illicit thoughts
                    and any content.
                """);
        mainApplication.openAccount();
    }

    private void openAccount() throws InterruptedException {

        out.println("""
                Press:
                1. Register
                2. Log In
                """);
        if (inputCollector("Input Your Choice: ").equals("1"))
            newSignUP();
        else if (inputCollector("Input Your Choice: ").equals("1"))
            logInInput();
        else {out.println("Invalid Input"); openAccount();}
    }

    private void logInInput() {
        out.println("Log in");
        try{
            String username = inputCollector("Username: ");
            String password = inputCollector("Password: ");
            validateInfo(username, password);
            loggedIn();
        }
        catch (IllegalArgumentException e){
            err.println(e.getMessage());
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

    private void newSignUP() throws InterruptedException {
        try {
            String username = inputCollector("Enter a username: ");
            String password = inputCollector("Enter a password: ");
            diary = new Diary(username, password);
            saving();
            diaries.add(username, password);
            out.println("Hello " + username + "\nWelcome To Chronicle Diary");
            logInInput();
        }
        catch (IllegalArgumentException e) {
            err.println(e.getMessage());
        }
    }

    private static void saving() throws InterruptedException {
        out.print("Saving");
        for (int count = 0; count < 7; count++) {
            out.print(".");
            Thread.sleep(250);
        }

        out.println("Sign Up completed");
    }

    private static String inputCollector(String message) {
        Scanner scanner = new Scanner(in);

        out.print(message);
        return scanner.nextLine();
    }

    private static void loggedIn(){
        out.println("Log In Successful");
        out.println("""
                Enter:
                    1. Add Entry
                    2. Find Entry
                    3. Delete Entry
                    4. Update/ Edit Entry
                    5. Settings
                """);
        if (inputCollector("Enter a number: ").equals("1"))
            out.println("To be continued...");;
    }


}
