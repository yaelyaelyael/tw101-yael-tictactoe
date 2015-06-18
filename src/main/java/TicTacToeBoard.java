import java.io.PrintStream;
import java.util.Arrays;

/**
 * Created by ykaufman on 6/18/15.
 */
public class TicTacToeBoard {

    private PrintStream printStream;
    private String[] board = {"","","","","","","","",""};
    private Player player1;
    private Player player2;

    public TicTacToeBoard(PrintStream printStream, String[] board, Player player1, Player player2) {
        this.printStream = printStream;
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }


    public void drawBoard() {

        printStream.println(" " + board[0] + " | " + board[1] + " | " + board[2] + "\n" + "---------\n" +
                " " + board[3] + " | " + board[4] + " | " + board[5] + "\n" + "---------\n" +
                " " + board[6] + " | " + board[7] + " | " + board[8] + "\n");
    }


    public void updateBoard(Player player, String userInput) {
        int input = Integer.parseInt(userInput);
        if (board[input].equals("")) {
            board[input] = player.details();
        }
    }


}

