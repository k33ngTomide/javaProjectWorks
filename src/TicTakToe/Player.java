package TicTakToe;
import java.util.ArrayList;

public class Player {

    private String playerNumber;

    private static ArrayList<String> listOfPlayer = new java.util.ArrayList<>();

    public Player(String playerNumber) {
        validatePlayer(playerNumber);
        this.playerNumber = playerNumber;
        listOfPlayer.add(playerNumber);
    }

    private void validatePlayer(String playerNumber) {
        if (!playerNumber.matches("[0-9]"))
            throw new IllegalArgumentException("Player Number must be a number 1 or 2");

        if (Integer.parseInt(playerNumber) > 2 || Integer.parseInt(playerNumber) < 1)
            throw new IllegalArgumentException("Player can be 1 or 2 ONLY");

        for (String player : listOfPlayer)
            if (player.equals(playerNumber))
                throw new IllegalArgumentException("Player cannot be created twice");

    }

    public String getPlayerNumber(){
        return playerNumber;
    }

    public static void clearCreatedPlayers(){
        listOfPlayer.clear();
    }
}
