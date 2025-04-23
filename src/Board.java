/**
 * Representation of a checkerboard and its pieces. This class will not play the
 * game itself but will have methods for key features of playing checkers.
 */
public class Board {
    private Checker[][] checkerBoard = new Checker[10][10]; //checkerboard with extra space so we don't overindex

    /**
     * Constructor for Board
     * Sets checkerboard
     */
    public Board() {
        //TODO: implement this constructor
        this.checkerBoard = null;
    }

    /**
     * Copy constructor for checkerboard, allows us to store previous boards to
     * take moves back
     * @param other
     */
    public Board(Board other) {
        this.checkerBoard = null;
    }

    /**
     * Checks location for a piece and determines whether there is one there
     * @param row of desired location player is selecting
     * @param col of desired location player is selecting
     * @return boolean for whether there is a piece
     */
    public boolean checkPlace(int row, int col) {
        //TODO: implement method
        return false;
    }

    /**
     * Selects desired piece at a location if a piece actually is there and
     * piece is the correct team.
     * This method is dependent on the checkPlace method.
     * @see checkPlace(int row, int col)
     * @param piece
     */
    public void selectPiece(Checker piece) {
        //TODO: implement method
        Checker nonexistant = null;
    }

    /**
     * updates board and moves piece
     * @param piece
     */
    public void move(Checker piece) {
        //TODO: implement this menthod
        this.checkerBoard = null;
    }

    /**
     * Removes pieces that were jumped over by opposing team
     * searches through 2D array to find piece that needs to be removed.
     * Assigns element at that location with null.
     * @param piece checker piece that is going to be removed
     */
    public void expel(Checker piece) {
        this.checkerBoard = null;
    }

    /**
     * After a move, checks if a piece is able to be kinged. If so, the method
     * will reassign the piece with a king checker piece. This method will work a certain
     * way depending on what team is moving.
     * If the piece isn't kingable, then returns the same piece sent to the method
     * @param piece
     */
    private void kingMe(Checker piece) {
        //TODO: implement method
        Checker tears = null;
    }

    /**
     * Creates a new copy of checkerboard so we can keep track of previous boards
     * @return
     */
    public Board newCopy() { return new Board(this);}
}
