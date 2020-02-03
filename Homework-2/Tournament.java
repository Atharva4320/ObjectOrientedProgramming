import java.util.LinkedList;

/** Class Tournament
 * a brief description of what the class represents
 * This class deals with the results of all the rounds in the tournament. Also deals with winner of tournament.
 */
public class Tournament {

   // LinkedList<AbsRound> rounds = new LinkedList<AbsRound>();
   LinkedList<IWinner> rounds = new LinkedList<IWinner>();

    /** Constructor
     * @param rounds
     */
    public Tournament(LinkedList<IWinner> rounds) {
        this.rounds = rounds;
    }

    /** Method finalWinnerIsValid takes in an IContestant and produces a boolean of true if the contestant
     * has won at least half of the rounds
     * @param contestant this is an IContestant which allows the contestant to be a roboticsTeam or a rugbyTeam
     * @return returns a boolean, true if the contestant has won at least half of the rounds, false if not
     */
    public boolean finalWinnerIsValid(IContestant contestant) {
        double numberOfWins = 0;
        double numRounds = 0;
        for (IWinner aRound : this.rounds) {
            numRounds = this.rounds.size();
            if (aRound.isWinner(contestant)) {
                numberOfWins = numberOfWins + 1;
            }
        }
        if(numberOfWins*2 >= numRounds){
            return true;
        }
        else{
            return false;
        }
    }

}

