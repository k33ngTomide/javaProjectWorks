/*Write an application that reads an integer and determines and prints
        whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
        it’s divided by 3 with a remainder of 0.]*/
package Dietel.ChapterTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userEntry = keyboardInput.nextInt();

        if (userEntry % 3 == 0)
            System.out.println(userEntry + " is divisible by 3");
        else
            System.out.println(userEntry + " is not visible by 3");

    }
}
