package Minutes25;

public class AddDigits {
    public static int addDigits(int number) {
        String newNumber = String.valueOf(number);

        int total = 0;
        for(int counter = 0; counter < newNumber.length(); counter++){
            total += Integer.parseInt(newNumber.charAt(counter) + "");
        }
        if (total > 9) {
           total = addDigits(total);
        }
        return total;
    }
}
