package Assignments.Array;

import java.util.Scanner;

public class EvenPositionElement {
    public static void main(String[] args) {
        Scanner scannedInput = new Scanner(System.in);

        System.out.print("Enter the number of element: ");
        int elementNumber = scannedInput.nextInt();

        double[] userList = new double[elementNumber];
        System.out.print("Enter a list of number: ");

        for (int entryCounter = 0; entryCounter < elementNumber; entryCounter++) {
            var userEntry = scannedInput.nextDouble();
            userList[entryCounter] = userEntry;
        }

        String entryListAtEvenPosition = getElementsAtEvenPosition(userList);
        System.out.println("The elements at the Even positions are: " + entryListAtEvenPosition);

    }

    public static String getElementsAtEvenPosition(double... numbers) {
        String evenPositionedElement = "";

        for (int counter = 0; counter < numbers.length; counter++) {
            if(counter % 2 != 0) evenPositionedElement += numbers[counter] + " ";
        }
        return evenPositionedElement.trim();
    }

    public static String getElementsAtEvenPosition(int... numbers) {
        String evenPositionedElement = "";

        for (int counter = 0; counter < numbers.length; counter++) {
            if(counter % 2 != 0) evenPositionedElement += numbers[counter] + " ";
        }
        return evenPositionedElement.trim();
    }
}
