package Exercises;

public class SumOfArray {

    public static void main(String[] args) {

        int[] firstArray = {12, 30, 23, 56, 34, 78, 12, 45, 56, 25};
        int[] secondArray = {464, 364, 436, 96, 101, 475, 242, 353};
        int[] thirdArray = {1, 5, 7, 3, 2};
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        for (int counter = 0; counter < firstArray.length; counter++) {
            total1 += firstArray[counter];
        }
        for (int counter = 0; counter < secondArray.length; counter++) {
            total2 += secondArray[counter];
        }
        for (int counter = 0; counter < thirdArray.length; counter++) {
            total3 += thirdArray[counter];
        }

        System.out.println("The total of the first Array is: " + total1);
        System.out.println("The total of the second Array is: " + total2);
        System.out.println("The total of the third Array is: " + total3);

    }
}
