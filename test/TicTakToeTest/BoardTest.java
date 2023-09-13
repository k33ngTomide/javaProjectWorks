package TicTakToeTest;

import TicTakToe.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    Board board;

    @BeforeEach
    public void startWith(){
        board = new Board();
    }
    @Test
    public void testThatBoardCanBeCreated(){
        assertNotNull(board);
    }

    @Test
    public void testThatBoardIsEmptyAtCreation(){
        assertTrue(board.isEmpty());
    }

    @Test
    public void testThatIfPLayerMakeAMoveONBoard_TheBoardIsNoMoreEmpty(){
        board.move("1", "2");
        assertFalse(board.isEmpty());
    }

    @Test
    public void testThatBoardCanBeFull(){
        board.move("1", "1");
        board.move("2", "2");
        board.move("1", "6");
        board.move("2", "3");
        board.move("1", "7");
        board.move("2", "4");
        board.move("1", "8");
        board.move("2", "9");
        board.move("1", "5");

        assertTrue(board.isTotallyFilled());

    }
    @Test
    public void testThatMoreThanOneMovesCanBeMadeOnBoard_WithOnlyTwoPlayer(){
        board.move("1", "2");
        board.move("2", "1");
        board.move("1", "8");
        board.move("2", "9");

        assertThrows(IllegalArgumentException.class, ()->{board.move("3", "5");});

    }

    @Test
    public void testThatIfMoveIsAboveRange_BoardThrowsAnException(){
        assertThrows(IllegalArgumentException.class, ()->{board.move("1", "10");});
    }

    @Test
    public void testThatASpotCannotBeMovedOnTwice(){
        board.move("1", "1");
        board.move("2", "2");
        board.move("1", "6");
        board.move("2", "3");
        board.move("1", "7");

        assertThrows(IllegalArgumentException.class, ()->{board.move("1", "2");});

    }

    @Test
    public void testThatGameCanBeRestarted(){
        board.move("1", "1");
        board.move("2", "2");
        board.move("1", "6");
        board.move("2", "3");
        board.move("1", "7");

        assertFalse(board.isEmpty());
        board.restart();
        assertTrue(board.isEmpty());

    }

    @Test
    public void testThatBoardCanDeterminePlayerOneIsWinner(){
        board.move("1", "1");
        board.move("2", "5");
        board.move("1", "9");
        board.move("2", "4");
        board.move("1", "6");
        board.move("2", "2");
        board.move("1", "8");
        board.move("2", "7");
        board.move("1", "3");

        String winner = board.checkWinner();
        assertEquals("Player 1 Won", winner);

    }

    @Test
    public void testThatBoardCanDeterminePlayerTwoIsWinner() {
        board.move("1", "7");
        board.move("2", "1");
        board.move("1", "2");
        board.move("2", "5");
        board.move("1", "6");
        board.move("2", "9");

        String winner = board.checkWinner();
        assertEquals("Player 2 Won", winner);
    }

    @Test
    public void testThatBoardCanDeterminePlayerDraw() {
        board.move("1", "6");
        board.move("2", "3");
        board.move("1", "1");
        board.move("2", "8");
        board.move("1", "2");
        board.move("2", "5");
        board.move("1", "7");
        board.move("2", "4");
        board.move("1", "9");

        String winner = board.checkWinner();
        assertEquals("Draw", winner);
    }

}
