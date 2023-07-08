package ClassWork;

public class SumOfFourMultipleAndEightMultiples {
    public static void main(String[] args) {

        int total = 1;
        int sumTotalFour = 0;
        for(int counter = 4; counter <= 5; counter+=4){
            for (int newCounter = 1; newCounter <= 5; newCounter++){
                total *= counter;
                sumTotalFour += total;
            }

        }
        System.out.print(sumTotalFour + " ");

        int total1 = 1;
        int sumTotalEight = 0;
        for(int counter = 8; counter <=10; counter+=4){
            for (int newCounter = 1; newCounter <= 5; newCounter++){
                total1 *= counter;
                sumTotalEight += total1;
            }
        }
        System.out.print(sumTotalEight + " ");
    }
}
