package Tasks;

public class BigAndSmall {

    public static int[] getLargestAndSmallestSum(int... number) {
        int total = 0;

        for (int counter = 0; counter < number.length; counter++) {
            total+=number[counter];
        }

        int[] newNumbers = new int [number.length];
        for (int counter = 0; counter < number.length; counter++) {
            newNumbers[counter] = total - number[counter];
        }

        int[] answer = new int[2];
        answer[1] = largest(newNumbers);
        answer[0] = smallest(newNumbers);

        int[] newAnswer = new int[2];
        for (int counter = 0; counter < newNumbers.length; counter++) {
            if (answer[1] == newNumbers[counter]) newAnswer[0] = number[counter];
            if (answer[0] == newNumbers[counter]) newAnswer[1] = number[counter];
        }
        return newAnswer;
    }

    private static int smallest(int[] newNumbers) {
        int smallest = newNumbers[0];

        for(int counter = 0; counter<newNumbers.length; counter++){
            if(newNumbers[counter] < smallest) {
                smallest = newNumbers[counter];
            }
        }
        return smallest;
    }

    private static int largest(int[] newNumbers) {
        int largest = newNumbers[0];

        for(int counter = 0; counter<newNumbers.length; counter++){
            if(newNumbers[counter] > largest) {
                largest = newNumbers[counter];
            }
        }
        return largest;
    }
}
