package OurPracticeTasks;

public class pyramid {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 7; counter++) {

            for (int newCounter = 7; newCounter >= counter; newCounter--) {
                System.out.print(" " + " ");
            }
            for (int newCounter = 7; newCounter >= 8 - counter +1; newCounter--) {
                System.out.print(newCounter + " ");
            }
            for (int newCounter = 1; newCounter <= counter; newCounter++) {
                System.out.print(newCounter + " ");
            }
            System.out.println();

        }
    }
}
