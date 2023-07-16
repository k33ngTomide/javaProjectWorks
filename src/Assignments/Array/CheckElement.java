package Assignments.Array;

import java.util.Scanner;

public class CheckElement {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the number of element you want to enter: ");
        int elementNumber = keyboardInput.nextInt();

        System.out.print("Enter the number you are checking for: ");
        double entryFind = keyboardInput.nextDouble();


        double[] userList = new double[elementNumber];
        System.out.print("Enter a list of number: ");

        for (int entryCounter = 0; entryCounter < elementNumber; entryCounter++) {
            double userEntry = keyboardInput.nextDouble();
            userList[entryCounter] = userEntry;
        }

        boolean isEntryPresent = isPresent(entryFind, userList);
            System.out.println("is " + entryFind + " Present in the List?: " + isEntryPresent);

    }


    public static boolean isPresent(double find, double... numbers) {
        boolean present = false;

        for (int counter = 0; counter < numbers.length; counter++) {

            if (find == numbers[counter]) {
                present = true;
            }
        }
        return  present;
    }
}

