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
        // these are initializing the first board to where the pawns are on team
        // 1 and then team 2. The starting positions are identical for each player, meaning
        // they are not strictly mirrored.
        checkerBoard[0][0] = new Pawn(1);
        checkerBoard[0][2] = new Pawn(1);
        checkerBoard[1][1] = new Pawn(1);
        checkerBoard[2][0] = new Pawn(1);
        checkerBoard[2][2] = new Pawn(1);
        checkerBoard[3][1] = new Pawn(1);
        checkerBoard[4][0] = new Pawn(1);
        checkerBoard[4][2] = new Pawn(1);
        checkerBoard[5][1] = new Pawn(1);
        checkerBoard[6][0] = new Pawn(1);
        checkerBoard[6][2] = new Pawn(1);
        checkerBoard[7][1] = new Pawn(1);

        // now for team 2:
        checkerBoard[0][6] = new Pawn(2);
        checkerBoard[1][5] = new Pawn(2);
        checkerBoard[1][7] = new Pawn(2);
        checkerBoard[2][6] = new Pawn(2);
        checkerBoard[3][5] = new Pawn(2);
        checkerBoard[3][7] = new Pawn(2);
        checkerBoard[4][6] = new Pawn(2);
        checkerBoard[5][5] = new Pawn(2);
        checkerBoard[5][7] = new Pawn(2);
        checkerBoard[6][6] = new Pawn(2);
        checkerBoard[7][5] = new Pawn(2);
        checkerBoard[7][7] = new Pawn(2);


      //  this.checkerBoard = null;
        // do we need this?
    }

    /**
     * Copy constructor for checkerboard, allows us to store previous boards to
     * take moves back
     * @param other
     */
    public Board(Board other) {
        //TODO: Make sure this makes a deep copy when implementing
        this.checkerBoard = null;
    }

    /**
     * Checks location for a piece and determines whether there is one there
     * @param row of desired location player is selecting
     * @param col of desired location player is selecting
     * @return boolean for whether there is a piece
     */
    public boolean checkPlace(int row, int col) {
        if((checkerBoard[row][col].getTeam() == 1)|| (checkerBoard[row][col].getTeam() == 2) ){
            return true;
        }
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
        if((piece.getTeam() == 2  && (checkerBoard[0].getTeam() == 1)) ||
                ((piece.getTeam() == 1)  && (checkerBoard[7].getTeam() == 1))){
            piece = new King(piece.getTeam());
            // this is a bit of hardcoding, just saying if my piece ever reaches your side
            // it becomes king. Might need to revise for efficiency or special cases
        }
        else{
            piece = new Pawn(piece.getTeam());
        }
        //TODO: implement method
        Checker tears = null;
        // what is this above? looks cool.
    }

    /**
     * Creates a new copy of checkerboard so we can keep track of previous boards
     * @return
     */
    public Board newCopy() { return new Board(this);}
}
