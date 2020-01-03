/**
 *
 * @author Daniel Pasztuhov, StudiCore Ltd, www.studicore.hu
 * @author Tamas Fulop
 */

public class Grid {

    public static final char BLANK = ' ';
    private char[][] table = {
            {BLANK, BLANK, BLANK, BLANK, BLANK},
            {BLANK, BLANK, BLANK, BLANK, BLANK},
            {BLANK, BLANK, BLANK, BLANK, BLANK},
            {BLANK, BLANK, BLANK, BLANK, BLANK},
            {BLANK, BLANK, BLANK, BLANK, BLANK}
    };

    public void draw() {
        System.out.println("  1 2 3 4 5");
        System.out.println(" +-+-+-+-+-+");
        System.out.printf("1|%c|%c|%c|%c|%c|%n", table[0][0], table[0][1], table[0][2], table[0][3], table[0][4]);
        System.out.println(" +-+-+-+-+-+");
        System.out.printf("2|%c|%c|%c|%c|%c|%n", table[1][0], table[1][1], table[1][2], table[1][3], table[1][4]);
        System.out.println(" +-+-+-+-+-+");
        System.out.printf("3|%c|%c|%c|%c|%c|%n", table[2][0], table[2][1], table[2][2], table[2][3], table[2][4]);
        System.out.println(" +-+-+-+-+-+");
        System.out.printf("4|%c|%c|%c|%c|%c|%n", table[3][0], table[3][1], table[3][2], table[3][3], table[3][4]);
        System.out.println(" +-+-+-+-+-+");
        System.out.printf("5|%c|%c|%c|%c|%c|%n", table[4][0], table[4][1], table[4][2], table[4][3], table[4][4]);
        System.out.println(" +-+-+-+-+-+");
    }

    public boolean checkMove(Mark move) {
        return !(move.getRow() < 1 || move.getRow() > 5 || move.getCol() < 1 || move.getCol() > 5 ||
                table[move.getRow() - 1][move.getCol() - 1] != BLANK);
    }

    public void makeMove(Mark actualMove) {
        if (checkMove(actualMove)) {
            table[actualMove.getRow() - 1][actualMove.getCol() - 1] = actualMove.getPlayer().getSign();
        }
    }

    public boolean isDraw() {
        for (int i  = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == BLANK) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean win(Player actualPlayer) {
        char mark = actualPlayer.getSign();
        //first row
        if (table[0][0] == mark && table[0][1] == mark && table[0][2] == mark) return true;
        if (table[0][1] == mark && table[0][2] == mark && table[0][3] == mark) return true;
        if (table[0][2] == mark && table[0][3] == mark && table[0][4] == mark) return true;
        //second row
        if (table[1][0] == mark && table[1][1] == mark && table[1][2] == mark) return true;
        if (table[1][1] == mark && table[1][2] == mark && table[1][3] == mark) return true;
        if (table[1][2] == mark && table[1][3] == mark && table[1][4] == mark) return true;
        //third row
        if (table[2][0] == mark && table[2][1] == mark && table[2][2] == mark) return true;
        if (table[2][1] == mark && table[2][2] == mark && table[2][3] == mark) return true;
        if (table[2][2] == mark && table[2][3] == mark && table[2][4] == mark) return true;
        //fourth row
        if (table[3][0] == mark && table[3][1] == mark && table[3][2] == mark) return true;
        if (table[3][1] == mark && table[3][2] == mark && table[3][3] == mark) return true;
        if (table[3][2] == mark && table[3][3] == mark && table[3][4] == mark) return true;
        //fifth row
        if (table[4][0] == mark && table[4][1] == mark && table[4][2] == mark) return true;
        if (table[4][1] == mark && table[4][2] == mark && table[4][3] == mark) return true;
        if (table[4][2] == mark && table[4][3] == mark && table[4][4] == mark) return true;
        //first column
        if (table[0][0] == mark && table[1][0] == mark && table[2][0] == mark) return true;
        if (table[1][0] == mark && table[2][0] == mark && table[3][0] == mark) return true;
        if (table[2][0] == mark && table[3][0] == mark && table[4][0] == mark) return true;
        //second column
        if (table[0][1] == mark && table[1][1] == mark && table[2][1] == mark) return true;
        if (table[1][1] == mark && table[2][1] == mark && table[3][1] == mark) return true;
        if (table[2][1] == mark && table[3][1] == mark && table[4][1] == mark) return true;
        //third column
        if (table[0][2] == mark && table[1][2] == mark && table[2][2] == mark) return true;
        if (table[1][2] == mark && table[2][2] == mark && table[3][2] == mark) return true;
        if (table[2][2] == mark && table[3][2] == mark && table[4][2] == mark) return true;
        //fourth column
        if (table[0][3] == mark && table[1][3] == mark && table[2][3] == mark) return true;
        if (table[1][3] == mark && table[2][3] == mark && table[3][3] == mark) return true;
        if (table[2][3] == mark && table[3][3] == mark && table[4][3] == mark) return true;
        //fifth column
        if (table[0][4] == mark && table[1][4] == mark && table[2][4] == mark) return true;
        if (table[1][4] == mark && table[2][4] == mark && table[3][4] == mark) return true;
        if (table[2][4] == mark && table[3][4] == mark && table[4][4] == mark) return true;
        //first row diagonal right
        if (table[0][0] == mark && table[1][1] == mark && table[2][2] == mark) return true;
        if (table[0][1] == mark && table[1][2] == mark && table[2][3] == mark) return true;
        if (table[0][2] == mark && table[1][3] == mark && table[2][4] == mark) return true;
        //second row diagonal right
        if (table[1][0] == mark && table[2][1] == mark && table[3][2] == mark) return true;
        if (table[1][1] == mark && table[2][2] == mark && table[3][3] == mark) return true;
        if (table[1][2] == mark && table[2][3] == mark && table[3][4] == mark) return true;
        //third row diagonal right
        if (table[2][0] == mark && table[3][1] == mark && table[4][2] == mark) return true;
        if (table[2][1] == mark && table[3][2] == mark && table[4][3] == mark) return true;
        if (table[2][2] == mark && table[3][3] == mark && table[4][4] == mark) return true;
        //first row diagonal left
        if (table[0][2] == mark && table[1][1] == mark && table[2][0] == mark) return true;
        if (table[0][3] == mark && table[1][2] == mark && table[2][1] == mark) return true;
        if (table[0][4] == mark && table[1][3] == mark && table[2][2] == mark) return true;
        //second row diagonal left
        if (table[1][2] == mark && table[2][1] == mark && table[3][0] == mark) return true;
        if (table[1][3] == mark && table[2][2] == mark && table[3][1] == mark) return true;
        if (table[1][4] == mark && table[2][3] == mark && table[3][2] == mark) return true;
        //third row diagonal left
        if (table[2][2] == mark && table[3][1] == mark && table[4][0] == mark) return true;
        if (table[2][3] == mark && table[3][2] == mark && table[4][1] == mark) return true;
        if (table[2][4] == mark && table[3][3] == mark && table[4][2] == mark) return true;

        return false;
    }
}
