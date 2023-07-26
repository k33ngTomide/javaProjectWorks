package Dietel.ChapterFour;

public class DecryptionPrivacy {

    public static void main(String[] args) {

    }

    public static String decryption(String encryptedPassword) {


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
            else newDigit = (digit - 7 + 10);

            newPassword += newDigit;
        }

        return newPassword;
    }
}
