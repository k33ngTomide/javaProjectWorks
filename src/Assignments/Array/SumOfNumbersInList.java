package Assignments.Array;

public class SumOfNumbersInList {
    public static double getSumOfList(double... numbers) {
        double total = 0.0;

        for(int counter = 0; counter < numbers.length; counter++){
            total += numbers[counter];
        }
        return total;
    }

    public static int getSumOfList(int... numbers) {
        int total = 0;

        int counter = 0;
        while( counter < numbers.length){
            total += numbers[counter];
            counter++;
        }
        return total;
    }

    public static int  getSumOfListUsingDoWhile(int... numbers) {
        int total = 0;

        int counter = 0;
        do{
            total += numbers[counter];
            counter++;
        } while( counter < numbers.length);

        return total;
    }
}
