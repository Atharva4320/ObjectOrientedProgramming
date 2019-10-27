
public class RugbyResult implements IResult {
    RugbyTeam team1;
    RugbyTeam team2;
    double team1points; // points scored by first team
    double team2points; // points scored by second team

    RugbyResult(RugbyTeam team1, RugbyTeam team2, double team1points, double team2points) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1points = team1points;
        this.team2points = team2points;
    }


    /*
     * isValid (): This function returns true if points of both the team is less
     *             than 150, returns false otherwise.
     */
    public boolean isValid() {
        if (this.team1points < 150 && this.team2points < 150) {
            return true;
        }
        else {
            return false;
        }
    }


    /*
     *  getWinner() : This function returns the winning team by comparing their points
     */
    public IContestant getWinner() {
        if (this.team1points > this.team2points) {
            return team1;
        }
        else {
            return team2;
        }
    }
}
