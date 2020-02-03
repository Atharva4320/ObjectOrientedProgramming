import java.util.GregorianCalendar;
import java.util.LinkedList;

/** Class WeatherMonitor
 * This class has an ISet parameter and contains averageTempForMonth method, totalRainfall method, addDailyReport method
 * and cleanerHelper method.
 */
public class WeatherMonitor {

    private ISet dailyReports;

    public WeatherMonitor(ISet dailyReports) {
        this.dailyReports = dailyReports;
    }

    /** Method averageTempForMonth takes in the month and the year; and returns an average temperature for the given month
     *
     * @param month - an integer
     * @param year - an integer
     * @return - a double
     */
    public double averageTempForMonth(int month, int year) {
        return this.dailyReports.averageTempForMonth(month, year);
    }

    /** Method totalRainfallForMonth takes in the month and the year; and returns the total rainfall for the given month
     *
     * @param month - an integer
     * @param year - an integer
     * @return - a double
     */
    public double totalRainfallForMonth(int month, int year) {
        return this.dailyReports.totalRainfallForMonth(month, year);
    }

    /** Method addDailyReport takes in the date and a list of readings. It creates a new DailyWeatherReport and adds it
     * to the list of DailyWeatherReport
     *
     * @param date - a Gregorian Calender
     * @param readings - a LinkedList of Readings
     */
    public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {
        LinkedList<Double> temperature = new LinkedList<Double>();
        LinkedList<Double> rainfall = new LinkedList<Double>();
        LinkedList<Reading> clean = cleanerHelper(readings);

        if (clean.size() > 0) {
            for (Reading aReading : clean) {
                temperature.add(aReading.getTempInF());
                rainfall.add(aReading.getRainfall());
            }

            DailyWeatherReport aReport = new DailyWeatherReport(date, temperature, rainfall);
            dailyReports.addElt(aReport);
        }
    }

    // This was not a requirement for the assignment but we decided to use the time value to help find duplicated data.
    // cleans data by removing any reading that has duplicated time stamps or that has unrealistic data.

    /** Method cleanerHelper takes in a list of readings and outputs a list of readings with clean data.
     *
     * @param readings - LinkedList of Readings
     * @return - LinkedList of Readings
     */
    public LinkedList<Reading> cleanerHelper(LinkedList<Reading> readings) {
        LinkedList<Reading> clean = new LinkedList<Reading>();
        int i = 0;
        int a = 0;
        int size = readings.size();

        while (a <= 0 && i < size) {
            if (readings.get(i).getRainfall() >= 0 && readings.get(i).getRainfall() <= 463.7) {
                if (readings.get(i).getTempInF() >= -126 && readings.get(i).getTempInF() <= 136) {
                    clean.add(readings.get(i));
                    a++;
                }
            }
            i++;
        }
        if (!(i == size - 1)) {

            // boolean noIncorrectData = false;
            for (Reading aReading : readings) {
                Reading currentReading = aReading;
                boolean noDuplicate = true;
                /*VARIABLES WERE HERE*/
                for (Reading aData : clean) {
                    // These are researched realistic bounds for rainfall
                    if (aData.getRainfall() >= 0 && aData.getRainfall() <= 500) {// the 500 was rounded up from 463.7 in
                        // These are researched realistic bounds for temperature
                        if (aData.getTempInF() >= -126 && aData.getTempInF() <= 136) {
                            if (aData.getTime().isSame(currentReading.getTime())) {
                                noDuplicate = false;
                                // noIncorrectData = true;
                                break;
                            }
                        }
                        // noIncorrectData = true;
                    }
                }
                if (noDuplicate /*&& noIncorrectData*/) {
                    clean.add(aReading);
                }
            }
        }
        return clean;
    }


}