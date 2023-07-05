package Exercises;

public class TriangleOfNumbers {
    public static void main(String[] args) {

        for(int x = 1; x < 7; x++){
            System.out.println();
            for(int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
        }

        System.out.println();

        for(int x = 1; x < 7; x++){
            System.out.println();
            for(int y = 1; y <= 7 - x; y++) {
                System.out.print(y + " ");
            }
        }

        System.out.println();

        for(int x = 1; x <= 7; x++){
            System.out.println();
            for(int y = 1; y <= 7 - x; y++) {
                System.out.print(" " + " ");
            }
            for(int y = 1; y <= x; y++) {
                System.out.printf("%d ", y);
            }
        }

        System.out.println();

        for(int x = 1; x <= 7; x++){
            System.out.println();
            for(int y = 1; y <= x; y++) {
                System.out.print(" " + " ");
            }
            for(int y = 1; y <= x ; y++) {
                System.out.printf("%d ", y);
            }
        }
    }
}
