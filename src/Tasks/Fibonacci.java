package Tasks;

public class Fibonacci {

    public static int[] fibonacci(int number) {

        int[] fibo = new int[number];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int counter = 2; counter < number; counter++) {
            fibo[counter] = fibo[counter-1] + fibo[counter-2];
        }

        return fibo;
    }
}
