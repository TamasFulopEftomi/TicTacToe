/**
 *
 * @author Daniel Pasztuhov, StudiCore Ltd, www.studicore.hu
 */

public class Mark {
    private int row;
    private int col;
    private Player player;

    public Mark(int row, int col, Player player) {
        this.row = row;
        this.col = col;
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Player getPlayer() {
        return player;
    }
}
