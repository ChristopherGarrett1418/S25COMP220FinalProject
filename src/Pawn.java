/**
 * Extension of class Checker
 *
 * For pawn checker pieces
 */
public class Pawn extends Checker{

    public Pawn(int team) {
        super(team);
    }

    @Override
    public boolean canJump(Checker[][] checkerBoard) {
        //TODO: implement method
        return false;
    }

}
