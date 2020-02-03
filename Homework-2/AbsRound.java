import java.util.LinkedList;

/** Abstract Class AbsRound
 * This is the super class that the InitRound class and AdvanceRound class use
 */
public abstract class AbsRound implements IWinner{

    LinkedList<Match> matches = new LinkedList<Match>();

    /** Constructor
     * @param matches
     */
    public AbsRound(LinkedList<Match> matches) {
        this.matches = matches;
    }

    /** Method getMatchWinners is used on a round and it produces a LinkedList of IContestant that each won their match.
     * It goes through a list of matches adding each winner, which is a IContestant data type, to the LinkedList answer.
     * After going through the whole list the method returns the LinkedList answer which contains all the winners of round.
     * @return a LinkedList of IContestant that won their match, each IContestant is either a roboticsTeam or a rugbyTeam.
     */

    // fix getMatchWinners() method so that when winner() method outputs null your code does not break!!!

    public LinkedList<IContestant> getMatchWinners(){
        LinkedList<IContestant> answer = new LinkedList<IContestant>();
        for(Match aMatch : this.matches){
            answer.add(aMatch.winner());
        }
        return answer;
    }

    /** Method getNumWinners is used on a round and it produces the number of winners in a round as an Integer .
     * The method goes through a list of matches running each match through an if statement that will pass as long as
     * the winner method does not output null. Each time a match passes the variable keeping track of the number of
     * winners goes up by one.
     * @return int numWinners
     */
    public int getNumWinners(){
        int numWinners = 0;
        for(Match aMatch : this.matches){
            if(!(aMatch.winner().equals(null))){
                numWinners = numWinners + 1;
            }
        }
        return numWinners;
    }

}
