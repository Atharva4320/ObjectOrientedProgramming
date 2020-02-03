import java.util.LinkedList;

/** Class DataSmooth1
 * This class handles the smoothing of data from shows
 */
public class DataSmooth1 {
   public DataSmooth1(){}

    /** Method dataSmooth takes in a LinkedList of Show: "data" and it produces a LinkedList of Double: 'smoothData"
     * SmoothData is a list of averaged show runtime averages.
     * @param data a LinkedList<Show>
     * @return a LinkedList<Double> smoothData
     */
    public LinkedList<Double> dataSmooth(LinkedList<Show> data){
       LinkedList<Double> smoothData = new LinkedList<Double>();

       if(data.size() > 2) {
           smoothData.add(dataSmoothHelper(data.getFirst().episodes));
           for (int i = 1; i < data.size() - 1; i++) {
               double total = 0;
               total = dataSmoothHelper(data.get(i - 1).episodes) + dataSmoothHelper(data.get(i).episodes) + dataSmoothHelper(data.get(i + 1).episodes);
               total = total / 3;
               smoothData.add(total);
           }
           smoothData.add(dataSmoothHelper(data.getLast().episodes));

           return smoothData;
       }
       else if(data.size() > 1){
           smoothData.add(dataSmoothHelper(data.getFirst().episodes));
           smoothData.add(dataSmoothHelper(data.getLast().episodes));
           return smoothData;
       }
       else if(data.size() > 0){
           smoothData.add(dataSmoothHelper(data.getFirst().episodes));
           return smoothData;
       }
       else {
           return smoothData;
       }
    }

    /** Method dataSmoothHelper takes in a LinkedList of Episode: 'data' and returns a double
     *
     * @param data a LinkedList<Episode>
     * @return a double
     */
    public double dataSmoothHelper(LinkedList<Episode> data){
       double total = 0;
       double size = data.size();
    if(data.size() > 0) {
        for (Episode aEP : data) {
            total = total + aEP.runTime;
        }
        total = total / size;
    }
    else{
        total = 0;
    }
       return total;
    }
}