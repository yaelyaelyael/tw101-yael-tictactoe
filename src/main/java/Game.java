import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by ykaufman on 6/18/15.
 */
public class Game {

    private PrintStream printStream;
    private Board board;
    private SpecialBufferedReader specialBufferedReader;
    private Player player; //need to change to List<Player> players

    public Game(PrintStream printStream, Board board, SpecialBufferedReader specialBufferedReader, Player player) {
        this.printStream = printStream;
        this.board = board;
        this.specialBufferedReader = specialBufferedReader;
        this.player = player;
    }

    public static void main(String[] args) {
        String[] cells = {"","","","","","","","",""};
        Board board = new Board(System.out, cells);
        Player player = new Player("X", board);
        SpecialBufferedReader specialBufferedReader =new SpecialBufferedReader(new InputStreamReader(System.in));
        Game game = new Game(System.out, board, specialBufferedReader, player);

        game.startGame();
    }


    public void startGame() {
        board.drawBoard();

        String userInput = getUserInput();

        player.move(userInput);
    }

    public String getUserInput() {
        printStream.println("Player 1: Please enter a number between 1 and 9!");
        return specialBufferedReader.readLine();
    }

}
