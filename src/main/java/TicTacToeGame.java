import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by ykaufman on 6/18/15.
 */
public class TicTacToeGame {

    private PrintStream printStream;
    private TicTacToeBoard ticTacToeBoard;
    private SpecialBufferedReader specialBufferedReader;
    private Player player1;
    private Player player2;

    public TicTacToeGame(PrintStream printStream, TicTacToeBoard ticTacToeBoard, SpecialBufferedReader specialBufferedReader, Player player1, Player player2) {
        this.printStream = printStream;
        this.ticTacToeBoard = ticTacToeBoard;
        this.specialBufferedReader = specialBufferedReader;
        this.player1 = player1;
        this.player2 = player2;
    }

    public static void main(String[] args) {
        String[] board = {"","","","","","","","",""};
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(System.out, board, player1, player2);
        SpecialBufferedReader specialBufferedReader =new SpecialBufferedReader(new InputStreamReader(System.in));
        TicTacToeGame ticTacToeGame = new TicTacToeGame(System.out, ticTacToeBoard, specialBufferedReader, player1, player2);

        ticTacToeGame.startGame();
    }


    public void startGame() {
        ticTacToeBoard.drawBoard();
        promptUserInput();

        String userInput1 = getUserInput();
        ticTacToeBoard.updateBoard(player1, userInput1);
        ticTacToeBoard.drawBoard();

        String userInput2 = getUserInput();
        ticTacToeBoard.updateBoard(player2, userInput2);
        ticTacToeBoard.drawBoard();
    }


    public void promptUserInput() {
        printStream.println("Please enter a number between 1 and 9!");
    }


    public String getUserInput() {
        return specialBufferedReader.readLine();
    }

}
