import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

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
    private List<Player> players;
    private Player player;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        specialBufferedReader = mock(SpecialBufferedReader.class);
        players = mock(List.class);
        player = mock(Player.class);
        game = new Game(printStream, board, specialBufferedReader, players);
    }


    @Test
    public void shouldDisplayBoardWhenGameStarts() {
        game.startGame();

        verify(board).drawBoard();
    }


    @Test
    public void shouldPromptUserForInputWhenGameStarts() {
        game.getUserInput();

        verify(printStream).println(contains("Please enter a number between 1 and 9"));
    }

    @Test
    public void shouldCallMoveWhenUserInputIsEntered() {
        String userInput = "1";
        when(specialBufferedReader.readLine()).thenReturn(userInput);

        game.startGame();

        verify(player).move(userInput);

    }




}
