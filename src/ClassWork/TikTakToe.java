package ClassWork;

public class TikTakToe {
    public static void main(String[] args) {
        char[][] tikTakToe = {{'X', 'O', 'X'},
                            {'O', 'O', 'X'},
                            {'O', 'X', 'X'}};

        for (int counter = 0; counter < tikTakToe.length; counter++) {
            for (int newCounter = 0; newCounter < tikTakToe[counter].length; newCounter++) {
                char element = tikTakToe[counter][newCounter];

                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    
}
