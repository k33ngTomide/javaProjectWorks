package Minutes25;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallNumbers {


    public static int[] moveAllZeros(int[] given) {

        for(int count = 0; count < given.length; count++)
            for (int counter = 0; counter < given.length -1; counter++)
                if (given[counter] == 0){
                    int temp = given[counter];
                    given[counter] = given[counter+1];
                    given[counter+1] = temp;
                }

        return given;


//        ArrayList<Integer> givenList = new ArrayList<>();
//        int count = 0;
//        for (int number: given) {
//            if (number == 0) count++;
//            else givenList.add(number);
//        }
//
//        for (int counter = 0; counter < count; counter++) {
//            givenList.add(0);
//        }
//
//        int[] correctedList = new int[givenList.size()];
//        count = 0;
//        for (int number: givenList){
//            correctedList[count] = number;
//            count++;
//        }
//
//        return correctedList;
    }
}
