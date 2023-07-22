package ChapterFour;

import java.util.Scanner;

public class EnforcingPrivacy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a new for digit Integer:  ");
        int userEntry = scan.nextInt();

        String sample = encryption(userEntry);
        System.out.println("The encrypted password: " + sample);

        String sample1 = decryption(sample);
        System.out.println("The decrypted password: " + sample1);
    }

    public static String encryption(int password){
        if (password >= 1000 && password <= 9999) {

            String number = password + "";

            String newPassword = "";
            for (int counter = number.length() - 1; counter >= 0; counter--) {
                int digit = password / (int) Math.pow(10, counter) % 10;
                int newDigit = (digit + 7) % 10;

                newPassword += newDigit;
            }

            String encryptedPassword = "";
            encryptedPassword += newPassword.charAt(2);
            encryptedPassword += newPassword.charAt(3);
            encryptedPassword += newPassword.charAt(0);
            encryptedPassword += newPassword.charAt(1);

            return encryptedPassword;
        }
        else {
            return "Invalid Input. Try Again!";
        }
    }

    public static String decryption(String encryptedPassword){

//        String number = encryptedPassword + "";

        String newNumber = "";
        newNumber += encryptedPassword.charAt(2);
        newNumber += encryptedPassword.charAt(3);
        newNumber += encryptedPassword.charAt(0);
        newNumber += encryptedPassword.charAt(1);

        int extraPassword = Integer.parseInt(newNumber);

        String newPassword = "";
        for (int counter = encryptedPassword.length() - 1; counter >= 0; counter--) {
            int digit = extraPassword / (int) Math.pow(10, counter) % 10;

            int newDigit;
            if (digit >= 7) newDigit = digit - 7;
            else newDigit = (digit -7 + 10);

            newPassword += newDigit;
        }

        return newPassword;
    }


}
