package tdd;

public class Sort {

    private String sortedNumbers;

    public void sort(int firstNumber, int secondNumber, int thirdNumber) {
        int largest = Math.max(firstNumber, Math.max(secondNumber,thirdNumber));


        int middleNumber = firstNumber;
        if ((firstNumber > secondNumber && thirdNumber < secondNumber)||
                (thirdNumber > secondNumber && firstNumber < secondNumber)){
            middleNumber = secondNumber;
        }
        if ((firstNumber > thirdNumber && secondNumber < thirdNumber) ||
                (firstNumber < thirdNumber && secondNumber > thirdNumber)) {
            middleNumber = thirdNumber;
        }


        int smallest = Math.min(secondNumber, Math.min(thirdNumber, firstNumber));

        String num1 = largest + "";
        String num2 = middleNumber + "";
        String num3 = smallest + "";

        sortedNumbers = num1 + ", " + num2 + ", " + num3;

    }

    public String getSort() {
        return sortedNumbers;
    }
}
