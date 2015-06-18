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
public class TicTacToeGameTest {

    private PrintStream printStream;
    private TicTacToeGame ticTacToeGame;
    private TicTacToeBoard ticTacToeBoard;
    private SpecialBufferedReader specialBufferedReader;
    private Player player1;
    private Player player2;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        ticTacToeBoard = mock(TicTacToeBoard.class);
        specialBufferedReader = mock(SpecialBufferedReader.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        ticTacToeGame = new TicTacToeGame(printStream, ticTacToeBoard, specialBufferedReader, player1, player2);
    }


    @Test
    public void shouldDisplayBoardWhenGameStarts() {
        ticTacToeGame.startGame();

        verify(ticTacToeBoard).drawBoard();
    }


    @Test
    public void shouldPromptUserToEnterNumberWhenGameStarts() {
        ticTacToeGame.promptUserInput();

        verify(printStream).println(contains("Please enter a number between 1 and 9"));
    }


    @Test
    public void shouldCallUpdateBoardWhenUserInputIsEntered() throws IOException{
        when(specialBufferedReader.readLine()).thenReturn("0");

        ticTacToeGame.startGame();

        verify(ticTacToeBoard).updateBoard(player1, "0");
    }


}
