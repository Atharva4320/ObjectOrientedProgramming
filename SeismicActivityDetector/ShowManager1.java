import java.util.LinkedList;

/** Class ShowManager1
 * This class handles the organization of shows into the ShowSummary format
 */
public class ShowManager1 {

    public ShowManager1() {}


     /* personal notes grader can ignore
   For problem 1
   1) create a cleaner method to remove the special shows and the (overnight = x) shows that are 1:00am <= x < 6:00am
   2) create helper method to sort the shows into 3 list for dayTime, primeTime, and nightTime
   3) last create a helper method to order all the shows for each of the 3 lists in numerical order for small to large
    numerically stands for the military time or the variable double broadcastTime
    */

    /** Method organizeShows takes in a LinkedList of Show: 'data' and produces a ShowSummary object: 'answer'
     * The loop in the method takes in the cleaned data and pareses it in to its correct list which is then used to
     * create the answer object.
     * @param data a LinkedList<Show>
     * @return a ShowSummary
     */
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

    /** Method orgShowsCleanHelper takes in a LinkedList of Show: 'data' and produces a LinkedList of Show: 'cleanData'
     * This method outputs a list with the same data as the data parameter except for all the unwanted data
     * @param data a LinkedList<Show>
     * @return a LinkedList<Show>
     */
    public LinkedList<Show> orgShowsCleanHelper(LinkedList<Show> data){
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



}
