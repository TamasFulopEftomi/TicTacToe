import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tamas Fulop
 */

public class GridTest {
    Player player;
    Grid grid;

    @Before
    public void setUp() throws Exception {
        player = new Player('X');
        grid = new Grid();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void draw() {
    }

    @Test
    public void testCheckMove1() {
        Mark mark = new Mark(1, 1, player);
        assertTrue("Step is not between 1..5.", grid.checkMove(mark));
    }

    @Test
    public void testCheckMove2() {
        Mark mark = new Mark(3, 4, player);
        assertTrue("Step is not between 1..5.", grid.checkMove(mark));
    }

    @Test
    public void testCheckMove3() {
        Mark mark = new Mark(5, 5, player);
        assertTrue("Step is not between 1..5.", grid.checkMove(mark));
    }

    @Test
    public void testMakeMove1() {
        Mark mark = new Mark(2, 2, player);
        grid.makeMove(mark);
        assertEquals('X', mark.getPlayer().getSign());
        assertEquals(2, mark.getCol());
        assertEquals(2, mark.getRow());
    }

    @Test
    public void testMove2() {
        Mark mark = new Mark(3, 5, player);
        grid.makeMove(mark);
        assertEquals(3, mark.getRow());
        assertEquals(5, mark.getCol());
    }

    @Test
    public void testMove3() {
        Mark mark = new Mark(4, 4, player);
        grid.makeMove(mark);
        assertEquals(4, mark.getRow());
        assertEquals(4, mark.getCol());
    }

    @Test
    public void testIsDrawFalse1() {
        assertFalse("Table is out drawn.", grid.isDraw());
    }

    @Test
    public void testIsDrawFalse2() {
        Mark m0 = new Mark(1,1, player);
        grid.makeMove(m0);
        Mark m1 = new Mark(1,2, player);
        grid.makeMove(m1);
        Mark m2 = new Mark(1,3, player);
        grid.makeMove(m2);
        Mark m3 = new Mark(1,4, player);
        grid.makeMove(m3);
        Mark m4 = new Mark(1,5, player);
        grid.makeMove(m4);
        Mark m5 = new Mark(2,1, player);
        grid.makeMove(m5);
        Mark m6 = new Mark(2,2, player);
        grid.makeMove(m6);
        Mark m7 = new Mark(2,3, player);
        grid.makeMove(m7);
        Mark m8 = new Mark(2,4, player);
        grid.makeMove(m8);
        Mark m9 = new Mark(2,5, player);
        grid.makeMove(m9);
        Mark m10 = new Mark(3,1, player);
        grid.makeMove(m10);
        Mark m11 = new Mark(3,2, player);
        grid.makeMove(m11);
        Mark m12 = new Mark(3,3, player);
        grid.makeMove(m12);
        Mark m13 = new Mark(3,4, player);
        grid.makeMove(m13);
        Mark m14 = new Mark(3,5, player);
        grid.makeMove(m14);
        Mark m15 = new Mark(4,1, player);
        grid.makeMove(m15);
        Mark m16 = new Mark(4,2, player);
        grid.makeMove(m16);
        Mark m17 = new Mark(4,3, player);
        grid.makeMove(m17);
        Mark m18 = new Mark(4,4, player);
        grid.makeMove(m18);
        Mark m19 = new Mark(4,5, player);
        grid.makeMove(m19);
        Mark m20 = new Mark(5,1, player);
        grid.makeMove(m20);
        Mark m21 = new Mark(5,2, player);
        grid.makeMove(m21);
        Mark m22 = new Mark(5,3, player);
        grid.makeMove(m22);
        Mark m23 = new Mark(5,4, player);
        grid.makeMove(m23);
        assertFalse("Table is out drawn.", grid.isDraw());
    }

    @Test
    public void testIsDrawFalse3() {
        Mark m0 = new Mark(1,1, player);
        grid.makeMove(m0);
        Mark m1 = new Mark(1,2, player);
        grid.makeMove(m1);
        Mark m2 = new Mark(1,3, player);
        grid.makeMove(m2);
        Mark m3 = new Mark(1,4, player);
        grid.makeMove(m3);
        Mark m4 = new Mark(1,5, player);
        grid.makeMove(m4);
        Mark m5 = new Mark(2,1, player);
        grid.makeMove(m5);
        Mark m6 = new Mark(2,2, player);
        grid.makeMove(m6);
        Mark m8 = new Mark(2,4, player);
        grid.makeMove(m8);
        Mark m9 = new Mark(2,5, player);
        grid.makeMove(m9);
        Mark m10 = new Mark(3,1, player);
        grid.makeMove(m10);
        Mark m11 = new Mark(3,2, player);
        grid.makeMove(m11);
        Mark m12 = new Mark(3,3, player);
        grid.makeMove(m12);
        Mark m13 = new Mark(3,4, player);
        grid.makeMove(m13);
        Mark m14 = new Mark(3,5, player);
        grid.makeMove(m14);
        Mark m15 = new Mark(4,1, player);
        grid.makeMove(m15);
        Mark m16 = new Mark(4,2, player);
        grid.makeMove(m16);
        Mark m17 = new Mark(4,3, player);
        grid.makeMove(m17);
        Mark m18 = new Mark(4,4, player);
        grid.makeMove(m18);
        Mark m19 = new Mark(4,5, player);
        grid.makeMove(m19);
        Mark m20 = new Mark(5,1, player);
        grid.makeMove(m20);
        Mark m21 = new Mark(5,2, player);
        grid.makeMove(m21);
        Mark m22 = new Mark(5,3, player);
        grid.makeMove(m22);
        Mark m23 = new Mark(5,4, player);
        grid.makeMove(m23);
        Mark m24 = new Mark(5, 4, player);
        grid.makeMove(m24);
        assertFalse("Table is out drawn.", grid.isDraw());
    }

    @Test
    public void testIsDrawTrue() {
        Mark m0 = new Mark(1,1, player);
        grid.makeMove(m0);
        Mark m1 = new Mark(1,2, player);
        grid.makeMove(m1);
        Mark m2 = new Mark(1,3, player);
        grid.makeMove(m2);
        Mark m3 = new Mark(1,4, player);
        grid.makeMove(m3);
        Mark m4 = new Mark(1,5, player);
        grid.makeMove(m4);
        Mark m5 = new Mark(2,1, player);
        grid.makeMove(m5);
        Mark m6 = new Mark(2,2, player);
        grid.makeMove(m6);
        Mark m7 = new Mark(2,3, player);
        grid.makeMove(m7);
        Mark m8 = new Mark(2,4, player);
        grid.makeMove(m8);
        Mark m9 = new Mark(2,5, player);
        grid.makeMove(m9);
        Mark m10 = new Mark(3,1, player);
        grid.makeMove(m10);
        Mark m11 = new Mark(3,2, player);
        grid.makeMove(m11);
        Mark m12 = new Mark(3,3, player);
        grid.makeMove(m12);
        Mark m13 = new Mark(3,4, player);
        grid.makeMove(m13);
        Mark m14 = new Mark(3,5, player);
        grid.makeMove(m14);
        Mark m15 = new Mark(4,1, player);
        grid.makeMove(m15);
        Mark m16 = new Mark(4,2, player);
        grid.makeMove(m16);
        Mark m17 = new Mark(4,3, player);
        grid.makeMove(m17);
        Mark m18 = new Mark(4,4, player);
        grid.makeMove(m18);
        Mark m19 = new Mark(4,5, player);
        grid.makeMove(m19);
        Mark m20 = new Mark(5,1, player);
        grid.makeMove(m20);
        Mark m21 = new Mark(5,2, player);
        grid.makeMove(m21);
        Mark m22 = new Mark(5,3, player);
        grid.makeMove(m22);
        Mark m23 = new Mark(5,4, player);
        grid.makeMove(m23);
        Mark m24 = new Mark(5,5, player);
        grid.makeMove(m24);
        assertTrue("Table is not out drawn.",grid.isDraw());
    }

    @Test
    public void testWinRow1() {
        Mark mark0 = new Mark(1,1, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(1,2, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(1,3, player);
        grid.makeMove(mark2);
        assertTrue("Row is not good.", grid.win(player));
    }

    @Test
    public void testWinRow2() {
        Mark mark0 = new Mark(2, 3, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(2, 4, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(2, 5, player);
        grid.makeMove(mark2);
        assertTrue("Row is not good.", grid.win(player));
    }

    @Test
    public void testWinRoW3() {
        Mark mark0 = new Mark(4, 2, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(4, 3, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(4, 4, player);
        grid.makeMove(mark2);
        assertTrue("Row is not good.", grid.win(player));
    }

    @Test
    public void testWinColumn1() {
        Mark mark0 = new Mark(3,1, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(4,1, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(5,1, player);
        grid.makeMove(mark2);
        assertTrue("Column is not good.",grid.win(player));
    }

    @Test
    public void testWinColumn2() {
        Mark mark0 = new Mark(1, 4, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(2, 4, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(3, 4, player);
        grid.makeMove(mark2);
        assertTrue("Column is not good.", grid.win(player));
    }

    @Test
    public void testWinColumn3() {
        Mark mark0 = new Mark(2, 3, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(3, 3, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(4, 3, player);
        grid.makeMove(mark2);
        assertTrue("Column is not good.", grid.win(player));
    }

    @Test
    public void testWinDiagonalRight1() {
        Mark mark0 = new Mark(1,1, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(2,2, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(3,3, player);
        grid.makeMove(mark2);
        assertTrue("Diagonal right is not good.", grid.win(player));
    }

    @Test
    public void testWinDiagonalRight2() {
        Mark mark0 = new Mark(2, 3, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(3, 4, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(4, 5, player);
        grid.makeMove(mark2);
        assertTrue("Diagonal right is not good.", grid.win(player));
    }

    @Test
    public void testWinDiagonalRight3() {
        Mark mark0 = new Mark(3, 2, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(4, 3, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(5, 4, player);
        grid.makeMove(mark2);
        assertTrue("Diagonal right is not good.", grid.win(player));
    }

    @Test
    public void testWinDiagonalLeft1() {
        Mark mark0 = new Mark(1, 3, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(2, 2, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(3, 1, player);
        grid.makeMove(mark2);
        assertTrue("Diagonal left is not good.", grid.win(player));
    }

    @Test
    public void testWinDiagonalBal2() {
        Mark mark0 = new Mark(3, 5, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(4, 4, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(5, 3, player);
        grid.makeMove(mark2);
        assertTrue("Diagonal left is not good.", grid.win(player));
    }

    @Test
    public void testWinDiagonalBal3() {
        Mark mark0 = new Mark(2, 4, player);
        grid.makeMove(mark0);
        Mark mark1 = new Mark(3, 3, player);
        grid.makeMove(mark1);
        Mark mark2 = new Mark(4, 2, player);
        grid.makeMove(mark2);
        assertTrue("Diagonal left is not good.", grid.win(player));
    }

}