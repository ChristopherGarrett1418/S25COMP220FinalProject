/**
 * Extension of class Checker
 *
 * For king checker pieces
 */
public class King extends Checker{

    public King(int team) {
        super(team);
    }

    @Override
    public boolean canJump(Checker[][] checkerBoard) {
        Checker King1 = new King(1);
        Checker King2 = new King(2);
        if(checkerBoard[King2.g-1])
        return false;
    }


}
