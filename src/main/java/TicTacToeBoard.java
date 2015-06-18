import java.io.PrintStream;
import java.util.Arrays;

/**
 * Created by ykaufman on 6/18/15.
 */
public class TicTacToeBoard {

    private PrintStream printStream;
    private String[] board = {"","","","","","","","",""};

    public TicTacToeBoard(PrintStream printStream, String[] board) {
        this.printStream = printStream;
        this.board = board;
    }


    public void drawBoard() {

        printStream.println(" " + board[0] + " | " + board[1] + " | " + board[2] + "\n" + "---------\n" +
                " " + board[3] + " | " + board[4] + " | " + board[5] + "\n" + "---------\n" +
                " " + board[6] + " | " + board[7] + " | " + board[8] + "\n");
    }


    public void updateBoard(String userInput) {
        int input = Integer.parseInt(userInput);
        if (board[input].equals("")) {
            board[input] = "X";
        }
    }


}

