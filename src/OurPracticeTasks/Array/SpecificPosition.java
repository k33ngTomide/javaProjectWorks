package OurPracticeTasks.Array;

public class SpecificPosition {

    public static int[] insertElement(int position, int element, int... numbers) {

        int[] newList = new int[numbers.length];

        for (int counter = 0; counter < numbers.length; counter++) {
            if(counter == (position-1)) newList[counter] = element;
            else newList[counter] = numbers[counter];

        }
        return newList;
    }
}
