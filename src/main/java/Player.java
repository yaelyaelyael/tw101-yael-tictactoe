/**
 * Created by ykaufman on 6/18/15.
 */
public class Player {

    private String name;
    private String symbol;
    private Board board;

    public Player(String name, String symbol, Board board) {
        this.name = name;
        this.symbol = symbol;
        this.board = board;
    }

    public void move(String location) {
        board.updateBoard(symbol, location);
    }


    public String name() {
        return name;
    }
}
