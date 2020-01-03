import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.*;

/**
 *
 * @author Tamas Fulop
 */

public class PlayerTest {
    Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player('X');
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testConstructor() {
        assertEquals('X', player.getSign());
    }

    @Test
    public void testToString() {
        assertEquals("Player with the sign X", player.toString());
    }

    @Test
    public void testReadMove() {
        Scanner sc = new Scanner("6\n2\n3\n");
        Player player = new Player('X');
        Mark mark = player.readMove(sc);
        assertEquals(2, mark.getRow());
        assertEquals(3, mark.getCol());
    }

}
