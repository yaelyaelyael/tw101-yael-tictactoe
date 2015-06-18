import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by ykaufman on 6/18/15.
 */
public class TicTacToeBoardTest {

    private PrintStream printStream;
    private TicTacToeBoard ticTacToeBoard;
    private String[] board = {"","","","","","","","",""};
    private Player player1;
    private Player player2;


    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        ticTacToeBoard = new TicTacToeBoard(printStream, board, player1, player2);
        player1 = new Player("X");
        player2 = new Player("O");

    }

    @Test
    public void shouldChangeFirstBoardSpaceToXWhen0IsEnteredByUser() {
        ticTacToeBoard.updateBoard(player1, "0");

        assertEquals(board[0], "X");
    }

    @Test
    public void shouldChangeMiddleBoardSpaceToXWhen4IsEnteredByUser() {
        ticTacToeBoard.updateBoard(player1, "4");

        assertEquals(board[4], "X");
    }

    @Test
    public void shouldPrintOInMiddleSpotWhenPlayer2Enters4() {
        ticTacToeBoard.updateBoard(player2, "4");

        assertEquals(board[4], "O");
    }

    @Test
    public void shouldPrintBothPlayer1MoveAndPlayerTwoMoveWhenBothHaveMoved() {
        ticTacToeBoard.updateBoard(player1, "0");
        ticTacToeBoard.updateBoard(player2, "1");

        assertEquals(board[0], "X");
        assertEquals(board[1], "O");
    }


}
