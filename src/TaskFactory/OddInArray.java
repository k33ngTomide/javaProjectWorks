package TaskFactory;

public class OddInArray {

    public static int[] getOddElementsDeductedByTwo(int... numbers) {
        int numberOfOddElement = getNumberOfOddElement(numbers);

        int[] newList = new int[numberOfOddElement];

        int newCounter = 0;
        for (int index = 0; index < numbers.length; index++){
            boolean isOdd = numbers[index] % 2 != 0;
            if (isOdd){
                numbers[index] = numbers[index] - 2;
                newList[newCounter] = numbers[index];
                newCounter++;
            }
        }
        return newList;
    }

    private static int getNumberOfOddElement(int[] numbers) {
        int count = 0;
        for(int element : numbers){
            boolean isOdd = element % 2 != 0;
            if(isOdd) count++;
        }
        return count;
    }
}
