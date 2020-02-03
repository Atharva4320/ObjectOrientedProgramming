public class RoboticsTeam implements IContestant{

    String school;
    String specialFeature;
    int previousScore;

    public RoboticsTeam(String school, String specialFeature, Integer previousScore){
        this.school = school;
        this.specialFeature = specialFeature;
        this.previousScore = previousScore;
    }

    public boolean expectToBeat(RoboticsTeam otherTeam){
        if(this.previousScore > otherTeam.previousScore){
            return true;}
        if(this.previousScore < otherTeam.previousScore){
            return false;}
        if(this.previousScore == otherTeam.previousScore){
            return false;}
        return false; // needed this line to make java happy.
    }

}
