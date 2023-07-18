package Assignments.Array;

public class AlternatingList {

    public static String[] alternateList(char[] characters, int[] numbers) {
        String alternate = "";

        int newCounter = 0, extraCounter = 0;
        for (int counter = 0; counter < characters.length
                + numbers.length ; counter++) {

            if(counter % 2 == 0) {
                alternate += characters[newCounter] + ", ";
                newCounter++;
            }else {
                if (extraCounter == numbers.length-1) alternate += numbers[extraCounter];
                else alternate += numbers[extraCounter] + ", ";
                extraCounter++;
            }

        }
        return new String[]{alternate};
    }
}
