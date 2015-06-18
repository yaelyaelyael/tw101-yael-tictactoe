import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by ykaufman on 6/18/15.
 */
public class TicTacToeGame {

    private PrintStream printStream;
    private TicTacToeBoard ticTacToeBoard;
    private SpecialBufferedReader specialBufferedReader;

    public TicTacToeGame(PrintStream printStream, TicTacToeBoard ticTacToeBoard, SpecialBufferedReader specialBufferedReader) {
        this.printStream = printStream;
        this.ticTacToeBoard = ticTacToeBoard;
        this.specialBufferedReader = specialBufferedReader;
    }

    public static void main(String[] args) {
        String[] board = {"","","","","","","","",""};
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(System.out, board);
        SpecialBufferedReader specialBufferedReader =new SpecialBufferedReader(new InputStreamReader(System.in));
        TicTacToeGame ticTacToeGame = new TicTacToeGame(System.out, ticTacToeBoard, specialBufferedReader);

        ticTacToeGame.startGame();
    }

    public void startGame() {
        ticTacToeBoard.drawBoard();
        promptUserInput();
        String userInput = getUserInput();
        ticTacToeBoard.updateBoard(userInput);
        ticTacToeBoard.drawBoard();
    }

    public void promptUserInput() {
        printStream.println("Please enter a number between 1 and 9!");
    }


    public String getUserInput() {
        return specialBufferedReader.readLine();
    }

}
