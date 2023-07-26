package Dietel.ChapterTwo;

import java.util.Scanner;

public class IndividualDigits {
    public static void main(String[] args) {
        Scanner keyboardScan = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        int me = keyboardScan.nextInt();

        int lastDigit = me % 10;
        int fourDigit = (me / 10) % 10;
        int thirdDigit = (me / 100) % 10;
        int secondDigit = (me / 1000) % 10;
        int firstDigit = (me / 10000) % 10;

        System.out.println(firstDigit + "   " + secondDigit + "   " + thirdDigit +
                "   " + fourDigit + "   " + lastDigit);

        System.out.printf("%d   %d   %d   %d   %d", firstDigit, secondDigit, thirdDigit, fourDigit, lastDigit);

    }

}
