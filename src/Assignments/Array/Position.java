package Assignments.Array;

import OurPracticeTasks.Array.ArrayCopy;

import java.util.Arrays;

public class Position {

    static int[] given;

    public static int[] assignGrade(int... values) {
        given = ArrayCopy.copyList(values);
        int[] valuePosition = new int[values.length];

        for (int counter = values.length; counter > 0; counter--) {
            for (int index = 0; index < counter - 1; index++) {
                if(values[index] > values[index+1]){
                    int temp = values[index];
                    values[index] = values[index+1];
                    values[index+1] = temp;
                }
            }
        }

        for (int index = 0; index < values.length ; index++) {
            for (int counter = 0; counter < given.length; counter++) {
                if (values[index] == given[counter]) {
                    valuePosition[counter] = values.length - index;
                }
            }
        }
        return valuePosition;
    }

}
