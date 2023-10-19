package Minutes25;

import java.util.stream.IntStream;

public class ArrayManipulations {

    public static int getLargestNumber(int[] number) {
        return IntStream.of(number).max().getAsInt();
    }

    public static int[] reverse(int[] number) {
        int[] newNumber = new int[number.length];
        filler(number, newNumber);
        return newNumber;
    }

    private static void filler(int[] number, int[] newNumber) {
        int count = newNumber.length - 1;
        for (int eachNumber: number) { newNumber[count] = eachNumber; count--; }
    }
}
