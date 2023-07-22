import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
        randomNumber();
    }
    public static void randomNumber() {

        SecureRandom random = new SecureRandom();
        int userEntry = random.nextInt(1, 21);

        String newNumber = "000";
        for (int counter = 0; counter < newNumber.length(); counter++) {
            if(newNumber.length() == 24){
                System.exit(1);
            }
            if(userEntry != newNumber.charAt(counter)) {
                newNumber += userEntry;
            }
            else {
                randomNumber();
            }
            System.out.println(newNumber);
        }


    }
}