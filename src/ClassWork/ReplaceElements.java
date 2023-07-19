package ClassWork;

public class ReplaceElements {

    public static void main(String[] args) {
        char[][] tikTakToe = {{'X', 'O', 'X'},
                            {'O', 'O', 'X'},
                            {'O', 'X', 'X'}};

        char xReplace = '1';
        char oReplace = '0';

        for (int counter = 0; counter < tikTakToe.length; counter++) {
            for (int newCounter = 0; newCounter < tikTakToe[counter].length; newCounter++) {
                char element = tikTakToe[counter][newCounter];
                if (element == 'X') System.out.print(xReplace + " ");
                if (element == 'O') System.out.print(oReplace + " ");
            }
            System.out.println();
        }
    }
}
