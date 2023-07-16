package Assignments.Array;

import java.util.Scanner;

public class ReverseList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of element: ");
        int elementNumber = scan.nextInt();

        double[] userList = new double[elementNumber];
        System.out.print("Enter a list of number: ");

        for (int entryCounter = 0; entryCounter < elementNumber; entryCounter++) {
            var userEntry = scan.nextDouble();
            userList[entryCounter] = userEntry;
        }

        String entryReversedList = reverseList(userList);
        System.out.println("The reverse of the list is: " + entryReversedList);

    }


    public static String reverseList(double... numbers) {

        String reversedList = "";

        for (int counter = 0; counter < numbers.length; counter++) {
            double temp = numbers[(numbers.length - 1) - counter];

            if (counter == numbers.length -1) reversedList += temp;
            else reversedList += temp + ", ";

        }

        return reversedList;
    }

    public static String reverseList(int... numbers) {

        String reversedList = "";

        for (int counter = 0; counter < numbers.length; counter++) {
            int temp = numbers[(numbers.length - 1) - counter];

            if (counter == numbers.length -1) reversedList += temp;
            else reversedList += temp + ", ";
        }

        return reversedList;
    }
}
