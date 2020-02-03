import java.util.LinkedList;

/**
 * Class LLDailyReport it handles operations that use, modify, or call a LinkedList<DailyWeatherReport>
 */
public class LLDailyReport implements ISet {
    private LinkedList<DailyWeatherReport> reportList;

    public LLDailyReport(LinkedList<DailyWeatherReport> reportList) {
        this.reportList = reportList;
    }

    public int size() {
        return reportList.size();
    }
// Only for testing

    /**
     * Method equals2 takes in a LLDailyReport and compares it to the current one and if they are equal
     * output true
     *
     * @param aReportList a LLDailyReport
     * @return a boolean
     */
    public boolean equals2(LLDailyReport aReportList) {
        boolean ans = true;
        for (int i = 0; i < aReportList.size(); i++) {
            if (this.reportList.get(i).equals1(aReportList.reportList.get(i))) {
                ans = true;
            } else {
                ans = false;
                break;
            }
        }
        return ans;
    }

    /**
     * Method addElt takes in a DailyWeatherReport and adds it to a LinkedList of DailyWeatherReports
     *
     * @param aReport a DailyWeatherReport
     */
    public void addElt(DailyWeatherReport aReport) {
        this.reportList.add(aReport);
    }

    /**
     * Method averageTempForMonth takes in two ints month and year they are used to select all the DailyWeatherReports that
     * are in the correct month and year. Then it collects all the recoded daily average temperatures and averages all
     * of them together to get the monthly average temperature. Which it produces as a double.
     *
     * @param month int
     * @param year  int
     * @return double
     */
    public double averageTempForMonth(int month, int year) {
        double monthlyAvg = 0.0;
        double total = 0;
        LinkedList<Double> goodAverages = new LinkedList<Double>();
        if (reportList.size() > 0) {
            for (DailyWeatherReport aReport : reportList) {
                if (aReport.dateCheck(month, year)) {
                    goodAverages.add(aReport.avgDailyTemp());
                }
            }
            if (goodAverages.size() > 0) {
                for (Double avgs : goodAverages) {
                    total = total + avgs;
                }
                monthlyAvg = monthlyAvg + total / goodAverages.size();
                return monthlyAvg;
            } else {
                return -998;// stands for good data but no relevant data
            }
        } else {
            return -999;// stands for empty list of data
        }
    }

    /**
     * Method totalRainfallForMonth takes in two ints month and year they are used to select all the DailyWeatherReports
     * that are in the correct month and year. Then it collects all the recoded total daily rainfalls to get the
     * total monthly rainfall. Which it produces as a double.
     *
     * @param month int
     * @param year  int
     * @return double
     */
    public double totalRainfallForMonth(int month, int year) {
        double totalMonthly = 0.0;
        LinkedList<Double> goodData = new LinkedList<Double>();
        if (reportList.size() > 0) {
            for (DailyWeatherReport aReport : reportList) {
                if (aReport.dateCheck(month, year)) {
                    goodData.add(aReport.totalDailyRainfall());
                }
            }
            if (goodData.size() > 0) {
                for (Double aTotal : goodData) {
                    totalMonthly = totalMonthly + aTotal;
                }

                return totalMonthly;
            } else {
                return -998;// stands for good data but no relevant data
            }
        } else {
            return -999;// stands for empty list of data
        }
    }

}
