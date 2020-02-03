public class RoboticsResult implements IResult{

    final double MAXPOINTS = 16;
    final double MAXTASKS = 8;

    RoboticsTeam team1;
    RoboticsTeam team2;
    double team1points;
    int team1tasks;
    boolean team1fell;
    double team2points;
    int team2tasks;
    boolean team2fell;

    public RoboticsResult(RoboticsTeam team1, RoboticsTeam team2,
                          double team1points, int team1tasks, boolean team1fell,
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

    public double getScore(double points, int tasks, boolean fell){
        double total;
        total = points + tasks;
        if(fell){
            total = total - 5;}

        return total;
    }


    @Override
    public boolean isValid(){
        if(team1points <= MAXPOINTS && team2points <= MAXPOINTS && team1tasks < MAXTASKS && team2tasks < MAXTASKS){
            return true;}
        else{
            return false;}
    }


    public IContestant getWinner(){
        RoboticsTeam winner;
        // this represents a current RoboticResult so it has all the team information
        if(this.getScore(team1points, team1tasks, team1fell) > this.getScore(team2points, team1tasks, team2fell)){
            winner = team1;}
        else{
            winner = team2;}

        return winner;
    }
}
