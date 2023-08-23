package TaskFactory;

public class Q2ArrayRearranged {

    public int[] rearrange(int... numbers) {

        for (int index = 0; index < numbers.length; index+=2) {
            if (numbers[index] < numbers[index+1]){
                if (numbers[index] %2 !=0 && numbers[index+1] %2 != 0) {
                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
                }
            }
        }
        return numbers;
    }
}
