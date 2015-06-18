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


    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        ticTacToeBoard = new TicTacToeBoard(printStream, board);

    }

    @Test
    public void shouldChangeFirstBoardSpaceToXWhen0IsEnteredByUser() {
        ticTacToeBoard.updateBoard("0");

        assertEquals(board[0], "X");
    }

    @Test
    public void shouldChangeMiddleBoardSpaceToXWhen4IsEnteredByUser() {
        ticTacToeBoard.updateBoard("4");

        assertEquals(board[4], "X");
    }


}