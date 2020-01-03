import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author Tamas Fulop
 */

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Mock
    Game game;

    @Test
    public void testOtherPlayer1() {
        Player players[] = new Player[2];
        players[0] = new Player('X');
        players[1] = new Player('O');
        when(game.otherPlayer(players[1])).thenReturn(players[0]);
        assertEquals(players[0].getSign(), game.otherPlayer(players[1]).getSign());
    }

    @Test
    public void testOtherPlayer2() {
        Player players[] = new Player[2];
        players[0] = new Player('X');
        players[1] = new Player('O');
        when(game.otherPlayer(players[0])).thenReturn(players[1]);
        assertEquals(players[1].getSign(), game.otherPlayer(players[0]).getSign());
    }
}