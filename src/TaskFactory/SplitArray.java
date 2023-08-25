package TaskFactory;

import java.util.ArrayList;

public class SplitArray {
    public static int[] splitDigits(int... numbers) {

        StringBuilder list = putTheNumbersTogether(numbers);

        int count = 0;
        ArrayList<String> newList = new ArrayList<>();
        for (int index = 0; index < list.length(); index++){
            newList.add(String.valueOf(list.charAt(index)));
            count++;
        }

        int[] newArray = new int[count];
        for (int index = 0; index < newList.size(); index++) {
            newArray[index] = Integer.parseInt(newList.get(index));
        }
        return newArray;
    }

    private static StringBuilder putTheNumbersTogether(int[] numbers) {
        StringBuilder list = new StringBuilder();

        for (int number: numbers){
            list.append(number);
        }
        return list;
    }


    public static int[] addOneSplitDigits(int... numbers) {
        String allNumbersTogether = String.valueOf(putTheNumbersTogether(numbers));
        int newNumber = Integer.parseInt(allNumbersTogether) + 1;

        int[] addedArray = splitDigits(newNumber);
        return addedArray;
    }
}
