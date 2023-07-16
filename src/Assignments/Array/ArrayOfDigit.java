package Assignments.Array;

public class ArrayOfDigit {
    public static String listOfDigits(String number) {

        String newList = "";

        for (int counter = 0; counter < number.length(); counter++) {

            char character = number.charAt(counter);

            if (counter == number.length() - 1) newList += character;
            else newList += character + ", ";

        }
        return newList.trim();
    }
}
