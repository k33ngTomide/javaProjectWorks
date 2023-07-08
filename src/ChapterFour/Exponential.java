package ChapterFour;
import java.util.Scanner;


public class Exponential {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        Exponential calc = new Exponential();


        System.out.print("Enter the number of terms: ");
        int userEntry = keyboardInput.nextInt();
        System.out.println(calc.expo(userEntry));
    }
    public double expo(int n){

        int factorial = 1;
        double e = 1;

        if (n < 0) e = 0;

        for (int value = 1; value < n+1; value++) {
            factorial *= value;
            e += 1 / (double)factorial;
        }
        return e;
    }
}
