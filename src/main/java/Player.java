/**
 * Created by ykaufman on 6/18/15.
 */
public class Player {

    private String symbol;
    private Board board;

    public Player(String symbol) {
        this.symbol = symbol;
        this.board = board;
    }

    public void move(String location) {
        board.updateBoard(symbol, location);
    }


}
