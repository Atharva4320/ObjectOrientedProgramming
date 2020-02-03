import java.util.LinkedList;

/** Class ShowManager2
 * This class handles the organization of shows into the ShowSummary format
 */
public class ShowManager2 {

   public ShowManager2() {}

    /** Method organizeShows takes in a LinkedList of Show: 'data' and produces a ShowSummary object: 'answer'
     * The method cleans and then pares the data all at once in the loop.
     * @param data a LinkedList<Show>
     * @return a ShowSummary
     */
    public ShowSummary organizeShows(LinkedList<Show> data){
        LinkedList<Show> correctDayList = new LinkedList<Show>();
        LinkedList<Show> correctPrimeList = new LinkedList<Show>();
        LinkedList<Show> correctNightList = new LinkedList<Show>();

        for(Show aShow: data){

            if(!(aShow.isSpecial)) {

                if (!(aShow.broadcastTime >= 0100 && aShow.broadcastTime < 0600)) {

                    if (aShow.broadcastTime >= 0000 && aShow.broadcastTime < 0100) {
                        correctNightList.add(aShow);
                    }
                    if (aShow.broadcastTime >= 0600 && aShow.broadcastTime < 1700) {
                        correctDayList.add(aShow);
                    }
                    if (aShow.broadcastTime >= 1700 && aShow.broadcastTime < 2200) {
                        correctPrimeList.add(aShow);
                    }
                    if (aShow.broadcastTime >= 2200 && aShow.broadcastTime <= 2400) {
                        correctNightList.add(aShow);
                    }
                }
            }
        }
        ShowSummary answer = new ShowSummary(correctDayList, correctPrimeList, correctNightList);
        return answer;
    }

}
