import java.util.LinkedList;

/** Class Earthquake2
 * This class handles the processing of data into the MaxHzReport format
 */
public class Earthquake2 {
    public Earthquake2(){}

    // checks whether a datum is a date
    boolean isDate(double anum) { return (int)anum > 10000000; }
    // extracts the month from an 8-digit date
    int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }

/* Personal notes grader can ignore
    // Method begiens
    // state variables like maxData which will be start at 0 and will hold the largest reading value
    // use nested for loops
    // or use for loop with a while loop
    // us index i for outer nad j for innner
    // outer look for date at i position
    // inner is j=i+1 so its starts checking for data
    // then comparing and looking for the largest
    // only need one variable that will be replace only if a bigger data appears
    // when a Date data appears stop and change the i to equal j
    // then right after the inner for loop exits
    // create the new report to be put in the list of reports
    // then clear the maxData variable
 */
    /** Method dailyMaxForMonth takes in a LinkedList<Double> data and a int month it will produce a LinkedList of
     * MaxHzReport; a MaxHzReport will contain the max value recorded from each day with data in the specified month.
     *
     * @param data is a LinkedList<Double>
     * @param month is an int
     * @return LinkedList<MaxHzReport> 'answer'
     */
    public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {
        LinkedList<MaxHzReport> answer = new LinkedList<MaxHzReport>();
        boolean goodData = false;
        double currentDayofMonth = 0;
        double currentMax = 0;


        for (int i = 0; i < data.size(); i++) {

            double aData = data.get(i);

            if (isDate(aData)) {
                if (month == extractMonth(aData)) {
                    currentDayofMonth = aData;
                    for (int j = i + 1; j < data.size(); j++) {

                        if (data.get(j) >= 0 && data.get(j) <= 500 && data.get(j) > currentMax) {
                            currentMax = data.get(j);
                        }
                        if ((isDate(data.get(j)))) {
                            i = j -1;
                            break;
                        }
                    }
                    if(!(currentDayofMonth == 0) && !(currentMax == 0)) {
                        answer.add(dailyMaxForMonthHelper(currentDayofMonth, currentMax));
                        currentDayofMonth = 0;
                        currentMax = 0;
                    }
                }
            }
            System.out.print(answer);
            System.out.println(i);

        }
        return answer;
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