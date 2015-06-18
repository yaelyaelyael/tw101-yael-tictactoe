import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ykaufman on 6/18/15.
 */
public class TicTacToeGameTest {

    private PrintStream printStream;
    private TicTacToeGame ticTacToeGame;
    private TicTacToeBoard ticTacToeBoard;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        ticTacToeGame = new TicTacToeGame(printStream, ticTacToeBoard);
    }


    @Test
    public void shouldPromptUserToEnterNumberWhenGameStarts() {
        ticTacToeGame.promptUserInput();

        verify(printStream).println(contains("Please enter a number between 1 and 9!"));
    }




}
