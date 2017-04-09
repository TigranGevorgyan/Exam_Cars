import java.io.FileNotFoundException;

/**
 * Created by Taron on 04/08/17.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Game game = new Game(5,500);
        game.start();
    }
}
