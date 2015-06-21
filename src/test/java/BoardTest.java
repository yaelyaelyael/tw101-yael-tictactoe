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
    public void shouldChangeTopLeftCornerToXWhenZeroIsEnteredByPlayerOne() {
        board.updateBoard("X", "0");

        assertEquals(cells[0], "X");
    }

    @Test
    public void shouldChangeMiddleBoardSpaceToXWhenFourIsEnteredByPlayerOne() {
        board.updateBoard("X", "4");

        assertEquals(cells[4], "X");
    }

    @Test
    public void shouldChangeTopRightCornerToOWhenZeroIsEnteredByPlayerWithOSymbol() {
        board.updateBoard("O", "4");

        assertEquals(cells[4], "O");
    }

    @Test
    public void shouldDrawBothPlayerSymbolsIfBothPlayersHaveEnteredDifferentInput() {
        board.updateBoard("X", "1");
        board.updateBoard("O", "2");

        assertEquals(cells[1], "X");
        assertEquals(cells[2], "O");
    }


}
