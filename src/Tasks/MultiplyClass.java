package Tasks;

public class MultiplyClass {

    public static int multiply(int number1, int number2){
        int total = 0;

        for (int counter = 0; counter < number2; counter++) {
            total += number1;
        }
        return total;
    }
}
