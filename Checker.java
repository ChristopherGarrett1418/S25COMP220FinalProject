/**
 * Abstract class for creating checkers.
 * There will be two types of checker pieces and those are Kings and Pawns.
 *
 * Kings can move forward and backwards on diagonals.
 * Pawns can only move forwards on the diagonals.
 *
 * Black checker pieces are represented by the integer 0
 * White checker pieces are represented by the integer 1
 */
public abstract class Checker {
    private int team;

    /**
     * Constructor that sets the team (color) of a piece
     * @param team
     */
    public Checker (int team) {
        this.team = team;
    }

    /**
     * @return int for specifc team number
     */
    public int getTeam() {
        return this.team;
    }

    /**
     * Piece checks if it is able to move, if so, returns true.
     * If this method returns false, the progarm will tell the player that they can't move this piece
     * @param checkerBoard 2D array representing checkerboard
     * @return boolean representing whether a piece can move or not
     */
    public abstract boolean canJump(Checker[][] checkerBoard);




}
