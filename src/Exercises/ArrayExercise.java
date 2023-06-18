package Exercises;

public class ArrayExercise {

    public static void main(String[] args) {
        int[] numbers = new int[26];

        for (int a = 0; a < numbers.length;  a++){
            numbers[a] = a * 10;
        }
        for (int b = 0; b < numbers.length; b++) {
            System.out.println("Element is " + b + ", Value is " + numbers[b]);
        }

    }

}
