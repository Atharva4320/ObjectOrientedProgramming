
public class RoboticsTeam implements IContestant{
    String school; // name of the school
    String specialFeature; // name of the special feature
    int previousScore; // score the team had in their last competition (0 if the team has never competed before)

    public RoboticsTeam (String school, String specialFeature, int previousScore){
        this.school = school;
        this.specialFeature = specialFeature;
        this.previousScore = previousScore;
    }


    /*
    * expectedToBeat() : This function returns a boolean value indicating whether the contestant is expected to beat the
    *                    opponent contestant
    */
    public boolean expectToBeat (RoboticsTeam opponentTeam) {
        if (opponentTeam.previousScore > this.previousScore) {
            return false;
        }
        else if (opponentTeam.previousScore < this.previousScore) {
            return true;
        }
        else {
            return false;
        }
    }
}
