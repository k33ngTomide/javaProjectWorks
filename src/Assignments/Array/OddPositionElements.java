package Assignments.Array;

import java.util.Scanner;

public class OddPositionElements {

    public static void main(String[] args) {
        Scanner scannedInput = new Scanner(System.in);

        System.out.print("Enter the number of element: ");
        int elementNumber = scannedInput.nextInt();

        double[] userList = new double[elementNumber];
        System.out.print("Enter a list of number: ");

        for (int entryCounter = 1; entryCounter <= elementNumber; entryCounter++) {
            var userEntry = scannedInput.nextDouble();
            userList[entryCounter] = userEntry;
        }

        String entryListAtOddPosition = getElementsAtOddPositions(userList);
        System.out.println("The elements at the odd positions are: " + entryListAtOddPosition);

    }



    public static String getElementsAtOddPositions(double... numbers) {
        String oddPositionedElements = "";

        for (int counter = 0; counter < numbers.length; counter++) {
            if (counter %2 == 0) oddPositionedElements += numbers[counter] + " ";
        }
        return oddPositionedElements.trim();
    }

    public static String getElementsAtOddPositions(int... numbers) {
        String oddPositionedElements = "";


        for (int counter = 0; counter < numbers.length; counter++) {
            if (counter %2 == 0) oddPositionedElements += numbers[counter] + " ";
        }
        return oddPositionedElements.trim();
    }
}
