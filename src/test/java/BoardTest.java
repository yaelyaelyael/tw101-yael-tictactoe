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
    private Player player1;
    private Player player2;


    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = new Board(printStream, cells);
        player1 = new Player("X", board);
        player2 = new Player("O", board);

    }

    @Test
    public void shouldChangeFirstBoardSpaceToXWhenZeroIsEnteredByUser() {
        board.updateBoard("X", "0");

        assertEquals(cells[0], "X");
    }

    @Test
    public void shouldChangeMiddleBoardSpaceToXWhenFourIsEnteredByUser() {
        board.updateBoard("X", "4");

        assertEquals(cells[4], "X");
    }

    @Test
    public void shouldPrintOInMiddleSpotToOWhenPlayerTwoEntersFour() {
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
