public class Match {
    IContestant team1; // first team in the match
    IContestant team2; // second team in the match
    IResult finalResult; // final score of the match

    Match (IContestant team1, IContestant team2, IResult finalResult) {
        this.team1 = team1;
        this.team2 = team2;
        this.finalResult = finalResult;
    }

    /*
     *  winner(): This method returns the contestant that won the match according to the results.
     *            It returns null otherwise
     */
    public IContestant winner() {

        if (finalResult.isValid()) {  // call to method which produces true if the result is valid
            return finalResult.getWinner(); // call to method which returns the winning team by comparing their results
        }
        else {
            return null;
        }
    }


}
