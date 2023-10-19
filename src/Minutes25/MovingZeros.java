package Minutes25;

import java.util.Arrays;

public class MovingZeros {


    public static String[] moveZero(int[] given) {
        String output = "";
        int count = 0;
        for (int number : given) {
            if (number == 0) count++;
            if(number != 0) output += number + " ";
        }


        for (int index = 0; index < count; index++) {
            output += 0 + " ";
        }
        String[] answer = output.split(" ", Integer.MAX_VALUE);
        return answer;
    }
}
