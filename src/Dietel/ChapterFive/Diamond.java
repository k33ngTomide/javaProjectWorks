package Dietel.ChapterFive;

public class Diamond {
    public static void main(String[] args) {
        diamond(10);
    }
    public static void diamond(int size){
        for(int y = 0; y < size; y++){
            for(int c = 0; c < size-y; c++){
                System.out.print(" ");
            }
            for(int g = 0; g < y +1; g++){
                System.out.print("*");
            }
            for(int f=0; f < y; f++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int y = 0; y < size-1; y++){
            for(int f=0; f < y+2; f++){
                System.out.print(" ");
            }
            for(int g = 0; g < size-1- y ; g++){
                System.out.print("*");
            }
            for(int g = 0; g < size-2-y; g++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
