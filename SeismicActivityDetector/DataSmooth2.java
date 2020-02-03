import java.util.LinkedList;

/** Class DataSmooth2
 * This class handles the smoothing of data from shows
 */
public class DataSmooth2 {
    public DataSmooth2(){}

    /** Method avgShowLength Takes in a list of shows and outputs a list of average length of shows.(i.e. takes an average
     *  of runTime of episodes in a show using dataSmoothHelper() method.)
     *
     * @param shows a LinkedList<Show>
     * @return a LinkedList<Double>
     */
    public LinkedList<Double> avgShowLength (LinkedList<Show> shows) {
                LinkedList<Double> episodesOnly = new LinkedList<Double>();
                for (int i = 0; i < shows.size(); i++) {
                    episodesOnly.add(dataSmoothHelper(shows.get(i).episodes)); // calling the dataSmoothHelper method to get the average of runTime from list of episodes.
                }
                return episodesOnly;
            }

    /** Method dataSmoothHelper Takes in a list of episodes and outputs the average of the runTime of all episodes.
     *
      * @param data a LinkedList<Episode>
     * @return a double
     */
    public Double dataSmoothHelper(LinkedList<Episode> data) {
                double total = 0;
                double size = data.size();
                if(data.size() > 0) {
                    for (Episode aEP : data) {
                        total = total + aEP.runTime;
                    }
                    total = total / size;
                }
                else {
                    total = 0;
                }
                return total;
            }

    /** Method smoothingOfData Takes in a list of Double and outputs another list of double with smooth data.
     *
     * @param avgRuntime a LinkedList<Double>
     * @return a LinkedList<Double>
     */
    public  LinkedList<Double> smoothingOfData (LinkedList<Double> avgRuntime) {
                LinkedList <Double> smoothData = new LinkedList<Double>();
                for (int j = 0; j < avgRuntime.size(); j++) {
                    if (j==0) {
                        smoothData.add(avgRuntime.get(j));
                    }
                    else if (j==avgRuntime.size()-1) {
                        smoothData.add(avgRuntime.get(j));
                    }
                    else {
                        double total;
                        total = avgRuntime.get(j - 1) + avgRuntime.get(j) + avgRuntime.get(j + 1);
                        total = total / 3;
                        smoothData.add(total);
                    }
                }

                return smoothData;
            }
            // Final method

    /** Method dataSmooth takes in a LinkedList of Show: 'shows' and produces a LinkedList of Double which is a list
     *  of averaged show runtime averages.
     *
     * @param shows a LinkedList<Show>
     * @return a LinkedList<Double>
     */
    public LinkedList<Double> dataSmooth (LinkedList<Show> shows) {
               return smoothingOfData(avgShowLength(shows));
            }

}