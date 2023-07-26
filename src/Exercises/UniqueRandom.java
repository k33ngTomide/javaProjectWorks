package Exercises;

import java.util.Arrays;
import java.util.Random;

public class UniqueRandom {

    public static void main(String[] args) {
        int[] uniqueNumbers = generateUniqueRandomNumbers(1, 21);

        // Print the generated unique random numbers
        System.out.println(Arrays.toString(uniqueNumbers));
    }

    public static int[] generateUniqueRandomNumbers(int min, int max) {
        int[] numbers = new int[max - min + 1];

        // Fill the array with numbers from min to max
        for (int i = min; i <= max; i++) {
            numbers[i - min] = i;
        }

        // Shuffle the array using Fisher-Yates algorithm
        Random rand = new Random();
        for (int i = max - min; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            // Swap elements at i and j
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        return numbers;
    }
}
