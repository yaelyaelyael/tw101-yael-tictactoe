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

    private Board board;
    private Player player;

    @Before
    public void setUp() {
        board = mock(Board.class);
        player = new Player("Player 1", "X", board);
    }

    @Test
    public void shouldCallUpdateBoardWhenMoveIsCalled() {
        String location = "1";
        player.move(location);

        verify(board).updateBoard("X", location);
    }



}
