package OurPracticeTasks.Array;

public class ArrayCopy {

    public static int[] copyList(int... elements) {
        int[] newList = new int[elements.length];
        for (int counter = 0; counter < elements.length; counter++) {
            newList[counter] = elements[counter];
        }
        return newList;
    }
}
