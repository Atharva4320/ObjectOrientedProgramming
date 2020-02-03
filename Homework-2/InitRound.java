import java.util.LinkedList;

/** Class InitRound
 * This class handles all operations dealing with the very first round in a tournament
 */
public class InitRound extends AbsRound {

    /** Constructor
     * @param matches
     */
    public InitRound(LinkedList<Match> matches) {
        super(matches);
    }

    /** Method isWinner takes in a IContestant and produces true if they win a match
     * from the list of matches if not it produces false
     * @param contestant this is an IContestant which allows the contestant to be a roboticsTeam or a rugbyTeam
     * @return it returns a boolean true if the contestant wins false if not
     */
    @Override
    public boolean isWinner(IContestant contestant){
        for(Match aMatch : this.matches){
            if(aMatch.winner().equals(contestant)){
                return true;
            }
        }
        return false;
    }

}
