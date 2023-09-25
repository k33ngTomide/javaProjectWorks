package Minutes25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {

    public static int getSingleNumber(int[] numbers) {

        int singleNumber = numbers[0];
        for (int number : numbers)
            for (int counter = 1; counter < numbers.length; counter++)
                if (number != numbers[counter]) {
                    singleNumber = number;
                }


        return singleNumber;
    }

    public static List<String> removeNonStringElement(Object[] given) {
        List<String> newArray = new ArrayList<>();

        for(Object element: given)
            if (element instanceof String)
                newArray.add((String) element);

        return newArray;
    }

    public static int maximumDifference(int[] number) {
        int maximum = 0;
        for (int counter = 0; counter < number.length; counter++) {
            if (counter + 1 == number.length) break;
            int addition =number[counter] - number[counter+1];
            if (addition > maximum) maximum = addition;
        }
        return  maximum;
    }
}
