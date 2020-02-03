import java.util.LinkedList;

/** Class Earthquake1
 * This class handles the processing of data into the MaxHzReport format
 */
public class Earthquake1 {
    public Earthquake1(){}

    // checks whether a datum is a date
    public boolean isDate(double anum) {
        return (int)anum > 10000000; }

    // extracts the month from an 8-digit date
    public int extractMonth(double dateNum) {
        return ((int)dateNum % 10000) / 100; }

    /** Method dailyMaxForMonth takes in a LinkedList<Double> data and a int month it will produce a LinkedList of
     * MaxHzReport; a MaxHzReport will contain the max value recorded from each day with data in the specified month.
     *
     * @param data is a LinkedList<Double>
     * @param month is an int
     * @return LinkedList<MaxHzReport> 'answer'
     */
    public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {
        LinkedList<MaxHzReport> answer = new LinkedList<MaxHzReport>();
        double currentDayofMonth = 0;

        int i = 0;

        while (i < data.size()) {
            double aData = data.get(i);
            if (isDate(aData)) {
                if (month == extractMonth(aData)) {
                    currentDayofMonth = aData;
                    i = creatingDataHelper(currentDayofMonth, i, data, answer);
                }
            }
            currentDayofMonth = 0;
            System.out.print(answer);
            System.out.println(i);
            i++;
        }
        return answer;
    }

    /** Method creatingDataHelper takes in: a double: currentDayofMonth, an integer: i which is the main loop counter,
     * a LinkedList<Double>: data which is the raw list of data, and the LinkedList<MaxHzReport>: answer which is the answer variable
     * After processing the parameters the method mutates the answer variable and outputs the new counter value for the main loop
     * @param gMonth double
     * @param i2 integer
     * @param data2 LinkedList<Double>
     * @param answer2 LinkedList<MaxHzReport>
     * @return an integer
     */
    public int creatingDataHelper(double gMonth, int i2, LinkedList<Double> data2, LinkedList<MaxHzReport> answer2){
        double currentMax = 0;
        for (int j = i2 + 1; j < data2.size(); j++) {

            if (data2.get(j) >= 0 && data2.get(j) <= 500 && data2.get(j) > currentMax) {
                currentMax = data2.get(j);
            }
            if ((isDate(data2.get(j)))) {
                i2 = j -1;
                break;
            }
        }
        if(!(gMonth == 0) && !(currentMax == 0)) {
            answer2.add(dailyMaxForMonthHelper(gMonth, currentMax));
        }
        return i2;
    }
    /** Method dailyMaxForMonthHelper takes in two double values: 'data' and 'measure' and produces a MaxHzReport
     *
     * @param date a double
     * @param measure a double
     * @return a MaxHzReport
     */
    public MaxHzReport dailyMaxForMonthHelper(double date, double measure){
        MaxHzReport ans = new MaxHzReport(date, measure);
        return ans;
    }

}

