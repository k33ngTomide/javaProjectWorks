package ClassWork;

import java.util.Arrays;

public class ArrayManipulate {
    public static int[] swapElement(int firstIndex, int secondIndex, int[] numbers) {

        numbers[firstIndex] += numbers[secondIndex];
        numbers[secondIndex] = numbers[firstIndex] - numbers[secondIndex];
        numbers[firstIndex] -= numbers[secondIndex];

        return numbers;
    }
}
