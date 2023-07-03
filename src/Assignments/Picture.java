package Assignments;


public class Picture {
    public static void main(String[] args) {
        int[][] picture = {
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}
        };

        for(int x = 0; x < picture.length; x++ ){
            for(int y = 0; y < picture[x].length; y++) {
                if (picture[x][y] == 0) {
                    System.out.print(" ");
                }
                else if (picture[x][y] == 1){
                System.out.print("*");
                }
            }
            System.out.println(" ");
        }


    }

}