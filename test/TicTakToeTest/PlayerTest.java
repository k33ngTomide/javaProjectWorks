package TicTakToeTest;

import TicTakToe.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {

    @Test
    public void testThatPlayerCanOnlyBeTwo(){
        Player player_1 = new Player("1");
        Player Player_2 = new Player("2");

        assertThrows(IllegalArgumentException.class, ()->{new Player("3");});

        Player.clearCreatedPlayers();

    }

    @Test
    public void testThatPlayerCanNotBeDuplicated(){
        Player player_1 = new Player("1");
        Player player_2 = new Player("2");

        assertThrows(IllegalArgumentException.class, ()->{new Player("1");});
        assertThrows(IllegalArgumentException.class, ()->{new Player("2");});

        Player.clearCreatedPlayers();
    }
}
