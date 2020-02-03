public class RugbyResult implements IResult{
    final double MAXPOINTS = 150;
    RugbyTeam team1;
    RugbyTeam team2;
    double team1points;
    double team2points;

    public RugbyResult(RugbyTeam team1, RugbyTeam team2, double team1points, double team2point) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1points = team1points;
        this.team2points = team2point;
    }

    @Override
    public boolean isValid(){
        if(team1points < MAXPOINTS && team2points < MAXPOINTS){
            return true;}
        else{
            return false;}
    }

    @Override
    public IContestant getWinner(){
        // this problem states there will never be ties
        if(team1points > team2points){
            return team1;}
        else{
            return team2;}

    }

}
