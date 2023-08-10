package Assignments;

import java.util.Scanner;
import java.util.regex.*;

public class ValidatePassword {

    private String password = "";
    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ValidatePassword validatePassword = new ValidatePassword();

        validatePassword.password_validator();
    }
    public void password_validator() {
        System.out.println("Enter a password: ");
        password = scan.nextLine();
        length_check();
    }

    public void length_check() {
        if (password.length() >= 8) {
            uppercase_check();
        } else {
            System.out.println("Invalid\nPassword must be more than 8 characters, Try again");
            password_validator();
        }
    }

    public void uppercase_check() {
        Pattern pattern = Pattern.compile("[A-Z]+");
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            lowercase_check();
        }
    else{
            System.out.println(("Invalid\nPassword must contain at least one uppercase letter, Try Again"));
            password_validator();
        }
    }

    public void lowercase_check() {
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            number_check();
        } else {
            System.out.println(("Invalid\nPassword must contain at least one lowercase letter, Try Again"));
            password_validator();
        }
    }

    public void number_check() {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            special_char_check();
        }
        else{
            System.out.println(("Invalid\nPassword must contain at least one number, Try Again"));
            password_validator();
        }
    }

    public void special_char_check() {
        Pattern pattern = Pattern.compile("[!@$%^#&*_><]+");
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            saved();
        } else {
            System.out.println(("Invalid\nPassword must contain at least one special character, Try Again"));
            password_validator();
        }
    }

    public void saved() {
        System.out.println(("Password is Valid" + "\n   Saving...\n"));
        System.out.println(("Password saved Successfully \nPassword is saved as  " + "*".repeat(password.length())));
    }
}
