package Assignments.Array;

import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the number of element you want to enter: ");
        int elementNumber = keyboardInput.nextInt();

        double[] userList = new double[elementNumber];
        System.out.print("Enter a list of number: ");

        for (int entryCounter = 0; entryCounter < elementNumber; entryCounter++) {
            double userEntry = keyboardInput.nextDouble();
            userList[entryCounter] = userEntry;
        }

        double largestEntry = getLargest(userList);
        System.out.println("The largest element is: " + largestEntry);

    }
    public static double getLargest(double... numbers) {
        double largest = numbers[0];

        for (int counter = 0; counter < numbers.length; counter++) {
            if (numbers[counter] > largest) largest = numbers[counter];
        }
        return largest;
    }
    public static int getLargest(int... numbers) {
        int largest = numbers[0];

        for (int counter = 0; counter < numbers.length; counter++) {
            if (numbers[counter] > largest) largest = numbers[counter];
        }
        return largest;
    }

}
