/*(Comparing Integers) Write an application that asks the user to enter one integer, obtains
        it from the user and displays whether the number and its square are greater than, equal to, not equal
        to, or less than the number 100. Use the techniques shown in Fig. 2.15.*/
package ChapterTwo;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class IntegerCompare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double userInput = input.nextDouble();

        double square = Math.pow(userInput, 2);

        double result = userInput + square;
        if (result == 100) {
            System.out.println("The number and its square are equal to 100");
        }
        if (result > 100) {
            System.out.println("The number and its square are greater than to 100");
        }
        if (result < 100) {
            System.out.println("The number and its square are less than to 100");
        }
    }
}
