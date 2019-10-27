public class RoboticsResult implements IResult {
    RoboticsTeam team1;
    RoboticsTeam team2;
    double team1points; // points scored by first team
    int team1tasks; // tasks performed by first team
    boolean team1fell; // true if team 1 robot fell down
    double team2points; // points scored by team 2
    int team2tasks; // tasks performed by team 2
    boolean team2fell; // true if team2 robot fell over

    public RoboticsResult(RoboticsTeam team1, RoboticsTeam team2, double team1points, int team1tasks, boolean team1fell,
                          double team2points, int team2tasks, boolean team2fell) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1points = team1points;
        this.team1tasks = team1tasks;
        this.team1fell = team1fell;
        this.team2points = team2points;
        this.team2tasks = team2tasks;
        this.team2fell = team2fell;
    }


    /*
     * isValid() : This method determines whether the results are expected or reasonable to the individual score by
     *             returning a boolean value
     */
    public boolean isValid() {
        if (this.team1tasks < 8 && this.team1points <= 16 && this.team2tasks < 8 && this.team2points <= 16) {
            return true;
        }
        else {
            return false;
        }
    }


    /*
     * pointDeduction (): It is a helper method which consumes a boolean value and
     *                    returns -5 if the robot fell down, returns 0 otherwise.
     */
    public int pointDeduction(boolean robotFall) {
        if (robotFall == true) {
            return -5;
        }
        else {
            return 0;
        }
    }


    /*
     * getScore () : This method consumes the number of points scored, number of
     *               tasks attempted and whether the robot fell down, and returns an integer value
     *               of the final score by summing the points and tasks and applying a 5 points
     *               deduction if the robot fell down
     */
    public double getScore(double points, double tasks, boolean fallDown) {
        return (points + tasks + pointDeduction(fallDown)); // call to the helper method which subtracts 5 points from final score if the robot falls down
    }


    /*
     *  getWinner() : This method returns the team which won by comparing the scores of each team
     */
    public IContestant getWinner() {
        if (getScore(this.team1points, this.team1tasks, this.team1fell) > (getScore(this.team2points, this.team2tasks, this.team2fell))) {  // call to method which returns the final score of the competition
            return team1;
        }
        else {
            return team2;
        }
    }
}
