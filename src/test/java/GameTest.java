import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

/**
 * Created by ykaufman on 6/18/15.
 */
public class GameTest {

    private PrintStream printStream;
    private Game game;
    private Board board;
    private SpecialBufferedReader specialBufferedReader;
    private Player player1;
    private Player player2;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        specialBufferedReader = mock(SpecialBufferedReader.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        game = new Game(printStream, board, specialBufferedReader, player1, player2);
    }


    @Test
    public void shouldDisplayBoardWhenGameStarts() {
        game.startGame();

        verify(board).drawBoard();
    }


    @Test
    public void shouldPromptUserToEnterNumberWhenGameStarts() {
        game.getUserInput();

        verify(printStream).println(contains("Please enter a number between 1 and 9"));
    }


    @Test
    public void shouldCallUpdateBoardWhenUserInputIsEntered() throws IOException{
        when(specialBufferedReader.readLine()).thenReturn("0");

        game.startGame();

        verify(board).updateBoard("X", "0");
    }


}
