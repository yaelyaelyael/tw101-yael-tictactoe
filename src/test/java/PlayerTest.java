import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ykaufman on 6/18/15.
 */
public class PlayerTest {

    private PrintStream printStream;
    private Board board;
    private Player player;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        player = new Player("X", board);
    }

    @Test
    public void shouldCallUpdateBoardWhenMoveIsCalled() {
        String location = "1";
        player.move(location);

        verify(board).updateBoard("X", location);
    }



}
