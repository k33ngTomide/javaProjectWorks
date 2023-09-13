package TicTakToe;

public class Board {
    private boolean isEmpty;
    private String[][] gameBoard;
    private String winner;


    public Board(){
        gameBoard = new String[][]{{".", ".", "."}, {".", ".", "."}, {".", ".", "."}};
        this.isEmpty = true;
        winner = "";
    }

    public boolean isEmpty() {
        checkIfBoardIsEmpty();
        return this.isEmpty;
    }

    private void checkIfBoardIsEmpty() {
        for (String[] row: gameBoard) { for (String space : row)
                if (!space.equals(".")) { isEmpty = false; break;} }
    }

    public void move(String playerNumber, String spot) {
        String playerShape = "";
        if (playerNumber.equals("1")) playerShape = "X";
        else if (playerNumber.equals("2")) playerShape = "O";
        else throw new IllegalArgumentException("Player can only be 1 or 2");

        moveMaker(playerShape, spot);
    }

    private void moveMaker(String playerShape, String spot) {
        validateSpot(spot);
        int extraCounter = 0;
        for (int counter = 0; counter < gameBoard.length; counter++)
            for (int new_counter = 0; new_counter < gameBoard[counter].length; new_counter++) {
                extraCounter += 1;
                if (Integer.parseInt(spot) == extraCounter) {
                    validateSpaceIsFree(gameBoard[counter][new_counter]);
                    gameBoard[counter][new_counter] = playerShape;
                }
            }

    }

    private void validateSpaceIsFree(String spaceOnBoard) {
        if (!spaceOnBoard.equals("."))
            throw new IllegalArgumentException("Filled space cannot be replayed");
    }

    private static void validateSpot(String spot) {
        if (!spot.matches("[0-9]") || Integer.parseInt(spot) < 1 || Integer.parseInt(spot) >= 10 )
            throw new IllegalArgumentException("Moves can only be between 1 to 9");

    }

    public boolean isTotallyFilled() {
        for (String[] row: gameBoard) for (String space : row)
            if (space.equals(".")) return false;
        return true;
    }


    public void restart() {
        gameBoard = new String[][]{{".", ".", "."}, {".", ".", "."}, {".", ".", "."}};;
        this.isEmpty = true;
        String winner = "";

    }

    public String checkWinner() {

        line_check_one();
        line_check_two();
        line_check_three();
        line_check_four();
        line_check_five();
        line_check_six();
        line_check_seven();
        line_check_eight();

        if (isTotallyFilled() && winner.isEmpty()) winner = "Draw";
        return winner;
    }

    private void check_player(boolean equal, String first_space) {
        boolean filled = !first_space.equals(".");
        if (filled && equal) {
            if (first_space.equals("X")) winner = "Player 1 Won";
            else if (first_space.equals("O")) winner = "Player 2 Won";
        }
    }

    private void line_check_eight() {
        boolean all_equal = gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[0][0].equals(gameBoard[2][2]);
        check_player(all_equal, gameBoard[0][0]);
    }

    private void  line_check_seven() {
        boolean all_equal = gameBoard[0][2].equals(gameBoard[1][2]) && gameBoard[0][2].equals(gameBoard[2][2]);
        check_player(all_equal, gameBoard[0][2]);
    }

    private void line_check_six() {
        boolean all_equal = gameBoard[0][1].equals(gameBoard[1][1]) && gameBoard[0][1].equals(gameBoard[2][1]);
        check_player(all_equal, gameBoard[0][1]);
    }

    private void line_check_five() {
        boolean all_equal = gameBoard[2][0].equals(gameBoard[1][1]) &&  gameBoard[2][0].equals(gameBoard[0][2]);
        check_player(all_equal, gameBoard[2][0]);
    }

    private void line_check_four() {
        boolean all_equal = gameBoard[2][0].equals(gameBoard[2][1]) && gameBoard[2][0].equals(gameBoard[2][2]);
        check_player(all_equal, gameBoard[2][0]);
    }

    private void line_check_three() {
        boolean all_equal = gameBoard[1][0].equals(gameBoard[1][1]) && gameBoard[1][0].equals(gameBoard[1][2]);
        check_player(all_equal, gameBoard[1][0]);
    }

    private void line_check_two() {
        boolean all_equal = gameBoard[0][0].equals(gameBoard[1][0]) && gameBoard[0][0].equals(gameBoard[2][0]);
        check_player(all_equal, gameBoard[0][0]);
    }

    private void line_check_one() {
        boolean all_equal = gameBoard[0][0].equals(gameBoard[0][1]) &&  gameBoard[0][0].equals(gameBoard[0][2]);
        check_player(all_equal, gameBoard[0][0]);
    }

    public StringBuilder printBoard(){
        StringBuilder boardPrint = new StringBuilder();

        for (String[] row: gameBoard) {
            for (String element : row) {
                boardPrint.append(element + "    ");
            }
            boardPrint.append("\n");
        }
        return boardPrint;
    }

}

