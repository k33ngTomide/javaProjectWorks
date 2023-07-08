package ClassWork;

public class MultiplesOfFour {

    public static void main(String[] args) {

        int total = 1;
        for(int counter = 4; counter <= 5; counter+=4){
            for (int newCounter = 1; newCounter <= 5; newCounter++){
                total *= counter;
                System.out.print(total + " ");
            }
        }

        int total1 = 1;
        for(int counter = 8; counter <=10; counter+=4){
            for (int newCounter = 1; newCounter <= 5; newCounter++){
                total1 *= counter;
                System.out.print(total1 + " ");
            }
        }
    }
}
