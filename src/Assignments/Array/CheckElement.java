package Assignments.Array;

import java.util.Scanner;

public class CheckElement {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the number of element you want to enter: ");
        int elementNumber = keyboardInput.nextInt();

        System.out.print("Enter the number you are checking for: ");
        int entryFind = keyboardInput.nextInt();


        int[] userList = new int[elementNumber];
        System.out.print("Enter a list of number: ");

        for (int entryCounter = 0; entryCounter < elementNumber; entryCounter++) {
            int userEntry = keyboardInput.nextInt();
            userList[entryCounter] = userEntry;
        }

        int isEntryPresent = isPresent(entryFind, userList);
            System.out.println("is " + entryFind + " Present in the List?: " + isEntryPresent);

    }




    public static int isPresent(int find, int... numbers) {

        for (int counter = 0; counter < numbers.length; counter++) {

            if (find == numbers[counter]) {
               return counter;
            }
        }
        return  -1;
    }
}

