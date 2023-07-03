package ChapterFour;

public class Factorial {
    private static int question;
    public static void main(String[] args) {

        Factorial calc = new Factorial();
        int answer = calc.calculateFactorial(5);
        System.out.printf("The value of %d! is %d%n", question, answer);
    }
    public int calculateFactorial(int number) {
        question = number;
        if (number < 0) terminate();
        if (number == 0 || number == 1) return  1;

        int total = 1;
        while (number != 0) {
            total *= number;
            number -= 1;
        }
        return total;

//        int less = number - 1;
//        for( int counter = less ; counter > 1; counter--){
//            number= number * counter;
//        }
//        return number;
//
    }

    public void terminate(){
        System.out.println("Invalid input");
        System.exit(1);
    }
}
