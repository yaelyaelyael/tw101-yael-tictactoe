import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by ykaufman on 6/18/15.
 */
public class BoardTest {

    private PrintStream printStream;
    private Board ticTacToeBoard;
    private String[] board = {"","","","","","","","",""};
    private Player player1;
    private Player player2;


    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        ticTacToeBoard = new Board(printStream, board);
        player1 = new Player("X");
        player2 = new Player("O");

    }

    @Test
    public void shouldChangeFirstBoardSpaceToXWhenZeroIsEnteredByUser() {
        ticTacToeBoard.updateBoard("X", "0");

        assertEquals(board[0], "X");
    }

    @Test
    public void shouldChangeMiddleBoardSpaceToXWhenFourIsEnteredByUser() {
        ticTacToeBoard.updateBoard("X", "4");

        assertEquals(board[4], "X");
    }

    @Test
    public void shouldPrintOInMiddleSpotToOWhenPlayerTwoEntersFour() {
        ticTacToeBoard.updateBoard("O", "4");

        assertEquals(board[4], "O");
    }

    @Test
    public void shouldPrintBothPlayerOneMoveAndPlayerTwoMoveWhenBothHaveMoved() {
        ticTacToeBoard.updateBoard("X", "0");
        ticTacToeBoard.updateBoard("O", "1");

        assertEquals(board[0], "X");
        assertEquals(board[1], "O");
    }


}
