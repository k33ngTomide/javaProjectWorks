package TaskFactory;

public class Q1Array {
    public static int[] rearrange(int... numbers) {
        if(numbers.length % 2 != 0)
            for (int index = 0; index < numbers.length-1; index+=2)
                switchNumbers(index, index + 1, numbers);
        else
            for(int index = 0; index < numbers.length; index+=2)
                switchNumbers(index, index + 1, numbers);
        return numbers;
    }

    public static int[] rearrangedOdd(int... numbers) {
        for (int index = 0; index < numbers.length; index+=2) {
            boolean bothNumberAreOdd = numbers[index] %2 != 0 && numbers[index+1] % 2 != 0;
            if (bothNumberAreOdd)
                switchNumbers(index, index + 1, numbers);
        }
        return numbers;
    }

    public static int[] mirrorArray(int... numbers){
        int lastIndex = numbers.length - 1;
        int halfIndex = numbers.length/2;
        for (int index = 0; index < halfIndex; index++)
            switchNumbers(index, lastIndex - index, numbers);

        return numbers;
    }

    private static void switchNumbers(int index, int lastIndex, int[] numbers) {
        int temp = numbers[index];
        numbers[index] = numbers[lastIndex];
        numbers[lastIndex] = temp;
    }

}
