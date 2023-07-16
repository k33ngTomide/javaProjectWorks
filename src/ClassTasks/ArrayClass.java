package ClassTasks;

import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {

        double[] numbers = new double[8];

        for (int joy = 0; joy < numbers.length; joy++) {
            numbers[joy] = 7;
        }
        System.out.println(Arrays.toString(numbers));

        for (int counter = 0; counter < numbers.length; counter++) {
            if (counter % 2 != 0) {
                numbers[counter] -= 1.5;
            }
        }
        System.out.println(Arrays.toString(numbers));

        for (int counter = 0; counter  < numbers.length ; counter++) {
            if (counter % 2 == 0) numbers[counter] += 2.3;
            if(counter == 0) numbers[counter] -= 4.7;
            if (counter == numbers.length - 1) numbers[counter] -= 4.7;

        }
        System.out.println(Arrays.toString(numbers));
    }



}
