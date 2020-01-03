import java.util.Scanner;

/**
 *
 * @author Daniel Pasztuhov, StudiCore Ltd, www.studicore.hu
 */

public class Player {
    private char sign;

    public Player(char sign) {
        this.sign = sign;
    }

    public Mark readMove(Scanner sc) {
        boolean bad;
        int row;
        do {
            System.out.println(this + "! Please give in the row number (1..5) of your next move!");
            row = sc.nextInt();
            bad = row < 1 || row > 5;
            if (bad) {
                System.out.println("Bad row number!");
            }
        } while (bad);
        int col;
        do {
            System.out.println(this + "! Please give in the column number (1..5) of your next move!");
            col = sc.nextInt();
            bad = col < 1 || col > 5;
            if (bad) {
                System.out.println("Bad column number!");
            }
        } while (bad);
        return new Mark(row, col, this);
    }

    @Override
    public String toString() {
        return "Player with the sign " + sign;
    }

    public char getSign() {
        return sign;
    }

}
