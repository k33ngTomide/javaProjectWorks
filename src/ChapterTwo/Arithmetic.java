/*Write an application that asks the user to enter two integers, obtains them from
        the user and prints the square of each, the sum of their squares, and the difference of the squares (first
        number squared minus the second number squared). Use the techniques shown in Fig. 2.7.*/
package ChapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int firstNumber = keyboardInput.nextInt();

        System.out.print("Enter another number: ");
        int secondNumber = keyboardInput.nextInt();

        double squareOfEachFirstNumber = Math.pow(firstNumber, 2);
        double squareOfEachSecondNumber = Math.pow(secondNumber, 2);

        double sumOfSquare = squareOfEachFirstNumber + squareOfEachSecondNumber;
        double differenceOfSquare = squareOfEachFirstNumber - squareOfEachSecondNumber;

        System.out.println("The square of first Number = "+ squareOfEachFirstNumber
                + "\nThe square of second Number = " + squareOfEachSecondNumber
                + "\nThe sum of the square = " + sumOfSquare
                + "\nThe different of the square = " + differenceOfSquare );
    }
}
