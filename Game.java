import java.util.Stack;

/**
 * Runs a game of Checkers using methods from Board to manipulate the board.
 * A game object will swap players when one players turn ends
 *
 * Black (represented by integer 0) will go first, and then the game will sequentially progress turn by turn until one
 * player cannot move anymore or has no more pieces
 */
public class Game {
    private Stack<Board> previousBoards;
    private Board currentBoard;
    private int player = 0;

    /**
     * Creates a game of Checkers.
     * Initializes the board we play on and initializes the Stack that we will use to keep track of previous boards
     *
     */
    public Game() {
        //TODO: implement constructor
        this.previousBoards = new Stack<>();
        this.currentBoard = new Board();
    }

    /**
     * Runs the main loop of the Checkers game
     */
    public void gameLoop() {
        //TODO: implement method
    }

    /**
     * Swaps to other player's turn
     */
    public void swapPlayers() {
        if (this.player == 0) {
            this.player = 1;
        }
        else {
            this.player = 0;
        }
    }
}
