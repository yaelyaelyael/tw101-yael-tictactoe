import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ykaufman on 6/21/15.
 */
public class Main {

    public static void main(String[] args) {
        String[] cells = {"","","","","","","","",""};
        Board board = new Board(System.out, cells);
        SpecialBufferedReader specialBufferedReader = new SpecialBufferedReader(new InputStreamReader(System.in));

        List<Player> players = new ArrayList<>();
        players.add(new Player("Player 1", "X", board));
        players.add(new Player("Player 2", "O", board));

        Game game = new Game(System.out, board, specialBufferedReader, players);

        game.startGame();
    }
}
