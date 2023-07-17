package Tasks;

public class ReverseNumber {


    public static int reverse(int number) {
        String anotherNumber = number + "";
        String newNumbers = "";

        for(int counter = anotherNumber.length() -1; counter >= 0; counter--){
            char word = anotherNumber.charAt(counter);
            newNumbers += (word);
        }

        int numeredNumber = Integer.parseInt(newNumbers.trim());
        return numeredNumber;
    }
}
