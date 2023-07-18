package OurPracticeTasks.Array;

public class ArrayManipulation {


    public static int[] remove(int number, int... list){

        int numberCounter = 0;

        for (int counter = 0; counter < list.length; counter++)
            if (number == list[counter]) numberCounter++;

        int[] newList = new int[list.length - numberCounter];

        int newCounter = 0;

        for (int counter = 0; counter < list.length; counter++) {
            if(number == list[counter]) continue;
            newList[newCounter] = list[counter];
            newCounter++;
        }
        return newList;
    }

}
