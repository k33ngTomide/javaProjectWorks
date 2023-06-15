package Exercises;

public class BarCharts{
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 2, 9, 1, 4, 7, 6, 10};

        System.out.println("Grade Distribution");

        for(int counter = 0; counter < array.length; counter++ ){
            if(counter == 10) {System.out.printf("%7d:   ", 100); }
            else{
                System.out.printf("%02d - %02d:   ", (counter * 10), (counter * 10 + 9));
            }

            for(int star = 0; star < array[counter]; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        int total  = 0;
        for(int counter= 0; counter<array.length; counter++){
            total += array[counter];
        }
        System.out.println("The total number of student is: " + total);

    }
}

//      OUTPUT
//    Grade Distribution
//        00 - 09:   *
//        10 - 19:   **
//        20 - 29:   *****
//        30 - 39:   *******
//        40 - 49:   **
//        50 - 59:   *********
//        60 - 69:   *
//        70 - 79:   ****
//        80 - 89:   *******
//        90 - 99:   ******
//            100:   **********
//        The total number of student is: 54
