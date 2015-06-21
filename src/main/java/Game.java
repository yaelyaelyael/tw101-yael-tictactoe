import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ykaufman on 6/18/15.
 */
public class Game {

    private PrintStream printStream;
    private Board board;
    private SpecialBufferedReader specialBufferedReader;
    private List<Player> players;

    public Game(PrintStream printStream, Board board, SpecialBufferedReader specialBufferedReader, List<Player> players) {
        this.printStream = printStream;
        this.board = board;
        this.specialBufferedReader = specialBufferedReader;
        this.players = players;
    }


    public void startGame() {
        board.drawBoard();

        for (Player player : players) {
            String userInput = getUserInput();
            (player).move(userInput);
        }
    }

    public String getUserInput() {
        printStream.println("Player 1: Please enter a number between 1 and 9!");
        return specialBufferedReader.readLine();
    }

}
