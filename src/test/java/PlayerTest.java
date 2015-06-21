import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ykaufman on 6/18/15.
 */
public class PlayerTest {

    private PrintStream printStream;
    private Board board;
    private Player player1;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        player1 = new Player("X", board);
    }



}
