package ClassTasks;

import java.util.Arrays;

public class ArrayClass1 {

    public static void main(String[] args) {

        double[] floating = new double[8];

        for(int counter = 0; counter < floating.length; counter++){
            floating[counter] = 7;
        }
        System.out.println(Arrays.toString(floating));

        for(int counter = 0; counter < floating.length; counter++){
            if (counter % 2 != 0) floating[counter] = floating[counter] - 1.5;
        }
        System.out.println(Arrays.toString(floating));

        for(int counter = 0; counter < floating.length; counter++){
            if (counter % 2 == 0) floating[counter] = floating[counter] + 2.3;
            if(counter == 0) floating[counter] = floating[counter]  - 4.7;
            if(counter == floating.length - 1) floating[counter] = floating[counter]  - 4.7;
        }
        System.out.println(Arrays.toString(floating));
    }
}
