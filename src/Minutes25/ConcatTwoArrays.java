package Minutes25;

public class ConcatTwoArrays {

    public static int[] add(int[] firstArray, int[] secondArray){

        int[] numbers = new int[firstArray.length + secondArray.length];

        int index = 0;
        for (int counter = firstArray.length - 1; counter >= 0; counter--) {
            numbers[index] = firstArray[counter]; index++;
        }

        for (int count = secondArray.length - 1; count >= 0; count--) {
            numbers[index] = secondArray[count]; index++;
        }

        return numbers;

    }
}
