package ClassWork;

public class EchoFourToEightMultiples {

    public static void main(String[] args) {
        int output = 1;

        for(int counter = 4; counter <=10; counter+=4){
            for (int newCounter = 1; newCounter <= 5; newCounter++){
                output= output*counter;
                System.out.print(output + " ");
            }
            output = 1;
        }
    }
}
