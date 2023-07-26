/*(Largest and Smallest Integers) Write an application that reads five integers and determines
        and prints the largest and smallest integers in the group. Use only the programming techniques you
        learned in this chapter.*/

package Dietel.ChapterTwo;

import java.util.Scanner;

public class LargestAndSmallest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Five numbers, separate them with spaces:");
        int firstNumber = input.nextInt();;
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int fourthNumber = input.nextInt();
        int fifthNumber = input.nextInt();

        int smallest = firstNumber;
        if (secondNumber < firstNumber) smallest = secondNumber;
        if (thirdNumber < secondNumber) smallest = thirdNumber;
        if (fourthNumber < thirdNumber) smallest = fourthNumber;
        if (fifthNumber < fourthNumber) smallest = fifthNumber;

        int largest = firstNumber;
        if (secondNumber > firstNumber) largest = secondNumber;
        if (thirdNumber > secondNumber) largest = thirdNumber;
        if (fourthNumber > thirdNumber) largest = fourthNumber;
        if (fifthNumber > fourthNumber) largest = fifthNumber;

        System.out.println("The smallest number = " + smallest +
                "\nThe largest number = " + largest);

    }



}
