package Tasks;

public class Power {

    public static int power(int number1, int number2){
        int power = number1;

        for (int counter = 1; counter < number2; counter++) {

            power = MultiplyClass.multiply(power, number1);
        }
        return power;
    }

}
