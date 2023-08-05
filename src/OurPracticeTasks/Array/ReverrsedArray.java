package OurPracticeTasks.Array;

public class ReverrsedArray {
    public static int[] elementReverse(int... array) {
        int[] arrayed = new int[array.length];

        int newIndex = 0;
        for (int index = array.length -1; index >= 0 ; index--) {
            arrayed[newIndex] = array[index];
            newIndex++;
        }
        return arrayed;
    }
}
