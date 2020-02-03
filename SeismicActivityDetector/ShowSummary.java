import java.util.LinkedList;

public class ShowSummary {

    LinkedList<Show> daytime;
    LinkedList<Show> primetime;
    LinkedList<Show> latenight;

    public ShowSummary()
    {
        this.daytime = new LinkedList<Show>();
        this.primetime = new LinkedList<Show>();
        this.latenight = new LinkedList<Show>();
    }

    public ShowSummary(LinkedList<Show> daytime, LinkedList<Show> primetime, LinkedList<Show> latenight)
    {
        this.daytime = daytime;
        this.primetime = primetime;
        this.latenight = latenight;
    }

    /*
   For problem 1
   1) create a cleaner method to remove the special shows and the (overnight = x) shows that are 1:00am <= x < 6:00am
   2) create helper method to sort the shows into 3 list for dayTime, primeTime, and nightTime
   3) last create a helper method to order all the shows for each of the 3 lists in numerical order for small to large
    numerically stands for the military time or the variable double broadcastTime

    */
/*
    public ShowSummary organizeShows(LinkedList<Show> data){
        LinkedList<Show> correctDayList = new LinkedList<Show>();
        LinkedList<Show> correctPrimeList = new LinkedList<Show>();
        LinkedList<Show> correctNightList = new LinkedList<Show>();

        LinkedList<Show> cleanDataList = new LinkedList<Show>();


        cleanDataList = orgShowsCleanHelper(data);

        for(Show aShow: cleanDataList){

            if(aShow.broadcastTime >= 0000 && aShow.broadcastTime < 0100){
                correctNightList.add(aShow);
            }
            if(aShow.broadcastTime >= 0600 && aShow.broadcastTime < 1700){
                correctDayList.add(aShow);
            }
            if(aShow.broadcastTime >= 1700 && aShow.broadcastTime < 2200){
                correctPrimeList.add(aShow);
            }
            if(aShow.broadcastTime >= 2200 && aShow.broadcastTime <= 2400){
                correctNightList.add(aShow);
            }

        }


        ShowSummary answer = new ShowSummary(correctDayList, correctPrimeList, correctNightList);
        return answer;
    }

    private LinkedList<Show> orgShowsCleanHelper(LinkedList<Show> data){
        LinkedList<Show> cleanData = new LinkedList<Show>();

        for(Show aShow: data){

            if(!(aShow.isSpecial)){

                if(!(aShow.broadcastTime >= 0100 && aShow.broadcastTime < 0600)){
                    cleanData.add(aShow);
                }
            }
        }
        return cleanData;
    }
*/

    // the equals method for use in testing
    public boolean equals(Object other)
    {
        if(!(other instanceof ShowSummary))
        {
            return false;
        }

        ShowSummary otherS = (ShowSummary) other;

        return this.equalsHelper(this.daytime, otherS.daytime) &&
                this.equalsHelper(this.primetime, otherS.primetime) &&
                this.equalsHelper(this.latenight, otherS.latenight);
    }

    private boolean equalsHelper(LinkedList<Show> theseShows, LinkedList<Show> otherShows)
    {
        if(theseShows.size() != otherShows.size())
        {
            return false;
        }

        for(int i = 0; i < theseShows.size(); i++)
        {
            Show thisShow = theseShows.get(i);
            Show otherShow = otherShows.get(i);

            if(!thisShow.title.equals(otherShow.title))
            {
                return false;
            }
            else if(thisShow.broadcastTime != otherShow.broadcastTime)
            {
                return false;
            }
        }

        return true;
    }

    // the toString method so that reports display when tests fail
    public String toString()
    {
        return this.toStringHelper(this.daytime) + "--- \n\n" + this.toStringHelper(this.primetime) + "--- \n\n" + this.toStringHelper(this.latenight);
    }

    private String toStringHelper(LinkedList<Show> theseShows)
    {
        String output = "";

        for(Show thisShow : theseShows)
        {
            output = output +
                    "Title: " + thisShow.title + " | " +
                    "Broadcast Time: " + thisShow.broadcastTime + "\n";

            for(Episode thisEp : thisShow.episodes)
            {
                output = output +
                        "Episode Title: " + thisEp.epTitle + " | " +
                        "Runtime: " + thisEp.runTime + "\n";
            }

            output = output + "\n";
        }

        return output;
    }
}
