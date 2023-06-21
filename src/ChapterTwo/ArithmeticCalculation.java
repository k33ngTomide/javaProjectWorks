/*(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
        user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
        shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
        representation of the average. So, if the sum of the values is 7, the average should be 2, not
        2.3333….]*/

package ChapterTwo;

import java.util.Scanner;

public class ArithmeticCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers:  ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum / 3;
        int product = firstNumber * secondNumber * thirdNumber;
        int smallest = firstNumber;
        if (secondNumber< firstNumber) smallest = secondNumber;
        if (thirdNumber < secondNumber) smallest = thirdNumber;

        int largest = firstNumber;
        if (secondNumber > firstNumber) largest = secondNumber;
        if (thirdNumber > secondNumber) largest = thirdNumber;

        System.out.println("The sum = " + sum + "\nThe Average = " + average +
                "\nThe product = " + product + "\nThe smallest number = " + smallest +
                "\nThe largest = " + largest);
    }
}
