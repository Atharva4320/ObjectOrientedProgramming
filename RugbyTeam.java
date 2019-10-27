
public class RugbyTeam implements IContestant {
    String country; // name of the country the team represents
    String jColor; // color of the jersey
    boolean ritual; // true if the tem has an intimidation ritual
    int wins; // number of wins
    int losses; // number of losses

    public RugbyTeam (String country, String jColor, boolean ritual, int win, int loss){
        this.country = country;
        this.jColor = jColor;
        this.ritual = ritual;
        this.wins = win;
        this.losses = loss;
    }


    /*
     * expectToBeat() : This function consumes a contestant "opponentTeam" and returns true if the
     *                  contestant is expected to win against the "opponentTeam". It returns false
     *                  otherwise.
     */
    public boolean expectToBeat(RugbyTeam opponentTeam) {
        if (opponentTeam.ritual == this.ritual) {
            if ((opponentTeam.wins - opponentTeam.losses) > (this.wins - this.losses)) {
                return false;
            }
            else if ((opponentTeam.wins-opponentTeam.losses) == (this.wins-this.losses)) {
                return false;
            }
            else {
                return true;
            }
        }
        else if (opponentTeam.ritual == true) {
            return false;
        }
        else {
            return true;
        }
    }


}
