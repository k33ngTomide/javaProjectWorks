package OurPracticeTasks;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.println("N\tN^2\tN^3\tN^4");

        for(int number = 1; number <= 5; number++){
            for(int anotherNumber = 1; anotherNumber < 5; anotherNumber++){
                System.out.print((int)Math.pow(number, anotherNumber) + "\t");
            }
            System.out.println();
        }
    }
}
