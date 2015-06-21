import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by ykaufman on 6/18/15.
 */
public class Game {

    private PrintStream printStream;
    private Board board;
    private SpecialBufferedReader specialBufferedReader;
    private Player player1; //need to change to List<Player> players
    private Player player2;

    public Game(PrintStream printStream, Board board, SpecialBufferedReader specialBufferedReader, Player player1, Player player2) {
        this.printStream = printStream;
        this.board = board;
        this.specialBufferedReader = specialBufferedReader;
        this.player1 = player1;
        this.player2 = player2;
    }

    public static void main(String[] args) {
        String[] cells = {"","","","","","","","",""};
        Board board = new Board(System.out, cells);
        Player player1 = new Player("X", board);
        Player player2 = new Player("O", board);
        SpecialBufferedReader specialBufferedReader =new SpecialBufferedReader(new InputStreamReader(System.in));
        Game game = new Game(System.out, board, specialBufferedReader, player1, player2);

        game.startGame();
    }


    public void startGame() {
        board.drawBoard();

        String userInput1 = getUserInput();
        board.updateBoard("X", userInput1);

        String userInput2 = getUserInput();
        board.updateBoard("O", userInput2);
    }

    public String getUserInput() {
        printStream.println("Please enter a number between 1 and 9!");
        return specialBufferedReader.readLine();
    }

}
