public class RugbyTeam implements IContestant{
    String country;
    String color;
    boolean haka;
    int wins;
    int losses;

    public RugbyTeam(String country, String color, boolean haka, Integer wins, Integer losses){
        this.country = country;
        this.color = color;
        this.haka = haka;
        this.wins = wins;
        this.losses = losses;
    }

    public boolean expectToBeat(RugbyTeam otherTeam){
        if(!(this.haka) && !(otherTeam.haka)) {
            if ((this.wins - this.losses) > (otherTeam.wins - otherTeam.losses)){
                return true;}
            else{
                return false;}
        }
        if(!(this.haka) && otherTeam.haka){
            return false;}
        else{
            if(!(otherTeam.haka) && (this.haka)) {
                return true;
            }}
        if(this.haka && otherTeam.haka){
            if((this.wins - this.losses) > (otherTeam.wins - otherTeam.losses)){
                return true;}}
        else{
            return false;}
        return false;
    }

}
