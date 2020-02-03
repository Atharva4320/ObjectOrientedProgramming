import java.util.GregorianCalendar;
import java.util.LinkedList;

/** Class DailyWeatherReport handles all operations that need information about the data in a DailyWeatherReport object
 *
 */
public class DailyWeatherReport{

    private GregorianCalendar date;
    private LinkedList<Double> temperature;
    private LinkedList<Double> rainfall;

    public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> temperature, LinkedList<Double> rainfall) {
        this.date = date;
        this.temperature = temperature;
        this.rainfall = rainfall;
    }
//Only used for testing

    /**Method equals1 takes in a DailyWeatherReport object and compares it to the current one and checks to make sure
     * that they have the same date. If they have the same date that means they have the same data because there are
     * no duplicated dates. If the dates are the same it outputs true if not false.
     *
     * @param aReport a DailyWeatherReport
     * @return a boolean
     */
    public boolean equals1(DailyWeatherReport aReport){
        boolean ansFinal = false;
        if(this.date.equals(aReport.date)) {
            ansFinal = true;
        }
        else {
            ansFinal = false;}
        if(ansFinal){
            return true;}
        else {
            return false;}
    }

    /**Method dateCheck takes in two ints month and year and it outputs true if the given date matches the current date
     * and false otherwise.
     *
     * @param month int
     * @param year int
     * @return boolean
     */
    public boolean dateCheck(int month, int year){
        if(date.get(GregorianCalendar.MONTH) == month && date.get(GregorianCalendar.YEAR) == year){
            return true;
        }
        else {
            return false;
        }
    }

    /**Method avgDailyTemp produces the average temperature for a day from the given list of temperature readings
     *
     * @return double
     */
    public double avgDailyTemp(){
        double total = 0;

        for (Double aReading: temperature){
            total = total + aReading;
        }
        total = total/temperature.size();
        return total;
    }

    /**Method totalDailyRainfall produces the total rainfall for a day from the given list of rainfall readings
     *
     * @return double
     */
    public double totalDailyRainfall(){
        double total = 0;

        for (Double aReading: rainfall){
            total = total + aReading;
        }
        return total;
    }


}