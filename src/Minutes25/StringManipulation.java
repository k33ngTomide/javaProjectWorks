package Minutes25;

import java.util.Arrays;

public class StringManipulation {

    public static int getSecondLargestNumber(String alphaNumeric) {

        String numberString = alphaNumeric.replaceAll("\\D", "");

        int[] arrayNumbers = new int[numberString.length()];

        for (int counter = 0; counter < numberString.length(); counter++)
            arrayNumbers[counter] = Integer.parseInt(String.valueOf(numberString.charAt(counter)));

        int[] sortedArray = Arrays.stream(arrayNumbers).sorted().toArray();

        for (int counter = sortedArray.length-1; counter >= 0; counter--)
            if (sortedArray[counter] < sortedArray[sortedArray.length-1]) return sortedArray[counter];

        return -1;
    }
}
