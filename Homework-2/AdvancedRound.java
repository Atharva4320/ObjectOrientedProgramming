import java.util.LinkedList;

/** Class AdvanceRound
 * This class handles all the rounds after the very first round
 */
public class AdvancedRound extends AbsRound {

    LinkedList<IContestant> previousWinners = new LinkedList<IContestant>();

    /** Constructor
     * @param matches
     * @param previousWinners
     */
    public AdvancedRound(LinkedList<Match> matches, LinkedList<IContestant> previousWinners) {
        super(matches);
        this.previousWinners = previousWinners;
    }

    /** Method isWinner takes in a IContestant and produces true if the IContestant is on the list of
     * previousWinners if not it produces false
     * @param contestant this is an IContestant which allows the contestant to be a roboticsTeam or a rugbyTeam
     * @return it returns a boolean true if the contestant is apart of the previousWinners List if not false
     */
    @Override
    public boolean isWinner(IContestant contestant){
        for(IContestant aContestant : this.previousWinners){
            if(aContestant.equals(contestant)){
                return true;
            }
        }
        return false;
    }

}
