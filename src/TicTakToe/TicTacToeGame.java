package TicTakToe;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class TicTacToeGame {

    private static Player firstPlayer = new Player("1");
    private static Player secondPlayer = new Player("2");
    private static String currentPlayer;

    private static Board board = new Board();
    private static String winner = "";

    public static void main(String[] args) {

        selectPlayer();
        gameMoves();
    }

    private static void selectPlayer() {
        String userPlayer = input("""
                TicTakToe Game
                                
                Pick Shape of Choice:
                1. Player 1 --- X
                2. Player 2 --- O
                                
                Enter AnyKey to start
                """);
    }


    private static void gameMoves() {
        int count = 1;

        while (true){
            if (!winner.isEmpty()) {
                display(winner);
                break;
            }

            selectPlayer(count);
            count = makeMove(count);
        }
    }

    private static int makeMove(int count) {
        try{
            String turn = "Player " + currentPlayer + " turn";
            String playMove = input(turn + "\nEnter a spot from 1 to 9: ");

            board.move(currentPlayer, playMove);
            String output = String.valueOf(board.printBoard());
            display(output);
            winner = board.checkWinner();
            count++;
        }
        catch(IllegalArgumentException error){
            display(error.getMessage());
            gameMoves();
        }
        return count;
    }

    private static void selectPlayer(int count) {
        if (count % 2 != 0) currentPlayer = firstPlayer.getPlayerNumber();
        else currentPlayer = secondPlayer.getPlayerNumber();
    }

    private static String input(String prompt){
        out.print(prompt);
        return new Scanner(in).next();
    }

    private static void display(String message){
        out.println(message);
    }
}
