package Assignments;

public class StraightTriangle {
    public static void main(String[] args) {

        for (int x =0; x < 11; x++ ) {

            System.out.println(" ");

            for (int y = 0; y <= x; y++) System.out.print("*");
            for (int z = 0; z < 11-x; z++) System.out.print(" ");
            for (int r = 0; r < 11-x; r++) System.out.print("*");
            for (int y = 0; y < x; y++) System.out.print(" ");
            for (int k = 0; k < x+1; k++) System.out.print(" ");
            for (int u = 0; u < 11-x; u++) System.out.print("*");
            for (int g = 0; g < 11-x; g++) System.out.print(" ");
            for (int y = 0; y < x+1; y++) System.out.print("*");

        }
    }
}

