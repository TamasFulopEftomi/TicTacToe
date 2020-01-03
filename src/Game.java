import java.util.Scanner;

/**
 *
 * @author Daniel Pasztuhov, StudiCore Ltd, www.studicore.hu
 */

public class Game {
    private Player[] players = new Player[2];
    private Grid grid = new Grid();

    public void run() {
        Scanner sc = new Scanner(System.in);
        players[0] = new Player('O');
        players[1] = new Player('X');
        Player actualPlayer = players[0];
        boolean over = isOver(actualPlayer);
        while (!over) {
            grid.draw();
            Mark actualMove = null;
            do {
                actualMove = actualPlayer.readMove(sc);
            } while (!grid.checkMove(actualMove));
            grid.makeMove(actualMove);
            over = isOver(actualPlayer);
            actualPlayer = otherPlayer(actualPlayer);
        }
        displayResults();
    }

    public void displayResults() {
        grid.draw();
        if (grid.isDraw()) {
            System.out.println("Draw! Please start a new game!");
            }
        else if (grid.win(players[0])) {
            System.out.println("First player (" + players[0] + ") has won!");
        }
        else if (grid.win(players[1])) {
            System.out.println("Second player (" + players[1] + ") has won!");
        }
    }

    public boolean isOver(Player actualPlayer) {
        return grid.isDraw() || grid.win(actualPlayer);
    }

    public Player otherPlayer(Player actualPlayer) {
        if (actualPlayer == players[0]) {
            return players[1];
        } else {
            return players[0];
            }
        }
    }
