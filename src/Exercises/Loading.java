package Exercises;

public class Loading {

    public static void main(String[] args) throws InterruptedException {

        System.out.print("Loading");

        for(int counter = 0; counter <= 6; counter++) {
            System.out.print(" >");
            Thread.sleep(1500);
        }
    }
}
