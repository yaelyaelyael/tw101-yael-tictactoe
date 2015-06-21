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
    private Board board;
    private String[] cells = {"","","","","","","","",""};


    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = new Board(printStream, cells);

    }

    @Test
    public void shouldChangeFirstBoardSpaceToXWhenZeroIsEnteredByPlayer1() {
        board.updateBoard("X", "0");

        assertEquals(cells[0], "X");
    }

    @Test
    public void shouldChangeMiddleBoardSpaceToXWhenFourIsEnteredByPlayer1() {
        board.updateBoard("X", "4");

        assertEquals(cells[4], "X");
    }

    @Test
    public void shouldPrintOInFirstSpotWhenZeroIsEnteredByPlayer2() {
        board.updateBoard("O", "4");

        assertEquals(cells[4], "O");
    }

    @Test
    public void shouldPrintBothPlayerOneMoveAndPlayerTwoMoveWhenBothHaveMoved() {
        board.updateBoard("X", "0");
        board.updateBoard("O", "1");

        assertEquals(cells[0], "X");
        assertEquals(cells[1], "O");
    }


}
