import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tamas Fulop
 */

public class MarkTest {
    Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player('X');
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRow() {
        Mark mark = new Mark( 4, 0, player );
        assertEquals(4, mark.getRow());
    }

    @Test
    public void getCol() {
        Mark mark = new Mark(0,4, null);
        assertEquals(4, mark.getCol());
    }

    @Test
    public void getPlayer() {
        Mark mark = new Mark(4,4, player);
        assertEquals('X', mark.getPlayer().getSign());
    }

    @Test
    public void getPlayer2() {
        Mark mark = new Mark(4, 4, player);
        assertEquals("Player with the sign X", mark.getPlayer().toString());
    }
}