package Exercises;

public class AllClassWork_7_7_2023 {

    public static void main(String[] args) {
//         print 1 to 10
        for(int number = 1; number <= 10; number++){
            System.out.print(number + " ");
        }

//         even number between 1 and 10
        for(int number = 2; number <= 10; number+=2){
            System.out.print(number + " ");
        }

//         odd number
        for(int number = 1; number <= 10; number+=2){
            System.out.print(number + " ");
        }

//        4 and 8
        for(int number = 4; number <= 10; number+=4){
            System.out.print(number + " ");
        }

//        echo
        for(int number = 4; number <= 10; number+=4){
            for (int counter = 1; counter <=5; counter++)
                System.out.print(number + " ");
        }

//        multiple of four and eight
        int multiple = 1;
        for (int number = 4; number <= 10; number += 4) {
            for (int counter = 1; counter <= 5; counter++) {
                multiple *= number;
                System.out.print(multiple + " ");
            }
            multiple=1;
        }

//         sum of the multiples of four and eight
        multiple = 1;
        int sum = 0;
        for (int number = 4; number <= 10; number += 4) {
            for (int counter = 1; counter <= 5; counter++) {
                multiple *= number;
                sum += multiple;

            }
            System.out.print(sum + " ");
            multiple=1;
            sum = 0;
        }
    }

        //sum of everything
//        int multiple = 1;
//        int total = 0;
//        for(int number = 4; number <= 10; number += 4) {
//            for (int counter = 1; counter <= 5; counter++) {
//                multiple *= number;
//                total += multiple;
//
//            }
//            multiple = 1;
//        }
//            System.out.print(total + " ");

}
