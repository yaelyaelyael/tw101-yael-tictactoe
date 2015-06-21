import java.io.PrintStream;

/**
 * Created by ykaufman on 6/18/15.
 */
public class Board {

    private PrintStream printStream;
    private String[] cells;

    public Board(PrintStream printStream, String[] cells) {
        this.printStream = printStream;
        this.cells = cells;
    }


    public void drawBoard() {

        printStream.println(
                " " + cells[0] + " | " + cells[1] + " | " + cells[2] + "\n" + "---------\n" +
                " " + cells[3] + " | " + cells[4] + " | " + cells[5] + "\n" + "---------\n" +
                " " + cells[6] + " | " + cells[7] + " | " + cells[8] + "\n");
    }


    public void updateBoard(String symbol, String userInput) {
        int input = Integer.parseInt(userInput)-1;
        if (cells[input].equals("")) {
            cells[input] = symbol;
        }
        drawBoard();
    }


}

